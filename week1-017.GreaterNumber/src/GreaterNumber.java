import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int nOne = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int nTwo = Integer.parseInt(reader.nextLine());
        if (nOne > nTwo) {
            System.out.println("Greater number: " + nOne);
            
        } else if (nTwo > nOne) {
            System.out.println("Greater number: " + nTwo);
            
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
