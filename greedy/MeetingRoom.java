package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MeetingRoom {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int[][] startEndTimes = new int[cnt][2];
        for (int i = 0; i < cnt; i++) {
            String[] times = br.readLine().split(" ");
            startEndTimes[i][0] = Integer.parseInt(times[0]);
            startEndTimes[i][1] = Integer.parseInt(times[1]);
        }

        Arrays.sort(startEndTimes, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int endtime = 0;
        int answer = 0;
        for (int[] meeting : startEndTimes) {
            if (meeting[0] >= endtime) {
                answer++;
                endtime = meeting[1];
            }

        }
        System.out.println(answer);

    }

}
