package DFS;
// 1520

// Gold III

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Downhill {
    private static int[][] arr;
    private static int[][] dp;
    private static boolean[][] visit;
    private static int M;
    private static int N;
    private static int[] dx = { 0, 0, 1, -1 };
    private static int[] dy = { 1, -1, 0, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[M][N];
        dp = new int[M][N];
        visit = new boolean[M][N];

        for (int yi = 0; yi < M; yi++) {
            st = new StringTokenizer(br.readLine());
            for (int xi = 0; xi < N; xi++) {
                arr[yi][xi] = Integer.parseInt(st.nextToken());
            }
        }

        // DFS(0, 0);
        System.out.println(DFS(0, 0));
    }

    public static int DFS(int x, int y) {
        if (x == N - 1 && y == M - 1) {
            return 1;
        }

        if (visit[y][x]) {
            return dp[y][x];
        }

        visit[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (checkRange(nx, ny) && arr[y][x] > arr[ny][nx]) {
                dp[y][x] += DFS(nx, ny);
            }
        }

        return dp[y][x];
    }

    private static boolean checkRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < M) {
            return true;
        }

        return false;
    }

}
