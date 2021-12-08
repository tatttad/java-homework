package week3;

import java.util.Scanner;

/* 8.In the list, all items are different. Swap the minimum and maximum elements of this list.
     Example ` Input ` 3 2 1 4 5
               Output ` 3 2 5 4 1
 */
public class Task8 {
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
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]> max){
                    max = arr[i];

                }
                if( arr[i]<min){
                    min = arr[i];
                }
                int temp;
                temp = max;
                max = min;
                min =temp;
            }


        }
    }
}
