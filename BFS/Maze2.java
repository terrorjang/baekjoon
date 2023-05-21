package BFS;
// 2178

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Maze2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] min_count = new int[N][M];
        char[][] arr = new char[N][];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
            Arrays.fill(min_count[i], Integer.MAX_VALUE);
        }
        min_count[0][0] = 0;

        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        Queue<Integer> new_qx = new LinkedList<>();
        Queue<Integer> new_qy = new LinkedList<>();

        qx.add(0);
        qy.add(0);

        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };

        int count = 0;
        while (true) {
            new_qx.clear();
            new_qy.clear();
            count++;

            while (qx.size() > 0) {
                int x = qx.poll();
                int y = qy.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx == M - 1 && ny == N - 1) {
                        System.out.println(count + 1);
                        return;
                    }

                    if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                        if (arr[ny][nx] == '1' && count < min_count[ny][nx]) {
                            new_qx.add(nx);
                            new_qy.add(ny);
                            min_count[ny][nx] = count;
                        }

                    }

                }

            }
            if (new_qx.size() == 0) {
                break;
            }
            qx = new LinkedList<>(new_qx);
            qy = new LinkedList<>(new_qy);

        }
        System.out.println(-1);

    }

}
