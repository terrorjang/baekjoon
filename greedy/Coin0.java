package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Coin0 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NK = br.readLine().split(" ");

        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int i = N - 1;
        int cnt = 0;

        while (K > 0) {
            if (K < coins[i]) {
                i--;
                continue;
            }
            K -= coins[i];
            cnt++;
        }
        System.out.println(cnt);
    }
}
