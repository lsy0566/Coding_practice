package if_test;

import java.util.Scanner;

public class three_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int big = a;
        int middle = b;
        int small = c;

        if (a > b) {
            big = a;
            small = b;
            if (b > c) {
                middle = b;
                small = c;
            }
            else {
                small = b;
                if(a > c) {
                    middle = c;
                }
                else {
                    big = c;
                    middle = a;
                }
            }
        }
        else {
            big = b;
            small = a;
            if (a > c) {
                middle = a;
                small = c;
            }
            else {
                small = a;
                if (b > c) {
                    middle = c;
                }
                else {
                    big = c;
                    middle = b;
                }
            }
        }
        System.out.println(middle);
    }
}
