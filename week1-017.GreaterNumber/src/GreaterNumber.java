import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Tye the second number: ");
        int b = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        if(a==b)
            System.out.println("The numbers are equal!");
        else
            System.out.println("Greater number: "+Math.max(a, b));

    }
}
