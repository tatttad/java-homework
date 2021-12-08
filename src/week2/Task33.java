package week2;

import java.util.Scanner;

/* 33. Write 4 programs (X = A, B, C, D) that prompts user for the size (a non-negative integer in int);
       and prints each of the patterns as shown:
       Enter the size: 4
       * **** **** *
       ** *** *** **
       *** ** ** ***
       **** * * ****
       a) b) c) d)
 */
public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Size should be positive!");
        } else {
            for (int row = 1; row <= size; row++) {
                for (int col = 1; col <= size; col++) {
                    if (row >= col) {
                        System.out.print("#");
                    }
                }
                System.out.print(" ");
                for (int col = 1; col <= size; col++) {
                    if (row <= col) {
                        System.out.print("#");
                    }
                }
                System.out.print(" ");
                for (int col = 1; col <= size; col++) {
                    if ((row + col) <= (size + 1)) {
                        System.out.print("#");
                    }
                }
                System.out.print(" ");
                for (int col = 1; col <= size; col++) {
                    if ((row + col) >= (size + 1)) {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }
    }
}

