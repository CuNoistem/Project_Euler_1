package Programs;

public class Problem_15 {
    public static void main(String args[]) {
        long a[][] = new long[21][21];
        int r, c;

        for (r = 0; r < 21; r++) {
            for (c = 0; c < 21; c++) {
                if (c == 20 || r == 20)
                    a[r][c] = 1;
            }
        }

        for (r = 19; r >= 0; r--) {
            for (c = 19; c >= 0; c--) {
                a[r][c] = a[r][c + 1] + a[r + 1][c];
            }
        }

        System.out.println("The total number of routes in a 20 by 20 grid is : " + a[0][0]);
    }
}
