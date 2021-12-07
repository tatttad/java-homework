package week2;
import java.util.Scanner;

/* 22. Given an integer number x.
       Print the number consisting of the digits of the given number x in reverse order.
       You do not need to output leading zeros.
 */
public class Task22 {
    public static void main(String[] args) {
        System.out.println("Please, input x number.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        System.out.print("The number consisting of the digits of the given number x in reverse order is ");
        String str = "";
        while (x > 0) {
            int k = x % 10;
            str += k;
            x = x / 10;
        }
        int rev = Integer.parseInt(str);
        System.out.print(rev);

    }
}
