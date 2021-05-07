package Programs;

import java.math.BigDecimal;
import java.math.MathContext;

public class Problem_80 {
    public static void main(String[] args) {
        BigDecimal num;
        BigDecimal save;
        int sum=0;
        for(int i=2;i<=99;i++){
            if(i==4 || i==9 || i==16 || i==25 || i==36 || i==49 || i==64 || i==81)
                continue;
            num=new BigDecimal(String.valueOf(i)).sqrt(new MathContext(105));
            save=num.multiply(new BigDecimal("10").pow(100));
            for(int j=0;j<100;j++){
                sum=sum+(Integer.valueOf(save.toString().substring(j,j+1)));
            }
        }
        System.out.println(sum);
    }
}
