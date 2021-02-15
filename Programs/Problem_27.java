package Programs;

public class Problem_27 {

    static int prime_count(int a, long b) {
        int c = 0;
        boolean flag = true;
        while (flag) {
            flag = is_prime((c * c) + (a * c) + b);
            c++;
        }

        return (c - 1);
    }

    static boolean is_prime(long n) {
        boolean b = true;
        if(n<2)
            return false;

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return (false);
            }
            if (Math.pow((int) Math.sqrt(n), 2) == n)
                return(false);
        }

        return b;
    }

    public static void main(String args[]) {

        int count;
        int max = 0;
        long prod = 0;

        for (long b = 1; b <= 1000; b++) {
            if (is_prime(b)) {
                for (int a = (int) Math.floor(2 * Math.sqrt(b)); a >= -(int) Math.floor(2 * Math.sqrt(b)); a--) {
                    count = prime_count(a, b);
                    //try{Thread.sleep(50);}
                    //catch(InterruptedException e){Thread.currentThread().interrupt();}
                    if (max < count) {
                        max = count;
                        prod = a * b;
                        System.out.println("n^2 " + a + "n+" + b + "  gives " + count + " primes");
                    }
                }
            }
        }

        System.out.println(prod);
    }
}
