package Programs;

public class Problem_30 {
    public static void main(String args[]) {

        int num;
        int rem;
        long sum = 0;
        long s = 0;
        for (int i = 2; i <= 5 * Math.pow(9, 5); i++) {
            num = i;
            while (num != 0) {
                rem = num % 10;
                num = num / 10;
                sum = sum + (long) Math.pow(rem, 5);
            }
            if (sum == i)
                s = s + i;
            sum = 0;
        }
        System.out.println(s);
    }
}
