package level.SilverV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DDay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int year1 = Integer.parseInt(st.nextToken());
        int month1 = Integer.parseInt(st.nextToken());
        int day1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int year2 = Integer.parseInt(st.nextToken());
        int month2 = Integer.parseInt(st.nextToken());
        int day2 = Integer.parseInt(st.nextToken());

        int dy = year2 - year1;
        int dm = month2 - month1;
        int dd = day2 - day1;

        if (dm < 0) {
            dy -= 1;
            dm += 12;
        }

        if (dd < 0) {
            dm -= 1;
            dd += 31;
        }

        if (month2 > 2) {
            year1 += 1;
        }
        int days = 0;
        for (int i = 0; i < dy; i++) {
            int daysPerYear = 365;
            if (year1 % 4 == 0) {
                // 366
                daysPerYear = 366;
                if (year1 % 100 == 0) {
                    // 365
                    daysPerYear = 365;
                }
                if (year1 % 400 == 0) {
                    // 366
                    daysPerYear = 366;
                }

            }
            days += daysPerYear;
        }

        // int days = dy * 365 + dm * 30 + dd;
        System.out.println("D-" + days);

    }
}
