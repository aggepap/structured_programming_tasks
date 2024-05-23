package gr.aueb.cf.tasks.ch4;

import java.util.Scanner;

/**
 * Τυπώνει στο console n αριθμό αστεριών σε χ αριθμό σειρών.
 * Όπου n και x, ακέραιοι αριθμός που εισαγει ο χρήστης
 */

public class HxVStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int starsPerLine = 1;
        int lines = 1;

        System.out.println("Please insert number of stars and number of lines");
        starsPerLine = input.nextInt();
        lines = input.nextInt();

        for(int i = 1 ; i<= lines; i++){
            for (int k = 1 ; k<= starsPerLine ; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
