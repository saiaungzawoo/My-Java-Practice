//takes number from the user
//print out whether the  number is positive, negative, or zero

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        logic();
    }

    public static void logic(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int result = sc.nextInt();

        sc.close();

        //basic logic

        if(result > 0){
            System.out.println("The number is positive.");
        }
        else if(result < 0){
            System.out.println("The number is negative.");

        }
        else {
            System.out.println("The number is zero.");

        }

    }
}
