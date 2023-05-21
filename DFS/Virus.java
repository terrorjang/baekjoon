package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int links = Integer.parseInt(br.readLine());

        // create graph
        int[][] arr = new int[n + 1][n + 1];

        for (int i = 0; i < links; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }
        boolean[] visit = new boolean[n + 1];
        visit[1] = true;

        Queue<Integer> q = new LinkedList<>();

        q.add(1);

        int count = 0;
        while (q.size() > 0) {
            int v = q.poll();
            for (int i = 1; i <= n; i++) {
                if (arr[v][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    q.add(i);
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
