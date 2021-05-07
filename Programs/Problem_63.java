package Programs;

import java.math.BigInteger;

public class Problem_63 {
    public static void main(String[] args) {
        BigInteger num;
        boolean flag = true;
        int count = 9;
        for (int i = 2; flag; i++) {
            for (int j = 2; j <= 9; j++) {
                num = new BigInteger(Integer.toString(j)).pow(i);
                if (num.toString().length() == i) {
                    count++;
                }
                //System.out.println(j + "  " + i + "  " +count+"  "+ num);
                if (j == 9 && num.toString().length() < i) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
