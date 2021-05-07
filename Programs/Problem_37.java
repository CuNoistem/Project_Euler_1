package Programs;

public class Problem_37 {                           //Can be further optimized, takes approximately 8 seconds to run.

    static boolean left_check(String n){
        if(n.length()==1) {
            if (n.equals("2") || n.equals("3") || n.equals("5") || n.equals("7"))
                return true;
            else
                return false;
        }
        if(prime_check(n))
            return(left_check(n.substring(1,n.length())));
        else
            return(false);
    }

    static boolean right_check(String n){
        if(n.length()==1) {
            if (n.equals("2") || n.equals("3") || n.equals("5") || n.equals("7"))
                return true;
            else
                return false;
        }
        if(prime_check(n))
            return(right_check(n.substring(0,n.length()-1)));
        else
            return(false);
    }

    static boolean prime_check(String s){
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(Long.valueOf(s));i++){
            if(Long.valueOf(s)%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }

    public static void main(String args[]){
        double start = System.nanoTime();
        int count=0;
        long sum=0;

        for(long i=23;;i=i+2) {
            if (i % 10 == 2 || i % 10 == 5)
                continue;
            else {
                if (prime_check(Long.toString(i))) {
                    if (left_check(Long.toString(i)) && right_check(Long.toString(i))) {
                        count++;
                        sum = sum + i;
                        System.out.println(i);
                    }

                    if (count == 11)
                        break;
                }
            }
        }

        System.out.println("\n"+sum);
        System.out.println("The program took : "+(System.nanoTime()-start)/1000000000+" seconds");
    }
}
