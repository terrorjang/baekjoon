package BFS;
// 1707

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BinaryGraph {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int j = 0; j < V + 1; j++) {
                graph.add(new ArrayList<>());
            }

            int[] group = new int[V + 1];

            for (int ei = 0; ei < E; ei++) {
                st = new StringTokenizer(br.readLine());
                int n1 = Integer.parseInt(st.nextToken());
                int n2 = Integer.parseInt(st.nextToken());

                graph.get(n1).add(n2);
                graph.get(n2).add(n1);
            }

            String answer = "YES";

            for (int j = 1; j < V + 1; j++) {
                if (group[j] > 0) { // 1 or 2
                    continue;
                }
                Queue<Integer> q = new LinkedList<>();
                q.add(j);
                group[j] = 1;
                while (q.size() > 0) {
                    int n = q.poll();
                    int g = group[n];
                    int g2 = 1;
                    if (g == 1) {
                        g2 = 2;
                    }

                    graph.get(j);
                    for (Integer num : graph.get(n)) {
                        if (group[num] == 0) {
                            group[num] = g2;
                            q.add(num);
                        } else {
                            if (group[num] == g) {
                                answer = "NO";

                                q.clear();
                                j = V + 2;
                                break;
                            }
                        }

                    }
                }
            }

            System.out.println(answer);

        }

    }

}
