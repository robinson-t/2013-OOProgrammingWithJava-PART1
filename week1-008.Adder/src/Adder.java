
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                System.out.println("Type a number:");
                int numberOne = Integer.parseInt(reader.nextLine());
                System.out.println("Your next number:");
                int numberTwo = Integer.parseInt(reader.nextLine());
                int total = numberOne + numberTwo;
                System.out.println("Sum of the numbers: " + total);
        
    }
}
