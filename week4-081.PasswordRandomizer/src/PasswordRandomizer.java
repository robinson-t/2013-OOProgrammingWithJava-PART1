import java.util.Random;

public class PasswordRandomizer {
    Random random = new Random();
    private int length;
    private String password = "";
    private char newletter;
    private int newint;
    
    public PasswordRandomizer(int length) {
        this.length = length;
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        this.password = "";
        int i = this.length;
        while (i > 0) {
            this.newint = random.nextInt(26);
            this.newletter = "abcdefghijklmnopqrstuvwxyz".charAt(newint);
            this.password += Character.toString(newletter);
            i--;
        }
        return this.password;
    }
}
