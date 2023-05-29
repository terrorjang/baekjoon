package prefix_sum;
// 2559

// Silver III

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0, max = 0;

        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        max = sum;

        for (int i = K; i < arr.length; i++) {
            sum += arr[i] - arr[i - K];
            max = Math.max(max, sum);
        }

        System.out.println(max);

    }
}
