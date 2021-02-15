package Programs;

public class Problem_12 {

    int count;

    Problem_12() {
        count = 0;
    }

    long generate(long n) {
        return ((n * (n + 1)) / 2);
    }

    void divisor(long n) {
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                this.count += 2;
            }

            if (Math.pow((int) Math.sqrt(n), 2) == n)
                this.count--;
            //try{Thread.sleep(0);}
            //catch(InterruptedException e){Thread.currentThread().interrupt();}
        }
    }

    public static void main(String args[]) {
        Problem_12 obj = new Problem_12();
        long num = 0;

        for (long i = 1; ; i++) {
            if (obj.count >= 500)
                break;
            else {
                obj.count = 0;
                num = obj.generate(i);
                obj.divisor(num);
            }
        }

        System.out.println("The first triangle number with 500 divisor is : " + num);
    }
}
