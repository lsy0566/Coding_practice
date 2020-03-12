package for_test;

import java.util.Scanner;

public class star_mark_contrary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a = "*";

        for (int i = n; i>0 ; i--) {
            for (int j = i ; j > 0 ; j--) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
