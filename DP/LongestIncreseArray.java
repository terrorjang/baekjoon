package DP;
// 11053

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestIncreseArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        d[0] = 1;

        for (int i = 1; i < N; i++) {
            d[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && d[i] <= d[j]) {
                    d[i] = d[j] + 1;
                }
            }

        }
        int max = 0;
        for (int i : d) {
            max = Math.max(max, i);
        }
        System.out.println(max);

    }

}
