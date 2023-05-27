package prefix_sum;
// 2003

// Silver IV

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfSumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0, count = 0, s = 0, e = 0;

        while (true) {
            if (sum >= M) {
                sum -= arr[s++];
            } else if (e >= N) {
                break;
            } else {
                sum += arr[e++];
            }

            if (sum == M) {
                count++;
            }
        }

        System.out.println(count);

    }

}
