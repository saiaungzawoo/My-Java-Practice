//version 2 - use proper method and return type//

import java.util.Scanner;

public class FoodOrder2 { //starter point//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        menu();
        String order = getOrder(scanner);
        output(order);

        scanner.close();

    }

    static void menu(){
        System.out.println("Pizza, Cake, Burger");
    }

    static String getOrder(Scanner scanner){ //this method need a scanner to work//
        System.out.print("What can I get for you?: ");
        return scanner.nextLine();
    }

    static void output(String order){
        System.out.println("You ordered" + " " + order);
    }

}
