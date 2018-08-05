import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int total = 0;
        int howmany = 0;
        int odd = 0;
        int even = 0;
        System.out.println("Type numbers: ");
        while (true) {
            int num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
                
            } else {
                total += num;
                howmany++;
                if ((num % 2) == 0) {
                    even++;
                } else {
                    odd++;
                }
                    
            }
            
            
        }
            System.out.println("Thank you and see you later!");
            System.out.println("The sum is " + total);
            System.out.println("How many numbers: " + howmany);
            System.out.println("Average: " + ((double)total / howmany));
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
            
            
    }
}
