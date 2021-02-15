package Programs;

public class Problem_23 {

    int sumFactors(int n) {
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i * i != n)
                    sum = sum + i + (n / i);
                else
                    sum = sum + i;
            }
        }
        return (sum + 1);
    }

    public static void main(String args[]) {
        long sum = 0;
        Problem_23 obj = new Problem_23();
        boolean b[] = new boolean[28124];
        boolean q[] = new boolean[28124];

        for (int i = 0; i < 28124; i++) {
            b[i] = true;
            q[i] = true;
        }

        for (int i = 12; i <= 28123; i++) {
            if (b[i]) {
                if (obj.sumFactors(i) > i) {
                    b[i] = false;
                    /*System.out.println(i + " " + obj.sumFactors(i));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }*/
                    for (int j = 2; i * j <= 28123; j++) {
                        b[i * j] = false;
                    }
                }
            }
        }

        for (int i = 12; i < 28124; i++) {
            if (!b[i]) {
                for (int j = 12; j <= i; j++) {
                    if (!b[j] && (i + j) < 28124) {
                        q[i + j] = false;
                        /*System.out.print(i+j+" ");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }*/
                    }
                }
            }
        }

        for (int i = 0; i < 28124; i++) {
            if (q[i]) {
                sum = sum + i;
                /*System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }*/
            }
        }

        System.out.println(sum);
    }
}