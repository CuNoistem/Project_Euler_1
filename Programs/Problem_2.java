package Programs;

public class Problem_2 {

    public static void main(String args[])                //Status: Correct
    {
        long sum = 0;
        long a = 0, b = 1;
        long fib = 0;

        while (fib < 4000000) {
            fib = a + b;
            a = b;
            b = fib;
            if (fib % 2 == 0)
                sum = sum + fib;
        }

        System.out.println("The sum of even numbers in the fibonacci series is : " + sum);
    }
}
