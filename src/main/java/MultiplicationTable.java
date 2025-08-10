import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter any number to multiply: ");
        int input = scanner.nextInt();

        for (int i = 1; i <=12 ; i++) {
           int result = input * i;

            System.out.println(input + "x" +  i + "=" + result);
        }

        scanner.close();
    }
}
