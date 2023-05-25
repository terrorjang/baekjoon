package greedy;
// 2847

// Silver IV

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameMaker {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[N - i - 1] = Integer.parseInt(br.readLine());
        }

        int lastPoint = arr[0];
        int decrease = 0;

        for (int i = 1; i < arr.length; i++) {
            if (lastPoint > arr[i]) {
                lastPoint = arr[i];
                continue;
            }

            lastPoint--;
            decrease += arr[i] - lastPoint;
        }

        System.out.println(decrease);

    }

}
