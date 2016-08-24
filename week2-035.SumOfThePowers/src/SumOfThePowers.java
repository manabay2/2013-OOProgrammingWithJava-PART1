
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int iterator = 0, sum=0;
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        while(iterator<=number){
            sum+=Math.pow(2, iterator);
            iterator++;
        }
        System.out.println("The result is "+sum);

    }
}
