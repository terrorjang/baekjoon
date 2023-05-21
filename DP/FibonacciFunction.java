package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciFunction {
    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            arr = new int[N + 1][2];

            for (int j = 0; j < N + 1; j++) {
                if (j == 0) {
                    arr[j][0] = 1;
                } else if (j == 1) {
                    arr[j][1] = 1;
                } else {
                    arr[j][0] = arr[j - 2][0] + arr[j - 1][0];
                    arr[j][1] = arr[j - 2][1] + arr[j - 1][1];
                }
            }

            System.out.println(arr[N][0] + " " + arr[N][1]);
        }
    }

}
