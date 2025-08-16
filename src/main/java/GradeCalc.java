//user can only run once
//need to add loop

import java.util.Scanner;

public class GradeCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your score. ");

        System.out.print("English: ");
        double input1 = scanner.nextDouble();

        System.out.print("Math: ");
        double input2 = scanner.nextDouble();

        System.out.print("Science: ");
        double input3 = scanner.nextDouble();

        //average calc

        double avg = (input1 + input2 + input3) / 3;
        System.out.printf("Your average score is: %.2f\n", avg);

        //range of grades//
        if(avg >= 90) {
            System.out.println("Grade A");
        } else if (avg >= 70) {
            System.out.println("Grade B");
        }
        else if (avg >= 50) {
            System.out.println("Grade C");
        }
        else if (avg >= 30) {
            System.out.println("Grade D");
        }

        else {
            System.out.println("Failed.");
        }

        scanner.close();
    }
}
