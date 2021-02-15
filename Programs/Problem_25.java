package Programs;

import java.math.BigInteger;

public class Problem_25 {

    static int dig(BigInteger b) {
        return (b.toString().length());
    }

    public static void main(String args[]) {

        int digit = 0;
        int i = 2;
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger fib = new BigInteger("0");

        while (digit <= 999) {
            fib = a.add(b);
            a = b;
            b = fib;
            digit = dig(fib);
            i++;
        }

        System.out.println(i);
    }
}
