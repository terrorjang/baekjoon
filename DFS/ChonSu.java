package DFS;
// 2644

// Silver II

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ChonSu {
    static boolean[] visit;
    static List<Integer>[] arr;
    static int res = -1;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        visit = new boolean[n + 1];
        arr = new ArrayList[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int t1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());

        int e = Integer.parseInt(br.readLine());

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[p].add(c);
            arr[c].add(p);
        }

        DFS(t1, t2, 0);
        System.out.println(res);

    }

    public static void DFS(int start, int end, int count) {
        if (start == end) {
            res = count;
            return;
        }

        visit[start] = true;

        for (int i = 0; i < arr[start].size(); i++) {
            int n = arr[start].get(i);
            if (visit[n] == false) {
                DFS(n, end, count + 1);
            }
        }

    }

}
