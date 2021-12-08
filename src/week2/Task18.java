package week2;

import java.util.Scanner;

/* 18. Write a java program to print all even numbers from a given range, from a to b.
       Input a and b from console.Example`
       Input ` 2 5 Output ` 2 4
 */
public class Task18 {
    public static void main(String[] args) {
        System.out.println("Please, input two numbers.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("All even numbers from range " + a + " to " + b + " are ");
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (a > b) {
            System.out.println("All even numbers from range " + a + " to " + b + " are ");
            for (int i = a; i >= b; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("There is no even number from range " + a + " to " + b + ".");
        }

    }
}
