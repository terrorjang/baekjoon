package DFS;
// 2667

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DanjiNumber {
    static int arr[][];
    static boolean visit[][];
    static int dirX[] = { 0, 0, -1, 1 };
    static int dirY[] = { -1, 1, 0, 0 };

    static int count, n;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<>();

        arr = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            for (int j = 0; j < n; j++) {
                if (line.charAt(j) == '1') {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visit[i][j] == false && arr[i][j] == 1) {
                    count = 0;
                    DFS(i, j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        StringBuffer sb = new StringBuffer();
        sb.append(answer.size()).append("\n");
        for (Integer integer : answer) {
            sb.append(integer).append("\n");
        }

        System.out.println(sb.toString());
        return;
    }

    public static void DFS(int x, int y) {
        visit[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int nextX = x + dirX[i];
            int nextY = y + dirY[i];

            if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
                if (visit[nextX][nextY] == false && arr[nextX][nextY] == 1) {
                    DFS(nextX, nextY);
                }
            }
        }
    }
}
