
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 0;
        int counter = 0;

        // program your solution here. Do not touch the above lines!
        while (guess != numberDrawn) {
            System.out.println("Guess a number:");
            guess = Integer.parseInt(reader.nextLine());
            counter++;
            if (guess == numberDrawn) {
                break;
            } else if (guess < numberDrawn){
                System.out.println("The number is greater, guesses made: " + counter);
            } else {
                System.out.println("The number is lesser, guesses made: " + counter);
            }
        } System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
