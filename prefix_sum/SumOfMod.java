package prefix_sum;
// 10986

// Gold III

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfMod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] count = new long[M];

        st = new StringTokenizer(br.readLine());
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum = (sum + Long.parseLong(st.nextToken())) % M;
            count[(int) sum]++;
        }

        long res = count[0];
        for (int i = 0; i < count.length; i++) {
            res += (count[i] * (count[i] - 1)) / 2;
        }
        System.out.println(res);

    }

}
