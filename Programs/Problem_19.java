package Programs;

public class Problem_19 {
    public static void main(String args[]) {             //First program to work on first try as intended, LOL XD.
        int day = 6, month = 1, year = 1901;
        int limit[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;

        for (; year <= 2000; year++) {
            while (month != 13) {
                day = day + 7;
                if (year % 4 != 0) {
                    if (day >= limit[month - 1]) {
                        day = day - limit[month - 1];
                        month++;
                    }
                } else {
                    limit[1] = 29;
                    if (day >= limit[month - 1]) {
                        day = day - limit[month - 1];
                        month++;
                    }
                }
                if (day == 1)
                    count++;
            }

            limit[1] = 28;
            month = 1;
        }

        System.out.println(count);
    }
}
