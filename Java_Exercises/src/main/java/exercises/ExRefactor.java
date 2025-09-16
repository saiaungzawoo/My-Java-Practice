//Ex v2

import java.util.Scanner;

public class ExRefactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] output = array(sc);
        printOut(output);

        sc.close();
    }

    private static int[] array (Scanner sc) {

        //enter 5 num, store in arrays

        //init array to hold 5 numbers
        int[] arr = new int[5];
        for (int i = 0; i <= 4; i++) {

            //one input after another
            System.out.print("Enter number " + (i + 1) + ": ");
            //arr[0,1,2,3,4] = sc.nextInt();
            arr[i] = sc.nextInt();

        }
        //store user input in the array


        return arr;
    }

    private static void printOut(int[] arr){

        for(int result : arr){
            System.out.println(result);
        }
    }

}
