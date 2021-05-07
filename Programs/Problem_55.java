package Programs;

import java.math.BigInteger;

public class Problem_55 {
    BigInteger reverser(BigInteger num) {
        BigInteger rem;
        BigInteger save = new BigInteger("0");
        while (num.compareTo(new BigInteger("0")) != 0) {
            rem = num.mod(new BigInteger("10"));
            //System.out.println(rem);
            save = (save.multiply(new BigInteger("10"))).add(rem);
            //System.out.println(save);
            num = num.divide(new BigInteger("10"));
            //System.out.println(num);
        }
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(save);*/
        return (save);
    }

    public static void main(String[] args) {
        BigInteger a, b;
        BigInteger n;
        int count = 0;
        boolean flag = true;
        Problem_55 obj = new Problem_55();
        for (int j = 1; j <= 10000; j++) {
            a = new BigInteger(Integer.toString(j));
            b = new BigInteger("0");
            flag = true;
            for (int i = 1; i <= 50; i++) {
                a = a.add(b);
                b = obj.reverser(a);
                if ((i != 1 && a.compareTo(b) == 0)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        System.out.println(count);
    }
}
