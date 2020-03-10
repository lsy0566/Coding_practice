package for_test;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i < 10 ; i++) {
            System.out.printf("%s * %s = %s", n, i, n*i);
            System.out.println();
        }
    }
}
