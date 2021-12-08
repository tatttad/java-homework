package week3;

import java.util.Scanner;

/* 7.Print the elements of the given list in reverse order without changing the list itself.
     Example ` Input ` 1 2 3 4 5
     Output ` 5 4 3 2 1
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Please, input a natural number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Number should be natural!");
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("The elements of the given list in reverse order are` ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
