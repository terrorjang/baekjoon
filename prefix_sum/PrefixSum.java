package prefix_sum;
// 1806

// Gold IV

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        long arr[] = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        int s = 0, e = 0, min = Integer.MAX_VALUE;

        while (true) {
            if (sum >= S) {
                sum -= arr[s++];
            } else if (e == N) {
                break;
            } else {
                sum += arr[e++];
            }

            if (sum >= S) {
                min = Math.min(e - s, min);
            }
        }

        if (min < Integer.MAX_VALUE) {
            System.out.println(min);
        } else {
            System.out.println(0);
        }
    }

}
