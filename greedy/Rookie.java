package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1946

public class Rookie {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[][][] tests = new int[t][][];

        for (int i = 0; i < tests.length; i++) {
            int n = Integer.parseInt(br.readLine());

            tests[i] = new int[n][2];
            for (int j = 0; j < tests[i].length; j++) {
                String[] tmp = br.readLine().split(" ");

                tests[i][j][0] = Integer.parseInt(tmp[0]);
                tests[i][j][1] = Integer.parseInt(tmp[1]);
            }
        }

        for (int[][] test : tests) {
            int cnt = 1;
            Arrays.sort(test, (o1, o2) -> {
                return o1[0] - o2[0];
            });
            int min = test[0][1];

            for (int i = 1; i < test.length; i++) {
                if (min > test[i][1]) {
                    min = test[i][1];
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

}
