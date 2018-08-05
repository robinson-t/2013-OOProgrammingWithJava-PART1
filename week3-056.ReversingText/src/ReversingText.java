
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int len = text.length();
        String newtext = "";
        while ( len > 0 ) {
            char character = text.charAt(len - 1);
            newtext = newtext + character;
            len--;
            
        }
        
        // note that method does now print anything, it RETURNS the reversed string
        return newtext;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
