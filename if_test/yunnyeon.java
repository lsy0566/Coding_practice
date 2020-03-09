package if_test;

import java.util.Scanner;

public class yunnyeon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        int isTrue = 1;
        int isNotTrue = 0;
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println(isTrue);
        }
        else {
            System.out.println(isNotTrue);
        }
    }
}
