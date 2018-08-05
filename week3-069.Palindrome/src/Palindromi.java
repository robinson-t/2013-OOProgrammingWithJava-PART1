import java.util.Scanner;

public class Palindromi {
    
    public static String reverse (String text) {
        int counter = 0;
        String reverse = "";
        int len = text.length()-1 ;
        while (len > -1) {
           reverse += text.charAt(len);
           len--;
           
        }
        
        return reverse;
    }

    public static boolean palindrome(String text) {
        String reverse = reverse(text);
        if (reverse.equals(text)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
