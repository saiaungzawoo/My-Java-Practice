import java.util.Scanner;

public class PswChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String input = scanner.nextLine();

        boolean length = input.length() >= 8;

        if (length) {
            System.out.println("You password is ok.");
        }
        else {
            System.out.println("Your password needs to be long.");
        }


    }
}
