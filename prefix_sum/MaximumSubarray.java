package prefix_sum;
// 10211

// Silver IV

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSubarray {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            int max = arr[0];

            for (int j = 1; j < arr.length; j++) {
                int temp = Integer.parseInt(st.nextToken());
                arr[j] = Math.max(arr[j - 1] + temp, temp);
                max = Math.max(max, arr[j]);
            }

            System.out.println(max);

        }
    }

}
