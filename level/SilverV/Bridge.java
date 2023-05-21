package level.SilverV;
// Silver V, 1010

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge {
    static int dp[][] = new int[30][30];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            long count = 0;
            count = combi(M, N);

            System.out.println(count);
        }

    }

    public static int combi(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

}
