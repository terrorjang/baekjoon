package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 10610
public class Thirty {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();

        char[] input = tmp.toCharArray();
        Arrays.sort(input);

        if (input[0] != '0') {
            System.out.println(-1);
            return;
        }

        long sum = 0;
        for (char c : input) {
            sum += (long) c - 48;
        }

        if (sum % 3 > 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder answer = new StringBuilder(new String(input));

        System.out.println(answer.reverse().toString());
    }

}