package week2;
import java.util.Scanner;
import static java.lang.Math.sqrt;
/*
10.  Given 3 real numbers a, b, c.
Find all decisions for ax2 + bx + c = 0.
Print all decisions, if there is not a decision ,print “Can't be”.
*/
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0 quadratic equation is given. Please input a, b and c");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Can't be");
        } else if (d == 0) {
            double x0 = -b / 2 * a;
            System.out.println("The quadratic equation has one root, which is");
            System.out.println("x0 = "+ x0);
        }else{
            double x1 = (-b - sqrt(d)) / (2 * a);
            double x2 = (-b + sqrt(d)) / (2 * a);

            System.out.println("Roots of the quadratic equation are ");
            System.out.println("x1 = "+x1 +", x2 =  "+x2);
        }
}
}
