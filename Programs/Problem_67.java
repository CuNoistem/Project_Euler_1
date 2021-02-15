package Programs;

import java.io.*;
import java.nio.file.*;

public class Problem_67 {
    static long Grid[][];

    public static void main(String args[]) {
        try {
            File f = new File("W:\\Users\\Rohan\\IdeaProjects\\Project_Euler\\out\\production\\Project_Euler\\Programs\\p067_triangle.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            Path file = Paths.get("W:\\Users\\Rohan\\IdeaProjects\\Project_Euler\\out\\production\\Project_Euler\\Programs\\p067_triangle.txt");
            long count = Files.lines(file).count();
            Grid = new long[(int) count][(int) count];
            String s;
            int r = 0;
            int col = 0;

            while ((s = br.readLine()) != null) {
                s = " " + s;
                for (int c = 0; c < s.length(); c++) {
                    if (Character.isWhitespace(s.charAt(c))) {
                        Grid[r][col] = Integer.valueOf(s.substring(c + 1, c + 3));
                        c = c + 2;
                        col++;
                    }
                }
                r++;
                col = 0;
            }

            for (r = (int) count - 2; r >= 0; r--) {
                for (int c = 0; c <= r; c++) {
                    if (Grid[r][c] + Grid[r + 1][c] > Grid[r][c] + Grid[r + 1][c + 1])
                        Grid[r][c] = Grid[r][c] + Grid[r + 1][c];
                    else
                        Grid[r][c] = Grid[r][c] + Grid[r + 1][c + 1];
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Grid[0][0]);
    }
}
