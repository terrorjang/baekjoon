package prefix_sum;
// 11660

// Silver I

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfSubArray5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][N + 1];
        int[][] dp = new int[N + 1][N + 1];
        for (int yi = 1; yi <= N; yi++) {
            st = new StringTokenizer(br.readLine());
            for (int xi = 1; xi <= N; xi++) {
                dp[yi][xi] = arr[yi][xi] = Integer.parseInt(st.nextToken());
                dp[yi][xi] = arr[yi][xi] + dp[yi - 1][xi] + dp[yi][xi - 1] + dp[yi - 1][xi - 1];

                // if (yi > 0) {
                // dp[yi][xi] += dp[yi - 1][xi];
                // }
                // if (xi > 0) {
                // dp[yi][xi] += dp[yi][xi - 1];
                // }
                // if (yi > 0 && xi > 0) {
                // dp[yi][xi] -= dp[yi - 1][xi - 1];
                // }
            }
        }

        for (int count = 0; count < M; count++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // int sum = dp[y2 - 1][x2 - 1];
            int sum = dp[y2][x2] - dp[y2][x1 - 1] - dp[y1 - 1][x2] + dp[y1 - 1][x1 - 1];
            // if (x1 > 1) {
            // sum -= dp[y2 - 1][x1 - 2];
            // }
            // if (y1 > 1) {
            // sum -= dp[y1 - 2][x2 - 1];
            // }
            // if (y1 > 1 && x1 > 1) {
            // sum += dp[y1 - 2][x1 - 2];
            // }

            System.out.println(sum);
        }

    }

}
