package week2;
import java.util.Scanner;
/* 21.Enter 2 integer numbers x and d from console
      Count and print one number - how many times the digit d occurs in the representation of a natural number x.
 */
public class Task21 {
    public static void main(String[] args) {
        System.out.println("Please, input x number  and d digit.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        if(d > 9){
            System.out.println("d should not exceed 9");
        }else {
            System.out.print("The digit " + d + " occurs in the representation of a natural number " + x + " ");
            while (x > 0) {
                int k = x % 10;
                if (k == d) {
                    count++;
                }
                x = x / 10;
            }
            System.out.print(count + " times :)");
        }
    }
}
