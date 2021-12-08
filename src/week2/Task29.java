package week2;

import java.util.Scanner;

import static java.lang.Math.sqrt;


/* 29. "GNCHE-1" is a complex electronic device that issues every second the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ...
        Due to the high cost of electronic components, you have been instructed to develop an emulator for these devices.
        The number of seconds (from 1 to 1,000,000) is given that the generator works after being turned on.
        Example` Input`         Output`
                        2               1 2
                        5               1 2 2 3 3
                        7               1 2 2 3 3 3 4
 */
public class Task29 {
    public static void main(String[] args) {
        System.out.println("Enter a natural number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Number should be natural!");
        } else {
            System.out.println("Here is a sequence!");
            for (int i = 0; i < n; i++) {
                int m = (int) ((1 + sqrt(1 + 8 * i)) / 2);
                System.out.print(m + " ");
            }
        }
    }
}
