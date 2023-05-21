package level.SilverV;
// Silver V , 1094

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Stick {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int sum = 64;
        if (X == sum) {
            System.out.println(1);
            return;
        }

        List<Integer> list = new LinkedList<>();
        list.add(sum);
        while (sum > X) {
            int half = list.get(list.size() - 1) / 2;

            list.set(list.size() - 1, half);
            if (sum - half >= X) {
                sum -= half;
            } else {
                list.add(half);
            }
        }
        System.out.println(list.size());
    }
}
