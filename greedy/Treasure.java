package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Treasure {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];

        String[] tmp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(tmp[i]);
        }

        tmp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] * B[n - 1 - i];
        }

        System.out.println(sum);
    }
}
