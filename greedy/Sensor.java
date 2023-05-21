package greedy;
// 2212

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sensor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int[] sensor = new int[n];
        String[] tmp = br.readLine().split(" ");

        for (int i = 0; i < tmp.length; i++) {
            sensor[i] = Integer.parseInt(tmp[i]);
        }

    }

}
