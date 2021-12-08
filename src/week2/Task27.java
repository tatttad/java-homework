package week2;

import java.util.Scanner;

import static java.lang.Math.pow;

/* 27. Convert a natural number from binary to decimal (no more than 10 digits in a binary number).
       Example` Input ` 1001 Output` 9
                        111  Output` 7
 */
public class Task27 {
    public static void main(String[] args) {
        System.out.println("Please, input a binary number.");
        Scanner scanner = new Scanner(System.in);
        int binary = scanner.nextInt();
        int decimal = 0;
        int n = 0;
        while (binary >= 0) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        System.out.println("The decimal of the given number is " + decimal + ".");

    }
}
