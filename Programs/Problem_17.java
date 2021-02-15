package Programs;

public class Problem_17 {
    public static void main(String args[]) {
        String name[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred", "onethousand"};
        int save[] = new int[1001];
        save[0] = 0;
        long sum = 0;
        int rem = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i < 20)
                save[i] = name[i].length();
            else if (i < 100 && i >= 20) {
                rem = i % 10;
                if (i < 30)
                    save[i] = name[rem].length() + name[20].length();
                else if (i >= 30 && i < 40)
                    save[i] = name[rem].length() + name[21].length();
                else if (i >= 40 && i < 50)
                    save[i] = name[rem].length() + name[22].length();
                else if (i >= 50 && i < 60)
                    save[i] = name[rem].length() + name[23].length();
                else if (i >= 60 && i < 70)
                    save[i] = name[rem].length() + name[24].length();
                else if (i >= 70 && i < 80)
                    save[i] = name[rem].length() + name[25].length();
                else if (i >= 80 && i < 90)
                    save[i] = name[rem].length() + name[26].length();
                else
                    save[i] = name[rem].length() + name[27].length();
            } else if (i < 1000 && i >= 100) {
                rem = i % 100;
                if (i < 200)
                    save[i] = name[i / 100].length() + save[rem] + 10;
                else if (i >= 200 && i < 300)
                    save[i] = name[i / 100].length() + save[rem] + 10;
                else if (i >= 300 && i < 400)
                    save[i] = name[i / 100].length() + save[rem] + 10;
                else if (i >= 400 && i < 500)
                    save[i] = name[i / 100].length() + save[rem] + 10;
                else if (i >= 500 && i < 600)
                    save[i] = name[i / 100].length() + save[rem] + 10;
                else if (i >= 600 && i < 700)
                    save[i] = name[i / 100].length() + save[rem] + 10;
                else if (i >= 700 && i < 800)
                    save[i] = name[i / 100].length() + save[rem] + 10;
                else if (i >= 800 && i < 900)
                    save[i] = name[i / 100].length() + save[rem] + 10;
                else
                    save[i] = name[i / 100].length() + save[rem] + 10;
            } else
                save[i] = name[name.length - 1].length();
        }

        for (int i = 1; i < 1001; i++) {
            //System.out.println(i+" "+save[i]);
            //try{Thread.sleep(500);}
            //catch(InterruptedException e){Thread.currentThread().interrupt();}
            sum = sum + save[i];
        }

        sum = sum - (3 * 9);

        System.out.println(sum);
    }
}