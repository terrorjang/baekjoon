package greedy;
// 1213

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Silver III

public class Palindrom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int[] counts = new int['Z' - 'A' + 1];
        for (char c : arr) {
            counts[c - 'A']++;
        }

        // odd count is more than 1
        int odds = 0;
        int centerIndex = arr.length / 2;
        int index = 0;

        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            if (count == 0) {
                continue;
            }

            char c = (char) ('A' + i);
            for (int j = 0; j < count / 2; j++) {
                arr[index] = c;
                arr[arr.length - index - 1] = c;
                index++;
            }

            if (count % 2 == 1) {
                arr[centerIndex] = c;
                if (odds == 1) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                odds++;
            }
        }
        String answer = new String(arr);
        System.out.println(answer);
    }

}
