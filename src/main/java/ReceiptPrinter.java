import java.util.Scanner;

public class ReceiptPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the store!");
        System.out.println("Enter 3 items and their price");


        System.out.print("Item-1: ");
        String ItemScan1 = scanner.nextLine();
        System.out.print("Price for Item-1: ");
        Double PriceScan1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Item-2: ");
        String ItemScan2 = scanner.nextLine();
        System.out.print("Price for Item-2: ");
        Double PriceScan2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Item-3: ");
        String ItemScan3 = scanner.nextLine();
        System.out.print("Price for Item-3: ");
        Double PriceScan3 = scanner.nextDouble();
        scanner.nextLine();

        double total = PriceScan1 + PriceScan2 + PriceScan3;

        System.out.printf("%-3s $%.1f\n", ItemScan1, PriceScan1);
        System.out.printf("%-3s $%.1f\n", ItemScan2, PriceScan2);
        System.out.printf("%-3s $%.1f\n", ItemScan3, PriceScan3);

        System.out.println("-------------------");

        System.out.println("The total price is " + total + " " + "$");

        scanner.close();


    }
}
