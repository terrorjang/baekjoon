package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Delivery
 */
public class Delivery {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");

        int n = Integer.parseInt(tmp[0]);
        int c = Integer.parseInt(tmp[1]);

        int m = Integer.parseInt(br.readLine());

        int[][] info = new int[m][3];
        for (int i = 0; i < m; i++) {
            tmp = br.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                info[i][j] = Integer.parseInt(tmp[j]);
            }
        }

    }
}