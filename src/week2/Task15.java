package week2;
import java.util.Scanner;
/*15. For a given natural N print the smallest integer k that`
      Math.pow(2,k) ≥ N.(You can not use Math.pow())
      Example` Input 7
               Output 3
 */
public class Task15 {
    public static void main(String[] args) {
        System.out.println("Please input an integer number.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("The smallest integer k that` Math.pow(2,k) ≥ N is ");
        int k = 0;
        for(int i = 1; i < n; i *= 2){
             k++;
            }
        System.out.println(k + ".");
    }

}
