package Programs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem_13 {

    int digit[] = new int[50];
    int carry;
    int sum;
    int i;

    Problem_13() {
        this.carry = 0;
        this.sum = 0;
        this.i = 49;
    }

    void add(String s) {
        this.sum = this.sum + Integer.valueOf(String.valueOf(s.charAt(this.i)));
    }

    void display() {
        for (int i = 0; i < 10; i++)
            System.out.print(this.digit[i]);
    }

    public static void main(String args[]) {
        String data;
        try {
            Problem_13 obj = new Problem_13();
            File f = new File("W:\\Users\\Rohan\\IdeaProjects\\Project_Euler\\out\\production\\Project_Euler\\Programs\\p013_Number.txt");
            Scanner sc = new Scanner(f);
            if (f.createNewFile()) {
            }
            while (obj.i >= 0) {
                while (sc.hasNextLine()) {
                    data = sc.nextLine();
                    obj.add(data);
                }

                sc = new Scanner(f);

                obj.sum += obj.carry;
                if (obj.i > 0) {
                    obj.carry = obj.sum / 10;
                    obj.sum = obj.sum % 10;
                    obj.digit[obj.i] = obj.sum;
                }
                if (obj.i == 0) {
                    obj.digit[obj.i] = obj.sum;
                }
                obj.sum = 0;
                obj.i--;
            }
            obj.display();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
