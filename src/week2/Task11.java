package week2;
import java.util.Scanner;
/* 11. Write a java program to find maximum from a given 3 integer numbers using ternary operator.
       Input numbers from console.
*/
public class Task11 {
    public static void main(String[] args) {
        System.out.println("Please input three numbers");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int max = x;

        int k = (max < y)? (max = y):max;
        int p = (max < z)? ( max = z): max;
        System.out.println("Maximum of this three numbers is " + max);
    }
}
