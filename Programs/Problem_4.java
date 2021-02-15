package Programs;

public class Problem_4 {

    boolean palin(int n) {
        int nn = n;
        int num = 0;
        int rem;

        while (nn != 0) {
            rem = nn % 10;
            num = num * 10 + rem;
            nn = nn / 10;
        }

        return num == n;
    }

    public static void main(String args[]) {
        Problem_4 obj = new Problem_4();
        int max = 0;
        int check = 0;
        int a = 0, b = 0;

        for (int i = 999; i >= 900; i--) {
            for (int j = 999; j >= 900; j--) {
                check = i * j;
                if (max < check && obj.palin(check)) {
                    max = check;
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println("Max palindrome is " + max + " which is the product of " + a + " and " + b);
    }
}
