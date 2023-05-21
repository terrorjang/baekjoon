package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 1202
 */
public class Jewelry {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] JewelrysBags = br.readLine().split(" ");

        int JewelryCount = Integer.parseInt(JewelrysBags[0]);
        int BagCount = Integer.parseInt(JewelrysBags[1]);

        int[][] jewelies = new int[JewelryCount][2];
        int[] bags = new int[BagCount];

        for (int i = 0; i < jewelies.length; i++) {
            String[] tmp = br.readLine().split(" ");
            jewelies[i][0] = Integer.parseInt(tmp[0]);
            jewelies[i][1] = Integer.parseInt(tmp[1]);
        }

        for (int i = 0; i < bags.length; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(jewelies, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        Arrays.sort(bags);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long answer = 0;

        int j = 0;
        for (int i = 0; i < bags.length; i++) {
            while (j < JewelryCount && jewelies[j][0] <= bags[i]) {
                pq.offer(jewelies[j][1]);
                j++;
            }

            if (!pq.isEmpty()) {
                answer += pq.peek();
                pq.poll();
            }

        }
        System.out.println(answer);

        return;

    }

}