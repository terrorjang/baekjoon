package level.SilverV;
// 1251

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplitVoca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        List<String> list = new ArrayList<>();

        for (int one = 0; one < s.length() - 2; one++) {
            for (int two = one + 1; two < s.length() - 1; two++) {
                StringBuffer first = new StringBuffer(s.substring(0, one + 1));
                StringBuffer second = new StringBuffer(s.substring(one + 1, two + 1));
                StringBuffer third = new StringBuffer(s.substring(two + 1));

                String result = first.reverse().toString() + second.reverse().toString() + third.reverse().toString();
                list.add(result);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
        return;

    }

}
