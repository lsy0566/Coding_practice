package if_test;

import java.util.Scanner;

public class test_record {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();

        if (score <= 100 && score >= 90) {
            System.out.println("A");
        }
        else if (score < 90 && score >= 80) {
            System.out.println("B");
        }
        else if (score < 80 && score >= 70) {
            System.out.println("C");
        }
        else if (score < 70 && score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

    }
}
