package week2;
import java.util.Scanner;
/*13.The program will read three types of scores(quiz, mid-term, and final scores)
     and determine the grade based on the following rules:
     -if the average score >= 80% => grade = A;
     -if the average score >= 60% and < 80% => grade = B;
     -if the average score >= 40% and < 60% => grade = C;
     -else => grade = F;
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input quiz, midterm and final scores :)");
        int quiz = scanner.nextInt();
        int midterm = scanner.nextInt();
        int finalScore = scanner.nextInt();

        if (((quiz < 0) || (quiz > 100)) ||((midterm < 0) || (midterm > 100))||((finalScore < 0) || (finalScore > 100))){
            System.out.println("One of scores is invalid!");
        }else{
            int average  = (quiz + midterm + finalScore)/3;
            if(average >= 80){
                System.out.println("Grade = A :)");
            } else if((average >= 60 ) && (average <=80)){
                System.out.println("Grade = B :)");
            } else if((average >= 40 ) && (average <=60)){
                System.out.println("Grade = C :|");
            } else{
                System.out.println("Grade = F :(");
            }
        }
    }
}
