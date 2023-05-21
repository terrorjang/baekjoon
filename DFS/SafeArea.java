package DFS;
// 2468

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SafeArea {
    static int N;
    static int[][] arr;
    static boolean[][] arr2;
    static boolean[][] visit;

    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        int limit = 0;
        for (int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(tmp[j]);
                limit = Math.max(limit, arr[i][j]);
            }
        }

        int max = 0;

        for (int min = 1; min < limit; min++) {
            int count = 0;
            visit = new boolean[N][N];
            arr2 = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr2[i][j] = arr[i][j] > min;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (visit[i][j] == false && arr2[i][j] == true) {
                        DFS(i, j);
                        count++;
                    }
                }
            }
            System.out.println("max: " + max + ", count: " + count);
            max = Math.max(max, count);

        }
        System.out.println(max);
    }

    public static void DFS(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (visit[nx][ny] == false && arr2[nx][ny] == true) {
                    DFS(nx, ny);
                }
            }
        }
    }

}
