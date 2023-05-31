package binary_search;
// 1920

// Silver IV

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SearchNumber {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        int[] s = new int[M];
        int[] answer = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            s[i] = Integer.parseInt(st.nextToken());
            int target = s[i];

            int max = arr.length - 1;
            int currentIndex = max / 2;
            int min = 0;
            // search
            while (min <= max) {
                if (target == arr[currentIndex]) {
                    answer[i] = 1;
                    break;
                }

                if (target < arr[currentIndex]) {
                    max = currentIndex - 1;
                } else {
                    min = currentIndex + 1;
                }
                currentIndex = (min + max) / 2;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : answer) {
            sb.append(i + "\n");

        }

        System.out.println(sb.toString());

    }

}
