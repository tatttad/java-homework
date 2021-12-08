package week3;

import java.util.Scanner;

/* 3. Find the number of positive elements in the given array.
      Example` Input` 1 -1 2 3 -8
               Output` 1 2 3
 */
public class Task3 {
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
            System.out.println("All the positive elements of the array are`");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
