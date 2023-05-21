package DFS;
// 4963

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountIsland {
    static int w, h;
    static boolean[][] arr;
    static boolean[][] visit;

    static int[] dx = { 0, 0, -1, 1, -1, -1, 1, 1 };
    static int[] dy = { -1, 1, 0, 0, -1, 1, -1, 1 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] tmp = br.readLine().split(" ");
            w = Integer.parseInt(tmp[0]);
            h = Integer.parseInt(tmp[1]);

            if (w == 0 && h == 0) {
                break;
            }

            arr = new boolean[h][w];
            visit = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                tmp = br.readLine().split(" ");

                for (int j = 0; j < w; j++) {
                    arr[i][j] = tmp[j].equals("1");
                }

            }
            int count = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (visit[i][j] == false && arr[i][j] == true) {
                        DFS(i, j);
                        count++;
                    }

                }
            }
            System.out.println(count);

        }

    }

    public static void DFS(int x, int y) {
        // y - h, x - w
        visit[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                if (!visit[nx][ny] && arr[nx][ny] == true) {
                    DFS(nx, ny);
                }
            }
        }
    }
}
