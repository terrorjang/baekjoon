package greedy;
// 1049

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GuitarString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] six = new int[M * 2];
        int[] one = new int[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            six[i * 2] = Integer.parseInt(st.nextToken());
            one[i] = Integer.parseInt(st.nextToken());
            six[i * 2 + 1] = one[i] * 6;
        }

        Arrays.sort(six);
        Arrays.sort(one);

        int six_count = N / 6;
        int one_count = N % 6;

        if (one[0] * one_count > six[0]) {
            one_count = 0;
            six_count++;
        }

        System.out.println(six[0] * six_count + one[0] * one_count);

        return;
    }

}
