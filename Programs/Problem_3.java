package Programs;

public class Problem_3 {
    //Status: Correct
    static long n = 600851475143L;

    private long factor(long nn) {
        long i;

        for (i = 2; i <= nn; i++) {
            if (n % i == 0) {
                n = n / i;
                break;
            }
        }
        return i;
    }

    public static void main(String args[]) {
        Problem_3 obj = new Problem_3();
        long max = 0L;
        long check;

        while (n != 1) {
            check = obj.factor(n);
            if (max < check)
                max = check;
        }

        System.out.println("The greatest prime factor is:" + max);
    }
}
