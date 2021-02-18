package Programs;

public class Problem_34 {
    public static void main (String args[]){
        int factorial[]={1,1,2,6,24,120,720,5040,40320,362880};
        int num;
        int sum,total=0;

        for(int i=10;i<=362880;i++){
            num=i;
            sum=0;
            while(num!=0){
                sum=sum+factorial[(num%10)];
                num=num/10;
            }
            if(sum==i)
                total=total+i;
        }

        System.out.println(total);
    }
}
