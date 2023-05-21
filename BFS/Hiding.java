package BFS;
//1697

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Hiding {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> nq = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        set.add(N);
        q.add(N);
        if (N == K) {
            System.out.println(0);
            return;
        }
        int count = 0;

        int[] d = { -1, 1, 0 };

        while (true) {
            nq.clear();
            while (q.size() > 0) {
                int n = q.poll();

                d[2] = n;
                for (int i = 0; i < 3; i++) {

                    int num = d[i] + n;
                    if (num == K) {
                        System.out.println(count + 1);
                        return;
                    }
                    if (num >= 0 && num <= 100000 && !set.contains(num)) {
                        set.add(num);
                        nq.add(num);
                    }
                }
            }
            if (nq.isEmpty()) {
                break;
            }
            count++;

            q = new LinkedList<>(nq);
        }

    }

}
