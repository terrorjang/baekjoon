package DFS;
// 10026

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RGB {
    static char[][] arr;
    static int N;
    static int count1;
    static int count2;
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
    static boolean[][] visit1;
    static boolean[][] visit2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N][];
        visit1 = new boolean[N][N];
        visit2 = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visit1[i][j] == false) {
                    DFS1(i, j);
                    count1++;
                }
            }
        }
        System.out.println(count1);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visit2[i][j] == false) {
                    DFS2(i, j);
                    count2++;
                }
            }
        }

        System.out.println(count2);
    }

    public static void DFS2(int x, int y) {
        visit2[x][y] = true;

        char c = arr[x][y];
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (visit2[nx][ny]) {
                    continue;
                }
                if (c == arr[nx][ny]) {
                    DFS2(nx, ny);
                }
            }
        }
    }

    public static void DFS1(int x, int y) {
        visit1[x][y] = true;

        char c = arr[x][y];
        if (c == 'G') {
            arr[x][y] = 'R';
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (visit1[nx][ny]) {
                    continue;
                }
                if (c == arr[nx][ny]) {
                    DFS1(nx, ny);
                }
            }
        }
    }
}
