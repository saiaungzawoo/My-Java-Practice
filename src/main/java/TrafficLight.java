import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //user input//
        System.out.print("Enter (RED, YELLOW, GREEN): ");
        String input = scanner.nextLine().toUpperCase();

        LightColors light = null; //placeholder//

        //enum to string
    try {
         light = LightColors.valueOf(input);
    }
    catch (IllegalArgumentException e){
        System.out.println("Invalid input.");
        System.exit(1);
    }

        String color = switch (light){
            case LightColors.RED -> "STOP!";
            case LightColors.YELLOW -> "Slow down";
            case LightColors.GREEN -> "Go";

        };

        System.out.println(color);


        scanner.close();
    }

    public enum LightColors {
        RED, YELLOW, GREEN
    }
}
