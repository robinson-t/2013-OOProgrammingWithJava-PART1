
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String input = reader.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                words.add(input);
            }
        }
        
        System.out.println("You typed the following words: ");
        Collections.sort(words);
        for (String anything : words) {
            System.out.println(anything);
        }
    }
}
