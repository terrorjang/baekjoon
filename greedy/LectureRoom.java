package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class LectureRoom {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] times = new int[cnt][2];

        for (int i = 0; i < cnt; i++) {
            String[] time = br.readLine().split(" ");

            times[i][0] = Integer.parseInt(time[0]);
            times[i][1] = Integer.parseInt(time[1]);
        }

        Arrays.sort(times, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });

        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(times[0][1]);
        for (int i = 1; i < times.length; i++) {
            if (q.peek() <= times[i][0]) {
                q.poll();
            }

            q.add(times[i][1]);

        }

        System.out.println(q.size());
    }
}
