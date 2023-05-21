package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Rope {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        long max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i] * (n - i));
        }
        System.out.println(max);
    }

}
