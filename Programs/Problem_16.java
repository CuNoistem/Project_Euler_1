package Programs;

public class Problem_16 {
    public static void main(String args[]) {
        String num = "32768";
        String newnum = "";
        int sum, carry = 0;
        long digit_sum = 0;

        for (int i = 16; i <= 1000; i++) {
            for (int j = num.length() - 1; j >= 0; j--) {
                sum = (Integer.valueOf(String.valueOf(num.charAt(j))) * 2) + carry;
                if (j != 0) {
                    carry = sum / 10;
                    sum = sum % 10;
                    newnum = Integer.toString(sum) + newnum;
                } else {
                    newnum = Integer.toString(sum) + newnum;
                }
            }
            carry = 0;
            num = newnum;
            newnum = "";
            //System.out.println(num);
            //try{Thread.sleep(00);}
            //catch(InterruptedException e){Thread.currentThread().interrupt();}
        }

        for (carry = 0; carry < num.length(); carry++)
            digit_sum = digit_sum + Integer.valueOf(String.valueOf(num.charAt(carry)));

        System.out.println(digit_sum);
    }
}
