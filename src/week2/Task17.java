package week2;
import java.util.Scanner;
/* 17. Write a java program to compute the sum of digits in a given integer.
 */
public class Task17 {
    public static void main(String[] args) {
        System.out.println("Please input an integer number.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("The sum of digits in a given integer is ");
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum + ".");

    }
}
