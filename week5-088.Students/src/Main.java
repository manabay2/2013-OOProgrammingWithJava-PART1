
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("name: ");
            String name = scanner.nextLine();            
            
            if(name.isEmpty()) break;
            else{
                System.out.print("studentnumber: ");
                String studentNumber = scanner.nextLine();
                
                Student student = new Student(name, studentNumber);
                students.add(student);
            }
        }
        
        for(Student s: students){
            System.out.println(s);
        }
        System.out.println("");
        
        System.out.print("Give search term: ");
        String search = scanner.nextLine();
        System.out.println("Result:");
        
        for(Student s: students){
            if(s.getName().toLowerCase().contains(search.toLowerCase())) 
                System.out.println(s.toString());
        }
    }
}