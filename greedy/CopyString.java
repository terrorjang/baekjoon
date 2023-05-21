package greedy;
// 2195

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CopyString {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String P = br.readLine();

        int cnt = 0;
        for (int i = 0; i < P.length();) {
            int max = 0;
            for (int j = 0; j < S.length(); j++) {
                int tmp = 0;
                while (j + tmp < S.length() && i + tmp < P.length() && S.charAt(j + tmp) == P.charAt(i + tmp))
                    tmp++;

                if (max < tmp) {
                    max = tmp;
                }
            }
            i += max;
            cnt++;
        }

        System.out.println(cnt);
    }

}
