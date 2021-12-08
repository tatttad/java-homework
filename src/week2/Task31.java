package week2;

import java.util.Scanner;

/* 31.Write a program that prompts the user for the size (a non-negative integer in int); and prints the following checkerboard pattern.
      # # # # # # #  N * N
      # # # # # # #
      # # # # # # #
      # # # # # # #
      # # # # # # #
      # # # # # # #
      # # # # # # #
 */
public class Task31 {
    public static void main(String[] args) {
        System.out.println("Please, input N natural number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("N should be natural!");
        } else {
            System.out.println("Here is a " + n + "x" + n + " sized checkboard :)");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("#" + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
