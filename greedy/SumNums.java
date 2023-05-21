package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumNums {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());
        // if (num == 1) {
        // System.out.println(1);
        // return;

        // }

        long i = 1;
        while (num >= 0) {

            num -= i;

            i++;
        }
        System.out.println(i - 2);
    }
}
