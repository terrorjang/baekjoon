package DFS;
// 11725

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindParent {
    static int N;
    static int[] answer;
    static boolean[] visit;
    static ArrayList<Integer> list[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        answer = new int[N + 1];

        list = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();

        }

        for (int i = 0; i < N - 1; i++) {
            String[] tmp = br.readLine().split(" ");

            int num1 = Integer.parseInt(tmp[0]);
            int num2 = Integer.parseInt(tmp[1]);

            list[num1].add(num2);
            list[num2].add(num1);
        }

        visit = new boolean[N + 1];
        // visit[1] = true;
        DFS(1);

        for (int j = 2; j < answer.length; j++) {
            System.out.println(answer[j]);

        }

    }

    public static void DFS(int x) {
        visit[x] = true;

        for (int i : list[x]) {
            if (!visit[i]) {
                answer[i] = x;
                DFS(i);
            }
        }
    }
}
