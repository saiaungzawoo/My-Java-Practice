import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "admin"; //Hard coded for now.//
        String password = "java123";

        System.out.print("Please enter your username: ");
        String UserInput = scanner.nextLine();

        System.out.print("Please enter your password: ");
        String PswInput = scanner.nextLine();

        boolean NameCheck = UserInput.equals(username);
        boolean PswCheck = PswInput.equals(password);



        if(NameCheck && PswCheck) {
            System.out.println("Your login is approved.");
        }
        else if(!NameCheck && PswCheck){
            System.out.println("Username is incorrect.");
        }
        else if (NameCheck && !PswCheck) {
            System.out.println("Password is incorrect.");
        } else {
            System.out.println("Your login is declined. Both username and password are incorrect.");
        }

        scanner.close();

    }
}
