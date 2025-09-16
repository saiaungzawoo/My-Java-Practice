import java.io.File;
import java.util.Scanner;

public class ExFile2 {
    //ask user for filename
    //check if the file exists
    //print file size
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name (with extension): ");
        String userInput = scanner.nextLine(); //init the path

        File file = new File("data/" + userInput);

        if(file.exists() && file.isFile()){
            System.out.println("File exists!");
            long fileSize = file.length();
            System.out.println("File size is " + fileSize + " (byte)");
        }
        else {
            System.out.println("File not found.");
        }

        scanner.close();

    }



}
