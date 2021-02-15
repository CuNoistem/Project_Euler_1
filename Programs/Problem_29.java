package Programs;

public class Problem_29 {
    public static void main(String args[]){
        double i[]=new double[9801];
        double check;
        int m=0;
        boolean flag=true;
        for(int a =2;a<=100;a++){
            for(int b=2;b<=100;b++){
                check=Math.log(Math.pow(a,b));
                for(int c=0;c<=m;c++) {
                    if (i[c] == check){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    i[m]=check;
                    m++;
                }
                flag=true;
            }
        }

        System.out.println(m);
    }
}
