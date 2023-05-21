package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LostBraket {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subs = br.readLine().split("-");

        int sum = Integer.MAX_VALUE;

        for (String sub : subs) {
            int tmp = 0;
            String[] adds = sub.split("\\+");
            for (String add : adds) {
                tmp += Integer.parseInt(add);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = tmp;
            } else {
                sum -= tmp;
            }

        }

        System.out.println(sum);
    }

}
