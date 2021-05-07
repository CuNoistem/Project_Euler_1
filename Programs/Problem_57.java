package Programs;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem_57 {
    public static void main(String[] args) {
        Problem_57 obj=new Problem_57();
        BigInteger numerator=new BigInteger("7");
        BigInteger denominator=new BigInteger("5");
        BigInteger temp;
        int count=0;
        for(int i=3;i<=1000;i++){
            temp=numerator.add(denominator);
            numerator=denominator;
            denominator=temp;

            temp=numerator.add(denominator);
            numerator=temp;

            if(obj.check(numerator,denominator)) {
                //System.out.println(numerator+"   /   "+denominator);
                count++;
            }
        }
        System.out.println(count);
    }

    boolean check(BigInteger num, BigInteger den){
        return(num.toString().length()>den.toString().length());
    }
}
