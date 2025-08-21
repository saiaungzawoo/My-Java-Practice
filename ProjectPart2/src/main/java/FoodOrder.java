import java.util.Scanner;


//version 1 - code works but the code design is prone to bugs//
public class FoodOrder {
    static Scanner scanner = new Scanner(System.in); //scanner for the whole program//
    static String userInput;

    public static void main(String[] args) {
        menu();
        input();
        output();

        scanner.close();

    }

    static void menu() {
        System.out.println("Pizza, Cake, Burger");
    }

    static void input() {
        System.out.print("What can I get for you?: ");
          userInput = scanner.nextLine();
    }

    static void output() {

        System.out.println("You ordered" + " " + userInput );
    }
}
