package Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Problem_54 {

    String player1[] = new String[5];
    String player2[] = new String[5];
    int hand1 = 0;
    int hand2 = 0;
    int min = 0;
    int min1 = 0;
    int card1 = 0;
    int card2 = 0;

    void distributer(String move[]) {
        for (int i = 0; i < move.length; i++) {
            if (i < 5)
                player1[i] = move[i];
            else
                player2[i - 5] = move[i];
        }
    }

    void manipulate() {
        for (int i = 0; i < 5; i++) {
            if (player1[i].charAt(0) == 'T')
                player1[i] = player1[i].replace('T', 'V');
            if (player1[i].charAt(0) == 'J')
                player1[i] = player1[i].replace('J', 'W');
            if (player1[i].charAt(0) == 'Q')
                player1[i] = player1[i].replace('Q', 'X');
            if (player1[i].charAt(0) == 'K')
                player1[i] = player1[i].replace('K', 'Y');
            if (player1[i].charAt(0) == 'A')
                player1[i] = player1[i].replace('A', 'Z');


            if (player2[i].charAt(0) == 'T')
                player2[i] = player2[i].replace('T', 'V');
            if (player2[i].charAt(0) == 'J')
                player2[i] = player2[i].replace('J', 'W');
            if (player2[i].charAt(0) == 'Q')
                player2[i] = player2[i].replace('Q', 'X');
            if (player2[i].charAt(0) == 'K')
                player2[i] = player2[i].replace('K', 'Y');
            if (player2[i].charAt(0) == 'A')
                player2[i] = player2[i].replace('A', 'Z');
        }
    }

    void arrange() {
        String temp;
        int max;
        for (int i = 0; i < 4; i++) {
            max = i;
            for (int j = i + 1; j < 5; j++) {
                if ((int) player1[j].charAt(0) > (int) player1[max].charAt(0))
                    max = j;
            }
            temp = player1[i];
            player1[i] = player1[max];
            player1[max] = temp;
        }

        for (int i = 0; i < 4; i++) {
            max = i;
            for (int j = i + 1; j < 5; j++) {
                if ((int) player2[j].charAt(0) > (int) player2[max].charAt(0))
                    max = j;
            }
            temp = player2[i];
            player2[i] = player2[max];
            player2[max] = temp;
        }
    }

    int checker1() {
        char order[] = {'Z', 'Y', 'X', 'W', 'V', '9', '8', '7', '6', '5', '4', '3', '2', '1'};
        boolean flag = false;
        char save = 'a';
        int index = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (!((int) player1[i].charAt(0) == (90 - i))) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            hand1 = 10;
            return 10;
        } else if (flag) {
            for (int i = 0; i < order.length - 4; i++) {
                if (player1[0].charAt(0) == order[i]) {
                    index = i;
                    save = player1[0].charAt(1);
                    flag = false;
                    break;
                }
                flag = true;
            }
            for (int i = 1; i < 5 && !flag; i++) {
                if (!(player1[i].charAt(0) == order[index + i] && (player1[i].charAt(1) == save))) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            hand1 = 9;
            return ((int) player1[0].charAt(0));
        } else if (flag) {
            if ((player1[3].charAt(0) != player1[4].charAt(0))) {                           //Checking this portion...
                for (int i = 1; i < 4; i++) {
                    if (player1[0].charAt(0) == player1[i].charAt(0)) {
                        /*for (int j = i; j < 4; j++) {
                            if (player1[i - 1].charAt(1) == player1[j].charAt(1)) {
                                flag = true;
                                break;
                            }
                        }*/
                        flag = false;
                    } else
                        flag = true;
                    if (flag)
                        break;
                }
            }
            if (flag && player1[0].charAt(0) != player1[1].charAt(0)) {
                for (int i = 2; i < 5; i++) {
                    if (player1[1].charAt(0) == player1[i].charAt(0)) {
                        /*flag = false;
                        for (int j = i; j < 5; j++) {
                            if (player1[i - 1].charAt(1) == player1[j].charAt(1)) {
                                flag = true;
                                break;
                            }
                        }*/
                        flag = false;
                    } else {
                        flag = true;
                    }
                    if (flag)
                        break;
                }
            }
        }
        if (!flag) {
            hand1 = 8;
            return ((int) player1[2].charAt(0));
        } else if (flag) {
            if (player1[1].charAt(0) != player1[2].charAt(0)) {
                if (player1[0].charAt(0) == player1[1].charAt(0) && player1[2].charAt(0) == player1[3].charAt(0) && player1[2].charAt(0) == player1[4].charAt(0))
                    flag = false;
                else
                    flag = true;
            } else if (player1[2].charAt(0) != player1[3].charAt(0)) {
                if (player1[0].charAt(0) == player1[1].charAt(0) && player1[0].charAt(0) == player1[2].charAt(0) && player1[3].charAt(0) == player1[4].charAt(0))
                    flag = false;
                else
                    flag = true;
            }
        }
        if (!flag) {
            hand1 = 7;
            return ((int) player1[2].charAt(0));
        } else if (flag) {
            for (int i = 1; i < 5; i++) {
                if (player1[0].charAt(1) == player1[i].charAt(1))
                    flag = false;
                else {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            hand1 = 6;
            return ((int) player1[0].charAt(0));
        } else if (flag) {
            for (int i = 0; i < order.length - 4; i++) {
                if (player1[0].charAt(0) == order[i]) {
                    index = i;
                    save = player1[0].charAt(1);
                    flag = false;
                    break;
                }
                flag = true;
            }
            for (int i = 1; i < 5 && !flag; i++) {
                if (!(player1[i].charAt(0) == order[index + i])) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            hand1 = 5;
            return ((int) player1[0].charAt(0));
        } else if (flag) {
            for (int i = 0; i < 3; i++) {
                if (player1[i].charAt(0) == player1[i + 1].charAt(0) && player1[i].charAt(0) == player1[i + 2].charAt(0)) {
                    flag = false;
                    break;
                }
            }
        }
        if (!flag) {
            hand1 = 4;
            return ((int) player1[2].charAt(0));
        } else if (flag) {
            if (player1[0].charAt(0) != player1[1].charAt(0)) {
                if (player1[1].charAt(0) == player1[2].charAt(0) && player1[3].charAt(0) == player1[4].charAt(0)) {
                    max = Math.max((int) player1[1].charAt(0), (int) player1[3].charAt(0));
                    min = Math.min((int) player1[1].charAt(0), (int) player1[3].charAt(0));
                    card1 = (int) player1[0].charAt(0);
                    flag = false;
                }
            } else if (player1[3].charAt(0) != player1[4].charAt(0)) {
                if (player1[0].charAt(0) == player1[1].charAt(0) && player1[2].charAt(0) == player1[3].charAt(0)) {
                    max = Math.max((int) player1[0].charAt(0), (int) player1[2].charAt(0));
                    min = Math.min((int) player1[0].charAt(0), (int) player1[2].charAt(0));
                    card1 = (int) player1[4].charAt(0);
                    flag = false;
                }
            } else {
                if (player1[0].charAt(0) == player1[1].charAt(0) && player1[3].charAt(0) == player1[4].charAt(0)) {
                    max = Math.max((int) player1[0].charAt(0), (int) player1[3].charAt(0));
                    min = Math.min((int) player1[0].charAt(0), (int) player1[3].charAt(0));
                    card1 = (int) player1[2].charAt(0);
                    flag = false;
                }
            }
        }
        if (!flag) {
            hand1 = 3;
            return max;
        } else if (flag) {
            for (int i = 0; i < 4; i++) {
                if (player1[i].charAt(0) == player1[i + 1].charAt(0)) {
                    max = (int) player1[i].charAt(0);
                    flag = false;
                    break;
                }
            }
        }
        if (!flag) {
            hand1 = 2;
            return max;
        } else {
            hand1 = 1;
            return ((int) player1[0].charAt(0));
        }
    }

    int checker2() {
        char order[] = {'Z', 'Y', 'X', 'W', 'V', '9', '8', '7', '6', '5', '4', '3', '2', '1'};
        boolean flag = false;
        char save = 'a';
        int index = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (!((int) player2[i].charAt(0) == (90 - i))) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            hand2 = 10;
            return 10;
        } else if (flag) {
            for (int i = 0; i < order.length - 4; i++) {
                if (player2[0].charAt(0) == order[i]) {
                    index = i;
                    save = player2[0].charAt(1);
                    flag = false;
                    break;
                }
                flag = true;
            }
            for (int i = 1; i < 5 && !flag; i++) {
                if (!(player2[i].charAt(0) == order[index + i] && (player2[i].charAt(1) == save))) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            hand2 = 9;
            return ((int) player2[0].charAt(0));
        } else if (flag) {
            if ((player2[3].charAt(0) != player2[4].charAt(0))) {
                for (int i = 1; i < 4; i++) {
                    //flag = false;
                    if (player2[0].charAt(0) == player2[i].charAt(0)) {
                        /*for (int j = i; j < 4; j++) {
                            if (player2[i - 1].charAt(1) == player2[j].charAt(1)) {
                                flag = true;
                                break;
                            }
                        }*/
                        flag = false;
                    } else
                        flag = true;
                    if (flag)
                        break;
                }
            }
            if (flag && player2[0].charAt(0) != player2[1].charAt(0)) {
                for (int i = 2; i < 5; i++) {
                    //flag = false;
                    if (player2[1].charAt(0) == player2[i].charAt(0)) {
                        /*for (int j = i; j < 5; j++) {
                            if (player2[i - 1].charAt(1) == player2[j].charAt(1)) {
                                flag = true;
                                break;
                            }
                        }*/
                        flag = false;
                    } else
                        flag = true;
                    if (flag)
                        break;
                }
            }
        }
        if (!flag) {
            hand2 = 8;
            return ((int) player2[2].charAt(0));
        } else if (flag) {
            if (player2[1].charAt(0) != player2[2].charAt(0)) {
                if (player2[0].charAt(0) == player2[1].charAt(0) && player2[2].charAt(0) == player2[3].charAt(0) && player2[2].charAt(0) == player2[4].charAt(0))
                    flag = false;
                else
                    flag = true;
            } else if (player2[2].charAt(0) != player2[3].charAt(0)) {
                if (player2[0].charAt(0) == player2[1].charAt(0) && player2[0].charAt(0) == player2[2].charAt(0) && player2[3].charAt(0) == player2[4].charAt(0))
                    flag = false;
                else
                    flag = true;
            }
        }
        if (!flag) {
            hand2 = 7;
            return ((int) player2[2].charAt(0));
        } else if (flag) {
            for (int i = 1; i < 5; i++) {
                if (player2[0].charAt(1) == player2[i].charAt(1))
                    flag = false;
                else {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            hand2 = 6;
            return ((int) player2[0].charAt(0));
        } else if (flag) {
            for (int i = 0; i < order.length - 4; i++) {
                if (player2[0].charAt(0) == order[i]) {
                    index = i;
                    save = player2[0].charAt(1);
                    flag = false;
                    break;
                }
                flag = true;
            }
            for (int i = 1; i < 5 && !flag; i++) {
                if (!(player2[i].charAt(0) == order[index + i])) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            hand2 = 5;
            return ((int) player2[0].charAt(0));
        } else if (flag) {
            for (int i = 0; i < 3; i++) {
                if (player2[i].charAt(0) == player2[i + 1].charAt(0) && player2[i].charAt(0) == player2[i + 2].charAt(0)) {
                    flag = false;
                    break;
                }
            }
        }
        if (!flag) {
            hand2 = 4;
            return ((int) player2[2].charAt(0));
        } else if (flag) {
            if (player2[0].charAt(0) != player2[1].charAt(0)) {
                if (player2[1].charAt(0) == player2[2].charAt(0) && player2[3].charAt(0) == player2[4].charAt(0)) {
                    max = Math.max((int) player2[1].charAt(0), (int) player2[3].charAt(0));
                    min1 = Math.min((int) player2[1].charAt(0), (int) player2[3].charAt(0));
                    card2 = (int) player2[0].charAt(0);
                    flag = false;
                }
            } else if (player2[3].charAt(0) != player2[4].charAt(0)) {
                if (player2[0].charAt(0) == player2[1].charAt(0) && player2[2].charAt(0) == player2[3].charAt(0)) {
                    max = Math.max((int) player2[0].charAt(0), (int) player2[2].charAt(0));
                    min1 = Math.min((int) player2[0].charAt(0), (int) player2[2].charAt(0));
                    card2 = (int) player2[4].charAt(0);
                    flag = false;
                }
            } else {
                if (player2[0].charAt(0) == player2[1].charAt(0) && player2[3].charAt(0) == player2[4].charAt(0)) {
                    max = Math.max((int) player2[0].charAt(0), (int) player2[3].charAt(0));
                    min1 = Math.min((int) player2[0].charAt(0), (int) player2[3].charAt(0));
                    card2 = (int) player2[2].charAt(0);
                    flag = false;
                }
            }
        }
        if (!flag) {
            hand2 = 3;
            return max;
        } else if (flag) {
            for (int i = 0; i < 4; i++) {
                if (player2[i].charAt(0) == player2[i + 1].charAt(0)) {
                    max = (int) player2[i].charAt(0);
                    flag = false;
                    break;
                }
            }
        }
        if (!flag) {
            hand2 = 2;
            return max;
        } else {
            hand2 = 1;
            return ((int) player2[0].charAt(0));
        }
    }

    boolean tie_breaker() {
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            if (player1[i].charAt(0) > player2[i].charAt(0)) {
                flag = true;
                break;
            } else if (player1[i].charAt(0) < player2[i].charAt(0)) {
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Problem_54 obj = new Problem_54();
        try {
            File f = new File("W:\\Users\\Rohan\\IdeaProjects\\Project_Euler\\out\\production\\Project_Euler\\Programs\\p054_poker.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s;
            String moves[];
            int count = 0;

            while ((s = br.readLine()) != null) {
                moves = s.split(" ");
                obj.distributer(moves);
                obj.manipulate();
                obj.arrange();
                obj.checker1();
                obj.checker2();
                if (obj.hand1 > obj.hand2) {
                    count++;
                    System.out.println(s + " 1 " + obj.hand1);
                } else if (obj.hand2 == obj.hand1 && obj.hand2 != 3) {
                    if (obj.checker1() > obj.checker2()) {
                        count++;
                        System.out.println(s + " 1 " + obj.hand1);
                    } else if (obj.checker1() == obj.checker2()) {
                        if (obj.tie_breaker()) {
                            System.out.println(s + " 1 " + obj.hand1);
                            count++;
                        } else
                            System.out.println(s + "     2 " + obj.hand2);
                    } else
                        System.out.println(s + "     2 " + obj.hand2);
                } else if (obj.hand2 == 3 && obj.hand1 == 3) {
                    if (obj.checker1() > obj.checker2()) {
                        System.out.println(s + " 1 " + obj.hand1);
                        count++;
                    } else if (obj.checker1() == obj.checker2()) {
                        if (obj.min > obj.min1) {
                            System.out.println(s + " 1 " + obj.hand1);
                            count++;
                        } else if (obj.min == obj.min1) {
                            if (obj.card1 > obj.card2) {
                                System.out.println(s + " 1 " + obj.hand1);
                                count++;
                            } else
                                System.out.println(s + "     2 " + obj.hand2);
                        } else
                            System.out.println(s + "     2 " + obj.hand2);
                    } else
                        System.out.println(s + "     2 " + obj.hand2);
                } else
                    System.out.println(s + "     2 " + obj.hand2);
            }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}