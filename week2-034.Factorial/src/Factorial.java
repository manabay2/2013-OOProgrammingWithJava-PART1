import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int iterator = 1, factorial = 1;
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        if(number == 0 || number ==1)
            System.out.println("Factorial is 1");
        else{
            while(iterator<=number){
                factorial*=iterator;
                iterator++;
            }
            System.out.println("Factorial is "+factorial);
        }

    }
}
