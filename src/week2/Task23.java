package week2;

import java.util.Scanner;

/*23.Given an integer number x
     Find the smallest natural divisor of x other than 1 (2 <= x <= 30000).
     Example`
              Input` 6 Output` 2
 */
public class Task23 {
    public static void main(String[] args) {
        System.out.println("Please, input x number.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("The smallest natural divisor of " + x + " other than 1 is ");
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
                break;
            }
        }
        System.out.print(".");
    }
}
