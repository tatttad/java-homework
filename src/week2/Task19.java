package week2;

import java.util.Scanner;

/*19.Print all numbers on the segment from a to b that give the remainder of c when divided by d.
     If such numbers do not exist, then you do not need to display anything.
     Example ` Input`       Output`
                     a 2           2 4
                     b 5
                     c 0
                     d 2
     i.e 2 divided to 2 reminder is 0, 4 divided to 2 reminder is 0
 */
public class Task19 {
    public static void main(String[] args) {
        System.out.println("Please, input four numbers` a,b,c,d.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a < b) {
            System.out.println("All numbers on the segment from a to b that give the remainder of c when divided by d are ");
            for (int i = a; i <= b; i++) {
                if (i % d == c) {
                    System.out.print(i + " ");
                }
            }
        } else if (a >= b){
            System.out.println(("All numbers on the segment from a to b that give the remainder of c when divided by d are "));
            for (int i = a; i >= b; i--) {
                if (i % d == c) {
                    System.out.print(i + " ");
                }
            }
        }

    }

}
