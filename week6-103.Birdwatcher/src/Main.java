import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        BirdCollection collection = new BirdCollection();
        
        while (true) {
            System.out.println("? ");
            String command = reader.nextLine();
            
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();
                Bird added = new Bird(name, latinName);
                collection.addBird(added);
            } else if (command.equals("Observation")) {
                System.out.println("What was observed:? ");
                String input = reader.nextLine();
                if (collection.inCollection(input)) {
                    collection.addSighting(input);
                } else {
                    System.out.println("Is not a bird!");
                }
            } else if (command.equals("Statistics")) {
                collection.statistics();
            } else if (command.equals("Show")) {
                System.out.println("What? ");
                String input = reader.nextLine();
                if (collection.inCollection(input)) {
                    collection.printBird(input);
                } else {
                    System.out.println("Is not a bird!");
                }
            } else if (command.equals("Quit")) {
                break;
            }
        }
    
    
            
    }

}
