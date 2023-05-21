package greedy;

// 1339
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class AlphabetMath {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] math = new String[n];
        for (int i = 0; i < math.length; i++) {
            math[i] = br.readLine();
        }

        int[] rank = new int[10];
        HashMap<Character, Integer> m = new HashMap<>();

        for (String S : math) {
            int l = S.length();
            for (int i = 0; i < l; i++) {

                int index = 0;
                char c = S.charAt(i);
                if (!m.containsKey(c)) {
                    m.put(c, m.size());
                }
                index = m.get(c);
                rank[index] += (int) Math.pow(10, l - i - 1);
            }
        }

        Arrays.sort(rank);

        int sum = 0;

        for (int i = 0; i < rank.length; i++) {
            sum += rank[i] * i;
        }

        System.out.println(sum);

    }
}
