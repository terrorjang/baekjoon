package level.SilverV;
// 1193

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long X = Long.parseLong(br.readLine());

        long i = 0;
        long sum = 0;
        while (sum < X) {
            sum += ++i;
        }
        long total = i + 1;

        long rest = X - sum + i;
        // System.out.println(rest);
        if (i % 2 == 0) {
            System.out.print(rest + "/");
            System.out.println(total - rest);
        } else {
            System.out.println(total - rest + "/" + rest);
        }

    }
}