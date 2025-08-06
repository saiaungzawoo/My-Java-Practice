
import java.util.Scanner;

public class TicketPriceCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int Ageinput = scanner.nextInt();
        scanner.nextLine();


        boolean AgeCheck = Ageinput <= 12;


        if (AgeCheck) {
            System.out.println("Your Ticket cost 2000 MMK.");
        } else {
            System.out.print("Are you a student? (yes/no): ");
            String StatusInput = scanner.nextLine();

            if (StatusInput.equalsIgnoreCase("yes")) {
                System.out.println("Your Ticket cost 2500 MMK.");
            }
            else {
                System.out.println("Your Ticket cost 3000 MMK.");
            }
        }

        scanner.close();
    }
}
