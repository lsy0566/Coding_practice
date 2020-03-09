package if_test;

import java.util.Scanner;

public class hamburger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int burgur1 = s.nextInt();
        int burgur2 = s.nextInt();
        int burgur3 = s.nextInt();
        int drink1 = s.nextInt();
        int drink2 = s.nextInt();

        int set1_1, set1_2, set1_3;
        int set2_1, set2_2, set2_3;

        set1_1 = burgur1 + drink1 - 50;
        set1_2 = burgur2 + drink1 - 50;
        set1_3 = burgur3 + drink1 - 50;

        set2_1 = burgur1 + drink2 - 50;
        set2_2 = burgur2 + drink2 - 50;
        set2_3 = burgur3 + drink2 - 50;

        int cheap_set = set1_1;
        if (set1_1 > set1_2) {
            cheap_set = set1_2;
            if (cheap_set > set1_3) {
                cheap_set = set1_3;
                if  (cheap_set > set2_1) {
                    cheap_set = set2_1;
                    if ( cheap_set > set2_2) {
                        cheap_set = set2_2;
                        if ( cheap_set > set2_3 ){
                            cheap_set = set2_3;
                        }
                    }
                }
            }
        }
        System.out.println(cheap_set);
    }
}
