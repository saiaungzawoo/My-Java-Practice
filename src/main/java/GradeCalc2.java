//v2 - loop version
//user can enter multiple times until they choose to exit

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean stop = false;

        //loop//
        while(!stop) {
            //initialize the variables to bring into the scope of the loop//
            int input1 = 0;
            int input2 = 0;
            int input3 = 0;

            //InputMismatch exception handling//
            try {
                System.out.println("Please Enter your score. ");
                //add try,catch//
                System.out.print("English: ");
                input1 = scanner.nextInt();

                System.out.print("Math: ");
                input2 = scanner.nextInt();

                System.out.print("Science: ");
                input3 = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the score.");
                System.exit(1);
            }

            //average calc

            int avg = (input1 + input2 + input3) / 3;
            System.out.println("Your average score is: " + avg);

            //range of grades//
            if (avg >= 90) {
                System.out.println("Grade A");
            } else if (avg >= 70) {
                System.out.println("Grade B");
            } else if (avg >= 50) {
                System.out.println("Grade C");
            } else if (avg >= 30) {
                System.out.println("Grade D");
            } else {
                System.out.println("Failed.");
            }

            System.out.print("Would to like you calculate again? (Y/N): ");
            String secondInput = scanner.nextLine();

            if (secondInput.equalsIgnoreCase("N")) {
                stop = true;
                //exit the loop//

            }
            System.out.println();
        }

        scanner.close();
    }
}
