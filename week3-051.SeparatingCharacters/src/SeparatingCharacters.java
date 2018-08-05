
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int len = name.length();
        int start = 1;
        char cur;
        int index = 0;
        while (len > 0) {
            cur = name.charAt(index);
           
            System.out.println(start + ". character: " + cur);
            len--;
            start++;
            index++;
        }
    }
}
