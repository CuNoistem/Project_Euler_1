package Programs;

import java.util.Arrays;

public class Problem_38 {

    String concater(int n, int s) {

        String concat = Integer.toString(n);

        for (int i = 2; i <= s; i++) {
            concat = concat + Integer.toString(n * i);
        }

        return (concat);
    }

    boolean checker(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
        if (s.equals("123456789"))
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        Problem_38 obj = new Problem_38();
        int step = 5;
        String max = "123456789";
        for (int i = 5; i <= 9876; i++) {

            String concat = obj.concater(i, step);
            if (obj.checker(concat)) {
                System.out.println(i);
                if (max.compareTo(concat) < 0)
                    max = concat;
            }

            if (i == 9) {
                i = 12;
                step = 4;
            } else if (i == 25) {
                i = 123;
                step = 3;
            } else if (i == 329) {
                i = 5123;
                step = 2;
            } else ;
        }

        System.out.println(max);
    }
}
