package Programs;

import java.math.BigInteger;

public class Problem_206 {
    public static void main(String[] args) {
        BigInteger num;
        boolean flag=false;
        long i=0;
        int m=1;
        for(i=1389026623;;i--){
            m=1;
            num=new BigInteger(Long.toString(i)).pow(2);
            //System.out.println(num +"  "+i);
            for(int j=0;j<num.toString().length();j=j+2){
                if(Integer.valueOf(num.toString().substring(j,j+1))==m && j!=18){
                    flag=true;
                    m++;
                }
                else if(j==18){
                    if(num.toString().charAt(j)=='0'){
                        flag=true;
                    }
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag)
                break;
        }

        System.out.println(i);
    }
}

