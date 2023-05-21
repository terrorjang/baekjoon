package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class CardSoring {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(Long.parseLong(br.readLine()));

        }
        if (n == 1) {
            System.out.println(pq.peek());
            return;
        }
        long sum = 0;

        while (!pq.isEmpty()) {
            if (pq.size() >= 2) {
                long num1 = pq.peek();
                pq.poll();
                long num2 = pq.peek();
                pq.poll();
                sum += num1 + num2;
                pq.offer(num1 + num2);
            } else {
                pq.poll();
            }
        }

        System.out.println(sum);

    }
}
