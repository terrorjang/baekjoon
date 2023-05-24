package greedy;
// 1080

// Silver I

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arrA = new char[N][M];
        char[][] arrB = new char[N][M];
        // 3 X 3
        for (int i = 0; i < N; i++) {
            arrA[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            arrB[i] = br.readLine().toCharArray();
        }

        int count = 0;

        for (int ri = 0; ri < N - 2; ri++) {
            for (int ci = 0; ci < M - 2; ci++) {
                if (arrA[ri][ci] == arrB[ri][ci]) {
                    continue;
                }
                reverse(ri, ci, arrA);
                count++;
            }
        }

        for (int ri = 0; ri < N; ri++) {
            for (int ci = 0; ci < M; ci++) {
                if (arrA[ri][ci] != arrB[ri][ci]) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(count);
    }

    public static void reverse(int r, int c, char[][] arr) {
        for (int ri = 0; ri < 3; ri++) {
            for (int ci = 0; ci < 3; ci++) {
                arr[r + ri][c + ci] = arr[r + ri][c + ci] == '1' ? '0' : '1';
            }
        }

    }
}
