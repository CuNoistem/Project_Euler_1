package Programs;

public class Problem_10 {

    static boolean b[] = new boolean[2000001];

    Problem_10() {
        for (int i = 0; i < 2000001; i++)
            b[i] = true;
    }

    static void checkPrime(int n) {
        for (int i = n; n * i <= 2000000; i++) {
            b[n * i] = false;
        }
    }

    static void add() {
        long sum = 0;

        for (int i = 2; i < 2000001; i++) {
            if (b[i]) {
                sum = sum + i;
            }
        }

        System.out.println("The sum of all primes up to 2 million is : " + sum);
    }

    public static void main(String args[]) {

        Problem_10 obj = new Problem_10();

        for (int i = 2; i <= Math.ceil(Math.sqrt(2000000)); i++) {
            if (b[i])
                checkPrime(i);
        }

        add();
    }
}
