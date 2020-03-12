package for_test;

import java.util.Scanner;

public class star_mark_reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a = "*";

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(a);
            }
            System.out.println();
        }

    }
}
