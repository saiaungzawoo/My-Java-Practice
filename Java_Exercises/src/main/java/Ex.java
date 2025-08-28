// Ex v1
import java.util.Scanner;
//the codes works, but need to modify

public class Ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] output = array(sc);
        printOut(output);

        sc.close();

    }

    public static int[] array(Scanner sc){


        //enter 5 num, store in arrays

        System.out.print("Enter number 1: ");
        int input1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int input2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int input3 = sc.nextInt();
        System.out.print("Enter number 4: ");
        int input4 = sc.nextInt();
        System.out.print("Enter number 5: ");
        int input5 = sc.nextInt();

        //store user input in the array


        return new int[]{input1, input2, input3, input4, input5};
    }

    //a method for printing out the result
    private static void printOut(int[] arr) {
        for(int result : arr){
            System.out.println(result);
        }
    }
}
