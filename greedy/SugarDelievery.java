package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SugarDelievery {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int five = n / 5;
        int three = 0;
        n = n % 5;

        while (n > 0 && five >= 0) {
            int tmp = n / 3;
            three += tmp;
            n -= tmp * 3;
            if (n > 0) {
                five--;
                n += 5;
            }
        }

        if (n == 0) {
            System.out.println(five + three);
        } else {
            System.out.println(-1);
        }

    }
}
