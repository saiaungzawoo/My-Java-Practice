import java.util.Random;

public class DiceSimulator {

    public static void main(String[] args) {

        //create a random object
        Random random = new Random();

        //rolling one die ten times
        dieRoll(random);

        System.out.println();

        //rolling two dice ten times
        diceRoll(random);
    }

    private static void dieRoll(Random random) {

        System.out.println("You are rolling one die.");

        //rolling 10 times
        for (int i = 0; i < 10; i++) {
            int randomDie = random.nextInt(1, 7); // 1 to 6 //(Available in Java 17 and later)

            System.out.println("Roll " + (i+1) + ": " + " = " + " " + randomDie);
        }
    }

    private static void diceRoll(Random random){

        System.out.println("You are rolling two dice.");

        //rolling 10 times

        for (int i = 0; i < 10; i++) {
            int die1 = random.nextInt(6) + 1; // 1 to 6 //traditional way
            int die2 = random.nextInt(6) + 1;

            int twoDice = die1 + die2;

            System.out.println("Roll " + (i+1) + ": " + die1 + " + " + die2 + " = " + twoDice);
        }
    }
}