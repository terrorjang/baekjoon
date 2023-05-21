package BFS;
// 2206

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Maze {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];
        int[][] min_count = new int[N][M];
        for (int i = 0; i < N; i++) {

            Arrays.fill(min_count[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        Queue<Integer> qi = new LinkedList<>();
        Queue<Integer> qj = new LinkedList<>();
        Queue<Integer> new_qi = new LinkedList<>();
        Queue<Integer> new_qj = new LinkedList<>();

        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };

        qi.add(0);
        qj.add(0);
        int count = 1;

        while (true) {
            new_qi.clear();
            new_qj.clear();
            count++;

            while (qi.size() > 0) {
                int x = qi.poll();
                int y = qj.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx == N - 1 && ny == M - 1) {
                        System.out.println(count);
                        return;
                    }

                    if (nx >= 0 && ny >= 0 && nx < N && ny < M && count < min_count[nx][ny] && arr[nx][ny] == '0') {
                        new_qi.add(nx);
                        new_qj.add(ny);
                        min_count[nx][ny] = count;
                    }
                }
            }
            if (new_qi.size() == 0) {
                break;

            }
            qi = new LinkedList<>(new_qi);
            qj = new LinkedList<>(new_qj);

        }

        System.out.println(-1);
    }
}
