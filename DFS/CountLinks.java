package DFS;
// 11724

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountLinks {
    static int N, M;
    static boolean arr[][];
    static boolean visit[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        N = Integer.parseInt(tmp[0]);
        M = Integer.parseInt(tmp[1]);
        arr = new boolean[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            tmp = br.readLine().split(" ");
            int n1 = Integer.parseInt(tmp[0]);
            int n2 = Integer.parseInt(tmp[1]);

            arr[n1][n2] = arr[n2][n1] = true;
        }

        int count = 0;
        for (int i = 1; i < N + 1; i++) {
            if (visit[i] == false) {
                DFS(i);
                count++;
            }
        }
        System.out.println(count);

    }

    public static void DFS(int i) {
        visit[i] = true;
        for (int j = 1; j < N + 1; j++) {
            if (visit[j] == false && arr[i][j] == true) {
                DFS(j);
            }
        }
    }

}
