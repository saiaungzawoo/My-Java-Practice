//the user can input once per run. Need loop to make the user enter psw until it's strong//

import java.util.Scanner;

public class PswCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //call the scanner method//
        String psw = inputPsw(scanner);

        //call others methods//
        boolean length = checkLength(psw);
        boolean digit = checkDigit(psw);
        boolean upperAndLower = checkUpperAndLower(psw);

        //set the conditions//
        if (length && digit && upperAndLower){
            System.out.println("Strong");
        }
        else if (length && digit || upperAndLower){
            System.out.println("Medium");
        }
        else {
            System.out.println("Weak");
        }

        scanner.close();

    }

    //ask for psw//
    static String inputPsw(Scanner scanner){
        System.out.print("Please enter a password: ");
        return scanner.nextLine();
    }

    //check if psw contains least 8 characters//
    static boolean checkLength(String psw){
        return psw.length() >= 8;

    }

    //check if psw has at lest 1 digit//
    static boolean checkDigit(String psw){
        for (int i = 0; i < psw.length() ; i++) {

            char c = psw.charAt(i);

            if(Character.isDigit(c)){
                return true;
            }
            
        }
        return false;
    }

    //check if psw has upper and lower case//
    static boolean checkUpperAndLower(String psw){

        boolean upper = false;
        boolean lower = false;

        for (int i = 0; i < psw.length() ; i++) {

//            char c = psw.charAt(i);

            if(Character.isUpperCase(psw.charAt(i))){
                upper = true;

            }
            if(Character.isLowerCase(psw.charAt(i))){
                lower = true;
            }


        }

        return upper && lower;
    }

}
