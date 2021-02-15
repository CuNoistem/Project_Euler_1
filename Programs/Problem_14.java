package Programs;

public class Problem_14 {

    public static void main(String args[]) {                //www.mathblog.dk for better and way more optimized solution for this problem.
        int max = 0, count = 0;
        long num;
        long save = 0;

        for (long n = 13; n < 1000000; n++) {
            num = n;
            count = 0;
            while (true) {
                count++;
                if (num == 1)
                    break;
                else if (num % 2 == 0)
                    num = num / 2;
                else if (num % 2 != 0)
                    num = (3 * num) + 1;
            }

            if (max < count) {
                max = count;
                save = n;
            }
        }

        System.out.println(save + " with number of terms " + max);
    }
}
