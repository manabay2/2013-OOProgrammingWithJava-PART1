
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Type your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        System.out.println("");
        
        System.out.print("Type your name: ");
        String name2 = scanner.nextLine();
        
        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("");
        
        System.out.println(name+" and "+name2+" are "+(age+age2)+" years in total.");
        
    }
}
