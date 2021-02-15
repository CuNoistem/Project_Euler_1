package Programs;

import java.util.Arrays;

public class Problem_24 {

    static String Change(String n, int f, int s) {

        char temp;
        char c[] = n.toCharArray();

        temp = c[f];
        c[f] = c[s];
        c[s] = temp;

        Arrays.sort(c, f + 1, c.length);
        return (String.valueOf(c));
    }

    public static void main(String args[]) {

        String s = "0123456789";
        int i;
        int b;
        int min;
        int sec;

        for (int iterate = 1; iterate < 1000000; iterate++) {

            sec = 0;
            min = 100;

            for (i = 9; i >= 1; i--) {
                if ((int) s.charAt(i) > (int) s.charAt(i - 1)) {
                    break;
                }
            }
            for (int j = i; j <= 9; j++) {
                b = String.valueOf(s.charAt(j)).compareTo(String.valueOf(s.charAt(i - 1)));
                if (b > 0 && b < min) {
                    min = b;
                    sec = j;
                }
            }
            s = Change(s, i - 1, sec);
        }

        System.out.println(s);
    }
}
