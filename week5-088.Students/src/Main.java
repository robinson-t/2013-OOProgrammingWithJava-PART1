
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.println("name: ");
            String newname = reader.nextLine();
           if (!newname.isEmpty()) {
               System.out.println("studentnumber: ");
               String id = reader.nextLine();
               list.add(new Student(newname, id));
               
           } else {
               break;
           }
        }
        
        for (Student stds : list) {
            System.out.println(stds);
        }
        
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result: ");
        for (Student stds : list) {
            if (stds.getName().contains(term)) {
                System.out.println(stds);
            }
        }
        
    }
}
  