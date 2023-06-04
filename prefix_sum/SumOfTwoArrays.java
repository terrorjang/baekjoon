package prefix_sum;
// 2143

// Gold III
// nop..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfTwoArrays {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                A[i] = Integer.parseInt(st.nextToken());
            } else {
                A[i] = A[i - 1] + Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] B = new int[m];

        for (int i = 0; i < m; i++) {
            if (i == 0) {
                B[i] = Integer.parseInt(st.nextToken());
            } else {
                B[i] = B[i - 1] + Integer.parseInt(st.nextToken());
            }
        }

    }

}
