
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Type another number: ");
        int b = Integer.parseInt(scanner.nextLine());
        
        System.out.println("");
        System.out.println("The bigger number of the two numbers given was: "+ Math.max(a, b));
    }
}
