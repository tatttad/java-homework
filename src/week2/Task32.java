package week2;

import java.util.Scanner;

/* 32. Write a program that prompts user for the size (a positive integer in int); and prints the multiplication table as shown:
       Enter the size: 10
       * | 1 2 3 4 5 6 7 8 9 10
       --------------------------------------------
       1 | 1 2 3 4 5 6 7 8 9 10
       2 | 2 4 6 8 10 12 14 16 18 20
       3 | 3 6 9 12 15 18 21 24 27 30
       4 | 4 8 12 16 20 24 28 32 36 40
       5 | 5 10 15 20 25 30 35 40 45 50
       6 | 6 12 18 24 30 36 42 48 54 60
       7 | 7 14 21 28 35 42 49 56 63 70
       8 | 8 16 24 32 40 48 56 64 72 80
       9 | 9 18 27 36 45 54 63 72 81 90
       10 | 10 20 30 40 50 60 70 80 90 100
 */
public class Task32 {
    public static void main(String[] args) {
        System.out.println("Please enter the size:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The size should be positive!");
        } else {
            System.out.println("The multiplication table is");
            System.out.println("* | 1 2 3 4 5 6 7 8 9 10");
            System.out.println("------------------------");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " | ");
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + " ");
                }
                System.out.println(" ");
            }
        }
    }
}