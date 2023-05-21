package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RamenFactory {
    public static void main(String[] args) throws Exception {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(rb.readLine());

        String[] counts = rb.readLine().split(" ");
        int[] arr = new int[cnt + 2];

        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = Integer.parseInt(counts[i]);
        }
        int answer = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] > arr[i + 2]) {
                int two = Math.min(arr[i], arr[i + 1] - arr[i + 2]);
                answer += 5 * two;
                arr[i] -= two;
                arr[i + 1] -= two;

                int three = Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2]));
                answer += 7 * three;
                arr[i] -= three;
                arr[i + 1] -= three;
                arr[i + 2] -= three;
            } else {
                int three = Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2]));
                answer += 7 * three;
                arr[i] -= three;
                arr[i + 1] -= three;
                arr[i + 2] -= three;
                int two = Math.min(arr[i], arr[i + 1]);
                answer += 5 * two;
                arr[i] -= two;
                arr[i + 1] -= two;
            }
            answer += 3 * arr[i];
        }

        System.out.println(answer);
    }
}
