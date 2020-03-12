package for_test;

import java.util.Scanner;

public class a_plus_b_more_beautiful {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i = 1 ; i <= t ; i++) {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.printf("Case #%s: %s + %s = %s", i, a, b, a+b);
            System.out.println();
        }
    }
}
