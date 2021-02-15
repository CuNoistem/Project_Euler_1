package Programs;

public class Problem_28 {
    public static void main(String args[]) {

        long sum = 0;

        for (int i = 1001; i >= 1; i = i - 2) {
            if (i != 1) {
                for (int j = 0; j < 4; j++) {
                    sum = sum + ((long) Math.pow(i, 2) - (i * j) + (j));
                }
            } else
                sum = sum + 1;
        }

        System.out.println(sum);
    }
}
