package Programs;

public class Problem_5 {           //Status: Correct

    long num;

    Problem_5() {
        num = 1;
    }

    long hcf(long n1, long n2) {
        if (n2 == 0)
            return (n1);
        else
            return (hcf(n2, n1 % n2));
    }

    long lcm(int n) {
        for (int i = 2; i < n; i++) {
            num = num * (i) / hcf(num, i);
        }
        return num;
    }

    public static void main(String args[]) {
        Problem_5 obj = new Problem_5();
        obj.num = obj.lcm(20);
        System.out.println(obj.num);
    }
}
