package Programs;

import java.util.Arrays;

public class Problem_35 {
    public static void main(String args[]) {

        long start=System.nanoTime();
        boolean prime[] = new boolean[1000001];
        Arrays.fill(prime, true);
        String ext;
        char c;
        String num;

        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                for (int j = 2; i * j <= 1000000; j++)
                    prime[(i * j)] = false;
            }
        }

        boolean check;
        int count = 0;

        for (int i = 11; i < 1000000; i++) {
            if (prime[i]) {
                check = true;
                num = String.valueOf(i);
                do {
                    c = num.charAt(0);
                    ext = num.substring(1, num.length());
                    num = ext.concat(String.valueOf(c));
                    if (!prime[Integer.valueOf(num)]) {
                        check = false;
                        break;
                    }
                } while(!num.equals(String.valueOf(i)));
                if (check) {
                    count++;
                }
            }

        }

        System.out.println(count+4);
        System.out.println("The program took : "+(double)(System.nanoTime()-start)/1000000000+" seconds");
    }
}
