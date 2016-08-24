
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int sum = 0;
        
        System.out.print("Type a number: ");
        a = Integer.parseInt(reader.nextLine());
        //System.out.println("");
        
        System.out.print("Type another number: ");
        b = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        sum+=a+b;
        System.out.println("Sum of the numbers: "+ sum);
        
        
    }
}
