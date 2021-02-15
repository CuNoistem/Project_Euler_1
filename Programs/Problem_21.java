package Programs;

public class Problem_21 {

    private boolean check[] = new boolean[10000];

    private Problem_21() {
        for (int i = 0; i < 10000; i++)
            check[i] = true;
    }

     long factor(long n, long x) {
        if (x > n / 2)
            return 0;
        else if (n % x == 0)
            return (x + factor(n, x + 1));
        else
            return (factor(n, x + 1));
    }

    public static void main(String args[]) {
        Problem_21 obj = new Problem_21();
        long num1, num2;
        long sum = 0;

        for (long i = 2; i <= 10000; i++) {
            if (obj.check[(int) i - 1]) {
                num1 = obj.factor(i, 1);
                num2 = obj.factor(num1, 1);
                if (i == num2) {
                    if (num1 != num2) {
                        sum = sum + num1 + num2;
                    }
                    if (num1 < 10000)
                        obj.check[(int) num1 - 1] = false;
                    if (num2 < 10000)
                        obj.check[(int) num2 - 1] = false;
                }
            }
        }

        System.out.println(sum);
    }
}
