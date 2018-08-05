
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int power = 0;
        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        int total = 0;
        while (power <= limit) {
            total += (int)Math.pow(2 , power);
            power++;
            
        } System.out.println("The result is " + total);
                

    }
}
