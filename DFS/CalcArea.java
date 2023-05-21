package DFS;
// 2583

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CalcArea {
    static int M, N, K, count;
    static boolean[][] arr;
    static boolean[][] visit;
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
    static LinkedList<Integer> answer = new LinkedList<>();
    static int max = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new boolean[M][N];
        visit = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            int rx = Integer.parseInt(st.nextToken());
            int ry = Integer.parseInt(st.nextToken());

            for (int xi = lx; xi < rx; xi++) {
                for (int yi = ly; yi < ry; yi++) {
                    arr[yi][xi] = true;
                }
            }
        }

        for (int xi = 0; xi < N; xi++) {
            for (int yi = 0; yi < M; yi++) {
                if (visit[yi][xi] == false && arr[yi][xi] == false) {
                    count = 0;
                    DFS(xi, yi, 0);
                    answer.add(count);
                }

            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        StringBuilder sb = new StringBuilder();
        for (int i : answer) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void DFS(int x, int y, int c) {
        count++;
        visit[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (visit[ny][nx] == false && arr[ny][nx] == false) {
                    DFS(nx, ny, c + 1);
                }
            }
        }
    }
}
