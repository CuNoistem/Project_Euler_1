package Programs;

public class Problem_33 extends Problem_5{
    public static void main(String args[]) {

        int d1 = 0, d2 = 0;
        int num=1;
        int den=1;
        boolean flag;

        for (int a = 11; a < 100; a++) {
            for (int b = a + 1; b < 100; b++) {
                if (a % 10 != 0 && b % 10 != 0) {
                    flag=true;
                    int n1[] = {a / 10, a % 10};
                    int n2[] = {b / 10, b % 10};
                    d1 = a * 100 + b;
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (n1[i] == n2[j]) {
                                d2 = n1[Math.abs(i-1)] * 10 + n2[Math.abs(j-1)];
                                flag=false;
                                break;
                            }
                        }
                        if(!flag)
                            break;
                    }

                    if(!flag) {
                        if (((double) (d1 / 100) / (double) (d1 % 100)) == ((double) (d2 / 10) / (double) (d2 % 10))) {
                            num = num * (d1 / 100);
                            den = den * (d1 % 100);
                            System.out.println(d1/100 + " " + d1%100);
                        }
                    }

                }
            }
        }
        int gcd=(int)hcf(Math.max(num,den),Math.min(num,den));
        System.out.println(den/gcd);
    }
}
