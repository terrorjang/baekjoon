package greedy;
// 1744

// Gold IV

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NumberSet {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> positive = new LinkedList<>();
        List<Integer> negative = new LinkedList<>();
        Integer[] arr = new Integer[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 1) {
                sum++;
                continue;
            }
            if (temp > 0) {
                positive.add(temp);
            } else {
                negative.add(temp);
            }
        }

        Collections.sort(positive, Collections.reverseOrder());
        Collections.sort(negative);

        int prev = 0;
        for (Integer integer : positive) {
            if (prev == 0) {
                prev = integer;
            } else {
                sum += prev * integer;
                prev = 0;
            }
        }

        if (prev > 0) {
            sum += prev;
            prev = 0;
        }
        // case 1

        // case 0

        // negative
        for (Integer integer : negative) {
            if (prev == 0) {
                prev = integer;
            } else {
                sum += prev * integer;
                prev = 0;
            }
        }
        if (prev < 0) {
            sum += prev;
        }

        System.out.println(sum);

    }

}
