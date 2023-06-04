package DFS;
// 1926

// Silver I

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Picture {
    private static int[][] arr;
    private static boolean[][] visit;
    private static int[] dx = { 0, 0, 1, -1 };
    private static int[] dy = { 1, -1, 0, 0 };
    private static int n;
    private static int m;
    private static int count = 0;
    private static int current = 0;
    private static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int yi = 0; yi < n; yi++) {
            for (int xi = 0; xi < m; xi++) {
                if (visit[yi][xi] || arr[yi][xi] == 0) {
                    continue;
                }
                current = 0;
                DFS(xi, yi);
                max = Math.max(max, current);
                count++;
            }
        }

        System.out.println(count + "\n" + max);
    }

    public static void DFS(int x, int y) {
        visit[y][x] = true;
        current++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < m && ny >= 0 && ny < n && visit[ny][nx] == false && arr[ny][nx] == 1) {
                DFS(nx, ny);
            }
        }
    }

}
