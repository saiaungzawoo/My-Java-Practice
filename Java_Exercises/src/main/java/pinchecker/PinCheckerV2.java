package pinchecker;

import java.util.Scanner;

//Version 2 - the system will keep asking the user until they enter exactly 4 digits PIN.

public class PinCheckerV2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input; //init the variable first
        do {
            System.out.print("Please create your PIN(4 digits): ");
            input = scanner.nextLine();
            System.out.println();

            //check the user input length
            if (input.length() > 4) {
                System.out.println("Please create the PIN up to 4 digits only.");
            } else if (input.length() < 4) {
                System.out.println("Please create the PIN that contains at least 4 digits.");
            }

        } while (input.length() != 4); //loop the above codes until the user enters

        //logic for checking the user input length and printing the * based on the input length
        for (int i = 0; i < input.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\nYou have created your PIN successfully.");

        scanner.close();
    }
    }
