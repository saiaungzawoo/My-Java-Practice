import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

        //ask user for sentence
        //count the words

        countWord();
    }

    public static void countWord(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any words or sentences. I will count how many words are there.");
        System.out.print("Enter here: ");
        String input = sc.nextLine();


        //use wrapper class cuz input.length is only for int
        String wordCount = String.valueOf(input.length());
        System.out.println("There are " + wordCount + " " + "words.");

        sc.close();
    }
}
