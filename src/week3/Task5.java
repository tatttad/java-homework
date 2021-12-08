package week3;

import java.util.Scanner;

/* 5. An array of numbers is given. Print the value of the largest element in the array,
      and then the index of that element in the array. If there are several largest elements, print the index of the first of them.
      Example` Input` 1 2 3 2 1
               Output` The largest is 3 index is 2
 */
public class Task5 {
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
            int max = arr[0];
            int k = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    k = i;
                }
            }
            System.out.println("The largest is " + max + ", index is " + k + ".");
        }
    }
}
