import java.util.Scanner;
import java.util.Arrays;

public class GradeAnalyzer {

    public static void main(String[] args) {

        //read input
        //init arrays
        //read each arrays
        //return the arrays

        //compute highest, lowest, average grades
        //return the method

        //call each method on main

        double[] inputGrades = readInput();

        System.out.println();

        //sort the array
        Arrays.sort(inputGrades);

        //compute highest and lowest grades
         highLow(inputGrades);

        //compute average grades
        average(inputGrades);

    }

    private static double[] readInput(){
        //prompt the user for input
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many grades?: ");
        int num = scanner.nextInt();

        //init arrays based on user input numbers
        double[] inputGrades = new double[num];

        //read each grades
        for (int i = 0; i < inputGrades.length ; i++) {
            System.out.print("Please enter grade number" + (i+1) + ": ");
            inputGrades[i] = scanner.nextDouble();
        }

        scanner.close();
        return inputGrades;
    }

    //compute highest, lowest,
    private static void highLow(double[] inputGrades){

        //search the highest grades
        double highest = inputGrades[inputGrades.length - 1];
        System.out.println("Highest grades: " + highest);

        //search the lowest grades
        double lowest = Arrays.stream(inputGrades).min().getAsDouble();
        System.out.println("Lowest grades: " + lowest);

    }

    private static void average(double[] inputGrades) {
        //search the average grades
        double sum = 0.0;

        for(double result : inputGrades){
            sum = sum + result;
        }
        //compute average based on length of arrays

        double avg = sum / inputGrades.length;
        System.out.printf("Average grades: %.2f" , avg);
//        return new double[] {highest, lowest ,avg};
    }


}
