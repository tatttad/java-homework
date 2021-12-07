package week2;
import java.util.Scanner;
/*14. Print all integer powers of two not exceeding N in ascending order.
      Input N from console. Example ` Input 50(You can not use Math.pow())
                                      Output ` 1 2 4 8 16 32.
 */
public class Task14 {
    public static void main(String[] args) {
        System.out.println("Please input an integer number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("All integer powers of two not exceeding " + n + " are ");

        for(int i = 1; i <= n; i *= 2){
            System.out.print(i + " ");
        }
        System.out.println(".");
    }
}
