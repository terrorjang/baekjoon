package greedy;

// 1781
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class CupRamen {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int problems = Integer.parseInt(br.readLine());
        int[][] arr = new int[problems][2];

        for (int i = 0; i < problems; i++) {
            String[] tmp = br.readLine().split(" ");

            arr[i][0] = Integer.parseInt(tmp[0]);
            arr[i][1] = Integer.parseInt(tmp[1]);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            }
            return o1[0] - o2[0];

        });

        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int[] ramen : arr) {
            if (q.size() < ramen[0]) {
                q.offer(ramen[1]);
            } else if (q.size() == ramen[0]) {

                if (q.peek() < ramen[1]) {
                    q.poll();
                    q.offer(ramen[1]);
                }
            }

        }

        while (!q.isEmpty()) {
            answer += q.poll();
        }

        System.out.println(answer);
    }
}
