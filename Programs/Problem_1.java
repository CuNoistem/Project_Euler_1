package Programs;

public class Problem_1 {           //Status: Correct

    public static void main(String args[]) {
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum = sum + i;
        }

        System.out.println("The sum of numbers divisible by 3 and 5 below 1000 is : " + sum);
    }
}
