package week2;

import java.util.Scanner;

/*25. Given an integer x.
      Count the number of natural divisors of x (including 1 and the number itself; x ≤ 2 ∗ 109).
 */
public class Task25 {
    public static void main(String[] args) {
        System.out.println("Please, input x number.");
        Scanner scanner = new Scanner(System.in);
        short x = scanner.nextShort();
        short count = 0;
        System.out.print("The number of natural divisors of x is ");
        for (short i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        System.out.print(count + ".");
    }
}
