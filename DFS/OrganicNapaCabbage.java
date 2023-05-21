package DFS;
// 1012

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrganicNapaCabbage {
    static boolean[][] visit;
    static boolean[][] arr;
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
    static int M, N, K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] tmp = br.readLine().split(" ");
            M = Integer.parseInt(tmp[0]);
            N = Integer.parseInt(tmp[1]);
            K = Integer.parseInt(tmp[2]);

            arr = new boolean[M][N];
            visit = new boolean[M][N];
            int[][] index = new int[K][2];

            for (int j = 0; j < K; j++) {
                tmp = br.readLine().split(" ");
                int xi = Integer.parseInt(tmp[0]);
                int yi = Integer.parseInt(tmp[1]);
                arr[xi][yi] = true;
                index[j][0] = xi;
                index[j][1] = yi;
            }
            int count = 0;

            for (int[] xy : index) {
                int xi = xy[0];
                int yi = xy[1];
                if (visit[xi][yi] == false && arr[xi][yi] == true) {
                    DFS(xi, yi);
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void DFS(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (visit[nx][ny] == false && arr[nx][ny] == true) {
                    DFS(nx, ny);
                }
            }
        }

    }
}
