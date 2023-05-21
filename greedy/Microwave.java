package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Microwave {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.parseInt(br.readLine());

        if (time % 10 > 0) {
            System.out.println(-1);
            return;
        }

        int[] ABC = { 300, 60, 10 };
        int[] max = { 60, 300, 10000 };
        int[] answer = new int[3];

        for (int i = 0; i < 3; i++) {
            if (time < ABC[i]) {
                continue;
            }

            int tmp = time / ABC[i];
            tmp = Math.min(max[i], tmp);

            time -= ABC[i] * tmp;
            answer[i] = tmp;

        }

        System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);

    }
}
