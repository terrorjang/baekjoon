package prefix_sum;
// 16139

// Silver I

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InteractionBetwwenHumanAndComputer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arrChar = br.readLine().toCharArray();

        int[][] counts = new int['z' - 'a' + 1][arrChar.length];

        for (int i = 0; i < arrChar.length; i++) {
            int c = arrChar[i] - 'a';
            if (i == 0) {
                counts[c][0] = 1;
                continue;
            }

            // copy prev
            for (int j = 0; j < counts.length; j++) {
                counts[j][i] = counts[j][i - 1];
            }

            // increase current char.
            counts[c][i]++;
        }

        int q = Integer.parseInt(br.readLine());

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c = st.nextToken().charAt(0) - 'a';
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if (s == 0) {
                output.append(counts[c][e] + "\n");
            } else {
                output.append(counts[c][e] - counts[c][s - 1] + "\n");
            }
        }

        System.out.println(output);
    }

}
