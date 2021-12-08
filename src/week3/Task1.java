package week3;

import java.util.Scanner;

/* 1.Print all elements of the array with even indices (that is, A [0], A [2], A [4]...)
     Input natural integer N
     Define an array with size N,
     Initialize it
     Example ` Input` 1 2 3 4 5
     Output` 1 3 5
 */
public class Task1 {
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
            System.out.println("All elements of the array with even indices are`");
            for (int i = 0; i < arr.length; i++) {
                if ((i % 2) == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
