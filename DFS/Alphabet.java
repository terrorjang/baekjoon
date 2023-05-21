package DFS;
// 1987

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Alphabet {
    static int R, C;
    static char[][] arr;
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
    static int max;
    static HashSet<Character> set;
    static boolean[] alpha;

    public static void main(String[] args) throws Exception {

        int cnt = 'Z' - 'A' + 1;
        alpha = new boolean[cnt];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[R][C];

        for (int i = 0; i < R; i++) {
            String line = br.readLine();

            for (int j = 0; j < C; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        // max = 1;
        set = new HashSet<>();
        DFS(0, 0, 0);
        System.out.println(max);

    }

    public static void DFS(int x, int y, int count) {
        int i = arr[x][y] - 'A';
        if (alpha[i]) {
            max = Math.max(max, count);
            return;
        }
        alpha[i] = true;

        for (int j = 0; j < 4; j++) {
            int nx = x + dx[j];
            int ny = y + dy[j];

            if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
                DFS(nx, ny, count + 1);
            }
        }
        alpha[i] = false;

    }
}
