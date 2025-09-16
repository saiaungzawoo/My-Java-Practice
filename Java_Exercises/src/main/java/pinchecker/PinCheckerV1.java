package pinchecker;

import java.util.Scanner;

//Version 1 - the system will not keep asking the user even if they don't enter 4 digits PIN.
//Instead, the system will let the user know if their PIN is less than or more than 4 digits.

public class PinCheckerV1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please create your PIN(4 digits): ");
        String input = scanner.nextLine();

        System.out.println();

            //check the user input length
            if(input.length() > 4){
                System.out.println("Please create the PIN up to 4 digits only.");
            }
            else if (input.length() < 4) {
                System.out.println("Please create the PIN that contains at least 4 digits.");
            }
            else {
                //mask the digits based on the user input length

                for (int i = 0; i < input.length(); i++) {
                    System.out.print("*");
                }
                System.out.println("\nYou have created your PIN successfully.");
            }

        scanner.close();
    }

    }
