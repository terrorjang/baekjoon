package greedy;
// 1700

// Gold I
// FAILED
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class MultitapSchedule_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] counts = new int[K + 1];
        int[] lastUse = new int[K + 1];
        int[] order = new int[K];
        int unplug = 0;
        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < order.length; i++) {
            order[i] = Integer.parseInt(st.nextToken());
            counts[order[i]]++;
            lastUse[order[i]] = i;
        }

        for (int i = 0; i < order.length; i++) {
            int current = order[i];
            counts[current]--;
            if (set.contains(order[i]))
                continue;

            if (set.size() < N) {
                set.add(order[i]);
                continue;
            }

            // priority
            int target = -1;
            int max = 0;
            for (Integer num : set) {
                if (lastUse[num] < i) {
                    target = num;
                    break;
                }

                if (target == -1) {
                    if (max < lastUse[num]) {
                        max = lastUse[num];
                        target = num;
                    }
                }
            }
            set.remove(target);
            set.add(current);
            unplug++;
        }

        System.out.println(unplug);

    }

}
