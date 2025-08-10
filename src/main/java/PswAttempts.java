import java.util.Scanner;

public class PswAttempts {

    public static void main(String[] args) {

        String psw = "java123";

        Scanner scanner = new Scanner(System.in);

        int attempt = 0;


        while(attempt < 3){

            System.out.print("Enter your Password: ");
            String pswInput = scanner.nextLine();
            System.out.println();

            if (pswInput.equals(psw)){
                System.out.println("Login successful.");
                break;
            }
            else {
                int attempLeft = 2 - attempt;
                attempt++;

            if(attempLeft > 0){
                System.out.println("Wrong password. Try again.");
                System.out.println("You have " + " " + attempLeft + " " + "attempt" + " "+ "left.");

            }
            else {
                System.out.println("You have 0 attempt left. Account locked.");
            }

            }


        }
        //why do i put if block outside of loop//
//        if (attempt == 3){
//            System.out.println("Account Locked.");
//        }



        scanner.close();
    }
}
