
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int first;
        int last;
        System.out.println("First: ");
        first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        last = Integer.parseInt(reader.nextLine());
        while (first <= last) {
            System.out.println(first);
            first++;
        }

    }
}
