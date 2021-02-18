package Programs;

public class Problem_36 {

    static boolean check_palindrome(int n,String s){
        return((n==Integer.valueOf(reverse(Integer.toString(n)))) && (s.equals(reverse(s))));
    }

    static String reverse(String n)
    {
        int le=n.length();
        if(le==0)
            return(n);
        else
            return(n.charAt(le-1)+reverse(n.substring(0,le-1)));
    }

    public static void main(String args[]){
        double start=System.nanoTime();
        String binary;
        long sum=0;

        for(int i=1;i<1000000;i=i+2){
            binary=Integer.toBinaryString(i);
            if(check_palindrome(i,binary))
                sum = sum + i;
        }

        System.out.println(sum);
        System.out.println("The program took : "+(System.nanoTime()-start)/1000000000+" seconds");
    }
}