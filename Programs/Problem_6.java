package Programs;

public class Problem_6 {

    public static void main(String args[])        //Status: Correct
    {
        int n = 100;
        long sum_of_square = ((n) * (n + 1) * (2 * n + 1)) / 6;
        long square_of_sum = (long) Math.pow((n * (n + 1)) / 2, 2);

        long difference = square_of_sum - sum_of_square;

        System.out.println("The difference is : " + difference);
    }
}
