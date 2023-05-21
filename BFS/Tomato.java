package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    static int M, N, days;
    static int[][] arr;
    static boolean[][] visit;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visit = new boolean[N][M];

        Queue<Integer> qi = new LinkedList<>();
        Queue<Integer> qj = new LinkedList<>();
        Queue<Integer> new_qi = new LinkedList<>();
        Queue<Integer> new_qj = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    qi.add(i);
                    qj.add(j);
                }
            }
        }

        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };
        while (true) {
            new_qi.clear();
            new_qj.clear();

            while (qi.size() > 0) {
                int x = qi.poll();
                int y = qj.poll();
                visit[x][y] = true;
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx >= 0 && ny >= 0 && nx < N && ny < M) {

                        if (visit[nx][ny] == false && arr[nx][ny] == 0) {
                            arr[nx][ny] = 1;
                            new_qi.add(nx);
                            new_qj.add(ny);
                        }
                    }

                }
            }
            if (new_qi.size() == 0) {
                break;
            } else {
                qi = new LinkedList<>(new_qi);
                qj = new LinkedList<>(new_qj);
                days++;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(days);
    }

    public static void BFS(int x, int y) {

    }
}
