package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ReverseBin
 */
public class ReverseBin {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] S = br.readLine().toCharArray();

        int one = 0;
        int zero = 0;
        char current = ' ';
        for (char c : S) {
            if (c != current) {
                current = c;
                if (c == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }

        int min = Math.min(one, zero);

        System.out.println(min);

    }

}