package prefix_sum;
// 3020

// Gold V

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Firefly {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[] bottom = new int[H + 1];
        int[] top = new int[H + 1];
        for (int i = 0; i < N / 2; i++) {
            bottom[Integer.parseInt(br.readLine())]++;
            top[H - Integer.parseInt(br.readLine())]++;
        }

        // bottom
        for (int i = 1; i <= H; i++) {
            bottom[i] += bottom[i - 1];
        }

        // top
        for (int i = H - 1; i >= 0; i--) {
            top[i] += top[i + 1];
        }

        int min = N;
        int count = 0;

        for (int i = 1; i <= H; i++) {
            int destroy = (bottom[H] - bottom[i - 1]) + (top[0] - top[i]);

            if (destroy < min) {
                min = destroy;
                count = 1;
            } else if (destroy == min) {
                count++;
            }
        }

        System.out.println(min + " " + count);

    }

}
