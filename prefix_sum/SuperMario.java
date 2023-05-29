package prefix_sum;
// 2851

// Bronze I

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperMario {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, answer = 0;
        int abs = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            sum += Integer.parseInt(br.readLine());
            if (abs >= Math.abs(100 - sum)) {
                answer = sum;
                abs = Math.abs(100 - sum);
            } else {
                break;
            }

        }

        System.out.println(answer);
    }

}
