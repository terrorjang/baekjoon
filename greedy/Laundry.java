package greedy;
// 2720

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laundry {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] cent = { 25, 10, 5, 1 };

        for (int t = 0; t < T; t++) {
            int[] count = new int[4];
            int C = Integer.parseInt(br.readLine());
            while (C > 0) {
                for (int i = 0; i < cent.length; i++) {
                    if (C < cent[i]) {
                        continue;
                    }

                    count[i] += C / cent[i];
                    C %= cent[i];
                }
            }

            System.out.print(count[0] + " ");
            System.out.print(count[1] + " ");
            System.out.print(count[2] + " ");
            System.out.println(count[3]);
        }
    }

}
