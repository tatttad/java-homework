package week2;

import java.util.Scanner;

/* 28.Enter the number N, followed by N integers.
      Count how many zeros, positive numbers, negative numbers among the given N numbers.
      It is necessary to print first the number of zeros, then the number of positive and negative numbers.
 */
public class Task28 {
    public static void main(String[] args) {
        System.out.println("Please input N number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Now input " + n + " numbers.");
        int count0 = 0;
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 1; i <= n; ++i) {
            int input = scanner.nextInt();
            if (input == 0) {
                count0++;
            } else if (input > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        System.out.println("The number of zeros is " + count0 + ".");
        System.out.println("The number of positives is " + countPositive + ".");
        System.out.println("The number of negatives is " + countNegative + ".");
    }
}
