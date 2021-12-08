package week2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/* 20.Integers a and b are entered. It is guaranteed that a does not exceed b.
      Print all numbers on the segment from a to b that are exact squares.
      If there are no such numbers, then you do not need to display anything.
      Example`
      Input` 2 Output ` 4
             8
 */
public class Task20 {
    public static void main(String[] args) {
        System.out.println("Please, input a and b numbers.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a should not exceed b");
        } else {
            for (int i = a; i <= b; ++i) {
                if (sqrt(i) == (int) (sqrt(i))) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}


