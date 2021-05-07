package Programs;

import java.math.BigInteger;

public class Problem_53 {
    public static void main(String[] args) {
        Problem_53 obj = new Problem_53();
        BigInteger save;
        int count = 0;
        for (int n = 23; n <= 100; n++) {
            for (int r = 1; r <= n / 2; r++) {
                save = obj.calculate(n, r);
                if (save.compareTo(new BigInteger("1000000"))>=0) {
                    if (r != n / 2)
                        count = count + 2;
                    else {
                        if (n % 2 != 0)
                            count = count + 2;
                        else
                            count = count + 1;
                    }
                    //System.out.println(save+ "    "+n+"    "+r + "   "+count);
                }
            }
        }

        System.out.println(count);
    }

    BigInteger calculate(int n, int r) {
        BigInteger save1 = new BigInteger("1");
        BigInteger iterate;
        for (int i = n; i >n - r; i--) {
            iterate = new BigInteger(Integer.toString(i));
            save1 = save1.multiply(iterate);
        }
        BigInteger save2 = new BigInteger("1");
        for (int j = 1; j <= r; j++) {
            iterate = new BigInteger(Integer.toString(j));
            save2 = save2.multiply(iterate);
        }
        BigInteger savee = (save1.divide(save2));
        return (savee);
    }
}
