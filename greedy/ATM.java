package greedy;
// 11399

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String strNums = br.readLine();
        String[] arrNums = strNums.split(" ");
        int[] mins = new int[cnt];

        for (int i = 0; i < arrNums.length; i++) {
            mins[i] = Integer.parseInt(arrNums[i]);
        }
        Arrays.sort(mins);

        int sum = 0;
        int each = 0;
        for (int i : mins) {
            each += i;
            sum += each;
        }
        System.out.println(sum);
    }

}
