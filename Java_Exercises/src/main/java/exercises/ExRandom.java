import java.util.Random;

public class ExRandom {

    public static void main(String[] args) {

        //Dice rolling simulator
        //rolling one die ten times

        diceRoll();
    }

    private static void diceRoll() {

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomDice = random.nextInt(1, 7); // 1 to 6 //(Available in Java 17 and later)
            System.out.println("Roll " + (i+1) + " " + "=" + " " + randomDice);
        }


    }
}
