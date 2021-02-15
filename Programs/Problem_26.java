package Programs;

import java.math.BigDecimal;
import java.math.BigInteger;

import static Programs.Problem_27.is_prime;

public class Problem_26 {

    public static void main(String args[]) {

        BigDecimal d;
        BigInteger check[] = new BigInteger[2];
        BigInteger c;
        boolean flag = false;

        for (int i = 1000; i > 2; i--) {
            if (is_prime(i)) {
                d = (new BigDecimal("1")).divide((new BigDecimal(String.valueOf(i))), (i - 1), 1);
                c = (d.multiply(new BigDecimal("10").pow(i - 1))).toBigInteger();
                for (int j = 2; j <= Math.sqrt(i-1); j++) {
                    if ((i-1) % j == 0) {
                        check[0] = c.remainder(new BigInteger("10").pow((i-1) / j));
                        c = c.divide(new BigInteger("10").pow(i / j));
                        check[1] = c.remainder(new BigInteger("10").pow((i-1) / j));
                        if (check[0].equals(check[1])) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) {
                    System.out.println(i);
                    break;
                }
                flag = false;
            }
        }
    }
}
