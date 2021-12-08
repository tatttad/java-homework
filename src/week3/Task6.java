package week3;

import java.util.Scanner;

/* 6.Print the value of the smallest of all positive elements in the list.
     It is known that the list contains at least one positive element,
     and the absolute value of all elements of the list does not exceed 1000.
     Example ` Input ` 5 -4 3 -2 1
               Output ` 1
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please, input a natural number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Number should be natural!");
        } else if (n > 1000) {
            System.out.println("N should not exceed 1000!");
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    if ((arr[i] < min) && (arr[i] > 0)) {
                        min = arr[i];
                    }
                }
            }
            System.out.println("The smallest of all positive elements in the list is " + min + ".");
        }
    }

}
