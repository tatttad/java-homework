package week2;

import java.util.Scanner;

/* 16.Print all integer numbers from 1 to N, except that are multiple of 3 (Input N from console).
 */
public class Task16 {
    public static void main(String[] args) {
        System.out.println("Please input ann integer number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("All integer numbers from 1 to N, except that are multiple of 3 are ");

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
