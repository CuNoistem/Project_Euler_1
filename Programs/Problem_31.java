package Programs;

import java.util.Arrays;

public class Problem_31 {
    public static void main(String args[]){
        int counter[]={1,2,5,10,20,50,100,200};
        int a[]=new int[200];
        Arrays.fill(a,0);
        int b[]=new int[200];

        for(int i = 0;i<counter.length;i++){
            for(int j = 0; j<200;j++){
                if((j+1)-counter[i]==0){
                    b[j]=a[j]+1;
                }
                else if((j+1)-counter[i]<0){
                    b[j]=a[j];
                }
                else{
                    b[j]=b[(j+1)-counter[i]-1]+a[j];
                }
            }
            System.arraycopy(b,0,a,0,200);
        }

        System.out.println(b[199]);
    }
}
