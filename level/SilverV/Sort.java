package level.SilverV;
// 1181

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] inputArr = new String[N];

        for (int i = 0; i < N; i++) {
            inputArr[i] = br.readLine();
        }

        Arrays.sort(inputArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });

        System.out.println(inputArr[0]);
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i - 1].equals(inputArr[i])) {
                continue;
            }
            System.out.println(inputArr[i]);
        }

    }

}
