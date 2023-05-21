package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Change {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = 1000 - Integer.parseInt(br.readLine());

        int[] coins = { 500, 100, 50, 10, 5, 1 };
        int cnt = 0;

        int i = 0;
        while (change > 0) {
            if (change < coins[i]) {
                i++;
                continue;
            }

            cnt += change / coins[i];
            change %= coins[i];
        }
        System.out.println(cnt);

    }
}
