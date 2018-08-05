import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> grades = new ArrayList<Integer>();
        System.out.println("Type exam scored, -1 completes:");
        while (true) {
            int points = Integer.parseInt(reader.nextLine());
            if (points == -1) {
                break;
            }
            if ((points <= 60) && (points >= 0)){
                grades.add(points);
            }
        }
        GradeHandler analyse = new GradeHandler(grades);
        analyse.print();
    }
}
