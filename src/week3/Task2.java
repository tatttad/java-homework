package week3;

import java.util.Scanner;

/* 2. Print all even numbered items in the list.
      Input natural integer N
      define an array with size N,
      Initialize it
      Example ` Input` 1 2 3 4 5 10
      Output` 2 4 10
 */
public class Task2 {
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
            System.out.println("All the even elements of the array are`");
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] % 2) == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
