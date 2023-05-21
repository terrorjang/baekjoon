package BFS;
// 13549

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Hiding2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> tq = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.add(N);
        tq.add(0);
        set.add(N);

        int time = 0;

        int[] d = { -1, +1, N };
        int[] dt = { 1, 1, 0 };
        while (q.size() > 0) {
            int n = q.poll();
            int t = tq.poll();
            if (n == K) {
                time = t;
                break;
            }
            d[2] = n;

            for (int i = 0; i < 3; i++) {
                int next = n + d[i];
                int next_time = t + dt[i];

                if (next < 0 || next > 100000 || set.contains(next)) {
                    continue;
                }

                q.add(next);
                tq.add(next_time);
                set.add(next);
            }
        }

        System.out.println(time);
    }
}
