package Programs;

import java.math.BigInteger;

public class Problem_56 {
    public static void main(String[] args) {
        int max = 0;
        int sum = 0;
        int save = 0;
        for (int i = 99; i >= 2; i--) {
            for (int j = 99; j >= 2; j--) {
                sum = 0;
                String num = (new BigInteger(Integer.toString(i)).pow(j)).toString();
                //System.out.println(num);
                for (int r = 0; r < num.length(); r++) {
                    sum = sum + Integer.valueOf(num.substring(r, r + 1));
                    //System.out.println(sum);
                    /*try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }*/
                }
                if (sum > max) {
                    max = sum;
                    save = i;
                }
            }
        }

        System.out.println(max);
        System.out.println(save);
    }
}
