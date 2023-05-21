package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.ConstantCallSite;

public class GasStation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");
        long[] d = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            d[i] = Long.parseLong(tmp[i]);
        }

        tmp = br.readLine().split(" ");
        long[] costs = new long[n];
        for (int i = 0; i < n; i++) {
            costs[i] = Long.parseLong(tmp[i]);
        }

        long c = costs[0];
        long total = 0;

        for (int i = 0; i < d.length; i++) {
            if (costs[i] < c) {
                c = costs[i];
            }

            total += c * d[i];

        }

        System.out.println(total);
    }
}
