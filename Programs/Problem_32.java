package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem_32 {

    boolean digit(int prod, int n1, int n2) {
        boolean check[] = new boolean[9];
        Arrays.fill(check, true);

        while (prod > 0 || n1 > 0 || n2 > 0) {
            int rem1 = prod % 10;
            int rem2 = n1 % 10;
            int rem3 = n2 % 10;

            if (rem1 > 0)
                check[rem1 - 1] = false;
            if (rem2 > 0)
                check[rem2 - 1] = false;
            if (rem3 > 0)
                check[rem3 - 1] = false;

            prod = prod / 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }

        boolean flag = true;

        for (int i = 0; i < 9; i++) {
            if (check[i]) {
                flag = false;
                break;
            }
        }
        return (flag);
    }

    public static void main(String args[]) {
        Problem_32 obj1 = new Problem_32();
        Problem_32 obj2 = new Problem_32();
        boolean flag;
        long sum = 0;
        ArrayList<Integer> prod=new ArrayList<Integer>();

        for (int a = 1; a < 10; a++) {
            for (int b = 1000; b < (double) 10000 / a; b++) {
                flag = obj1.digit(a * b, a, b);
                if (flag) {
                    prod.add(a*b);
                    System.out.println(a + "x" + b + "=" + (a * b));
                }
            }
        }

        for (int a = 10; a < 100; a++) {
            for (int b = 100; b < (double) 10000 / a; b++) {
                flag = obj2.digit(a * b, a, b);
                if (flag) {
                    prod.add(a*b);
                    System.out.println(a + "x" + b + "=" + (a * b));
                }
            }
        }

        Set<Integer> set=new HashSet<>(prod);
        prod.clear();
        prod.addAll(set);

        for(int i=0;i<prod.size();i++)
            sum=sum+prod.get(i);

        System.out.println(sum);
    }
}