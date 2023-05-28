package DFS;
// 1260

// Silver II

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsAndBfs {
    private static boolean visit[];
    private static boolean edges[][];
    private static List<Integer> dfsList;
    private static List<Integer> bfsList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        visit = new boolean[N + 1];
        edges = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            edges[n1][n2] = edges[n2][n1] = true;
        }
        dfsList = new LinkedList<>();
        DFS(V);

        for (Integer i : dfsList) {
            System.out.print(i + " ");
        }
        System.out.println();

        visit = new boolean[N + 1];

        bfsList = new LinkedList<>();
        BFS(V);

        for (Integer i : bfsList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void DFS(int node) {
        if (visit[node]) {
            return;
        }

        visit[node] = true;
        dfsList.add(node);

        for (int i = 1; i < edges[node].length; i++) {
            if (edges[node][i] == false || visit[i] == true)
                continue;

            DFS(i);

        }
    }

    public static void BFS(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);

        while (q.size() > 0) {
            int n = q.poll();
            bfsList.add(n);
            visit[n] = true;
            for (int i = 1; i < edges[n].length; i++) {
                if (edges[n][i] == false || visit[i] == true)
                    continue;

                if (q.contains(i))
                    continue;

                q.add(i);
            }

        }

    }

}
