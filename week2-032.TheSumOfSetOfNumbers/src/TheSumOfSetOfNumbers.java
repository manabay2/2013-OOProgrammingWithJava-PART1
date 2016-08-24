
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x =1; int y=0;
        
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        
        while(x<=number){
            y+=x;
            x++;            
        }
        System.out.println(y);
    }
}
