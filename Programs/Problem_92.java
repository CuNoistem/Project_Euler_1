package Programs;

import java.util.Arrays;

public class Problem_92 {
    public static void main(String[] args) {
        String num;
        boolean check89[]=new boolean[10000001];
        boolean check1[]=new boolean[10000001];
        Arrays.fill(check1,false);
        Arrays.fill(check89,false);
        check89[89]=true;
        check1[1]=true;
        int sum=0;
        int count=1;
        for(long j=1;j<=10000000;j++){
            num=Long.toString(j);
            while(!(num.equals("1") || num.equals("89"))) {
                sum=0;
                for (int i = 0; i < num.length(); i++) {
                    sum = sum + (int)(Math.pow(Integer.valueOf(num.substring(i,i+1)),2));
                }
                if(check89[sum]){
                    count++;
                    check89[(int)j]=true;
                    break;
                }
                else if(check1[sum]){
                    check1[(int)j]=true;
                    break;
                }
                num=Integer.toString(sum);
            }
        }
        System.out.println(count);
    }
}
