import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int st = 1;
        int total = 1;
        while (st <= num) {
            total *= st;
            st++;
        } System.out.println("Factorial is " + total);
    }
}
