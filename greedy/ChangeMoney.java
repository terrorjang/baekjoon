package greedy;
// 14916

// Silver V

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeMoney {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int five = 0;
        int two = 0;

        five = N / 5;

        if (N % 5 == 1 || N % 5 == 3) {
            if (five > 0) {

                five--;
            }

        }

        two = (N - (5 * five)) / 2;

        if (2 * two + 5 * five != N) {
            System.out.println(-1);
            return;
        }

        System.out.println(five + two);

    }

}
