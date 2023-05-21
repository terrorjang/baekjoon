package DP;
// 11726

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tiling {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] d = new int[n + 1];

        d[1] = 1;
        d[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n] % 10007);
    }
}
