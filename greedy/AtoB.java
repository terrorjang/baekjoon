package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AtoB {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        int A = Integer.parseInt(tmp[0]);
        int B = Integer.parseInt(tmp[1]);

        int i = 1;
        while (A < B) {
            i++;
            if (B % 10 == 1) {
                B = B / 10;
            } else if (B % 2 == 0) {
                B /= 2;
            } else {
                System.out.println(-1);
                return;
            }
        }
        if (A == B) {
            System.out.println(i);
        } else {
            System.out.println(-1);
        }
    }
}
