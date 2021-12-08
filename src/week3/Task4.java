package week3;

import java.util.Scanner;

/* 4. A list of numbers is given. Print all the elements of the list that are larger than the previous element.
      Example` Input ` 1 5 2 4 3 Output` 5 4
 */
public class Task4 {
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
            System.out.println("All the elements of the array that are larger than the previous element are`");
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    System.out.print(arr[i + 1] + " ");
                }
            }
        }
    }
}
