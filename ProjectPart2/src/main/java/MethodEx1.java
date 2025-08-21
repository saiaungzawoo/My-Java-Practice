//Write a method which takes two numbers as arguments and prints their sum to the terminal.//

public class MethodEx1 {

    public static void main(String[] args) {

        //assign variables//
        int num1 = 3;
        int num2 = 5;

        //call the return method//
        int sum = print(num1,num2);
        System.out.println("Sum: " + sum);


    }

    //define return method//
    static int print(int num1, int num2){

        return num1 + num2;
    }
}
