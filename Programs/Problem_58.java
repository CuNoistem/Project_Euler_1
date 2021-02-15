package Programs;

public class Problem_58 {

    boolean is_prime(double d) {
        for (int i = 2; i <= Math.sqrt(d); i++) {
            if (d % i == 0)
                return (false);
        }

        return (true);
    }

    public static void main(String args[]) {

        Problem_58 obj = new Problem_58();

        double count = 8;
        int i = 9;

        for (; ; i = i + 2) {
            for (int j = 0; j < 4; j++) {
                if (obj.is_prime(Math.pow(i, 2) - (i * j) + (j)))
                    count += 1;
            }
            if (((float) (count) / (i * 2 - 1)) * 100 <= 10) {
                break;
            }
        }

        System.out.println(i);

    }
}
