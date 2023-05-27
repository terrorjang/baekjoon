package prefix_sum;
// 2167

// Silver V

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOf2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N + 1][M + 1];
        int dp[][] = new int[N + 1][M + 1];

        for (int yi = 1; yi <= N; yi++) {
            st = new StringTokenizer(br.readLine());
            for (int xi = 1; xi <= M; xi++) {
                arr[yi][xi] = Integer.parseInt(st.nextToken());
                dp[yi][xi] = arr[yi][xi] + dp[yi - 1][xi] + dp[yi][xi - 1] - dp[yi - 1][xi - 1];
            }
        }

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            int sum = dp[y2][x2] - dp[y1 - 1][x2] - dp[y2][x1 - 1] + dp[y1 - 1][x1 - 1];

            System.out.println(sum);
        }

    }

}
