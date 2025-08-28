import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ExFile {

    public static void main(String[] args) throws FileNotFoundException {

        //for user to enter the file name
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name (with extension): ");
        String input = scanner.nextLine();

        //create a file object using input
        File myFile = new File("data/" + input); //data is the path name on my local computer

        if(!myFile.exists()){
            System.out.println("File not found!");
            System.exit(1); //error
        }

        fileReader(myFile);

        scanner.close();
    }

    // Method to read and print file content
    private static void fileReader(File file) throws FileNotFoundException {
        //user enter file name
        //print out the content from the file

        Scanner fileScanner = new Scanner(file);

        System.out.println("File's content:");
        //loop for printing out the file content
        //loop keeps running as long as there are more lines to read
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        fileScanner.close();

    }

    }

