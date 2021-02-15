package Programs;

public class Problem_9 {                              //Status: Correct
                                                      //Refer mathblog.dk website's explanation for a better solution.
    public static void main(String args[]) {
        int a, b, c;
        int prod = 0;
        boolean flag = false;

        for (c = 334; c < 999; c++) {
            b = 333 - (c - 334);
            a = 333;

            for (; b > 0 && a<c ; b--, a++) {
                if ((a * a) + (b * b) == (c * c)) {
                    prod = a * b * c;
                    flag = true;
                    break;
                }
            }

            if (flag)
                break;
        }

        System.out.println(prod);
    }
}
