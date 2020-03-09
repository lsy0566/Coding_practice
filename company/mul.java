package com.company;

import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Scanner d = new Scanner(System.in);
        int a_1 = s.nextInt();
        int b_1 = s.nextInt();
        int c_1 = s.nextInt();

        int a_3 = 100*(a*c_1)+10*(b*c_1)+(c*c_1);
        int b_3 = 100*(a*b_1)+10*(b*b_1)+(c*b_1);
        int c_3 = 100*(a*a_1)+10*(b*a_1)+(c*a_1);
        System.out.println(100*(a*c_1)+10*(b*c_1)+(c*c_1));
        System.out.println(100*(a*b_1)+10*(b*b_1)+(c*b_1));
        System.out.println(100*(a*a_1)+10*(b*a_1)+(c*a_1));
        System.out.println(a_3+b_3+c_3);
    }
}
