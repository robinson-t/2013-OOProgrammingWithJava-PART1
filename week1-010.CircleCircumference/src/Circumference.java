
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your radius:");
        double radius = Integer.parseInt(reader.nextLine());
        double circumference = radius * 2 * Math.PI;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
