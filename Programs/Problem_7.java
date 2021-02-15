package Programs;

public class Problem_7 {            //Run in Macbook air m1(if you ever get one) and compare the time of run with this laptop's.
    int num = 0;                      //Status: Correct.

    boolean check_prime(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                flag = false;
        }

        return flag;
    }

    public static void main(String args[]) {
        Problem_7 obj = new Problem_7();
        int count = 0;
        int i = 2;

        while (count != 10001) {
            if (obj.check_prime(i)) {
                count++;
                obj.num = i;
            }
            i++;
        }

        System.out.println("The 10001th prime number is : " + obj.num);
    }
}
