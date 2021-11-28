package week2;
import java.util.Scanner;

/* 4. What happens if concatenate string and another primitive type
    1)concatenate integer + integer, print output
    2)concatenate String + integer with other primitive types.
        Example of output` 5 + 10 = 15 (edited)
*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Input first integer");
        int b = scanner.nextInt();
        System.out.println("Input second integer");
        int a = scanner.nextInt();
        System.out.println("First integer + second integer is equal to " + (a + b));

        System.out.println("Input an integer");
        int c = scanner.nextInt();
        System.out.println("Input a string");
        String str = scanner.next();
        System.out.println("Integer + string is equal to " + (c + str));


    }

}
