
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        System.out.println(calculateCharacters(text));
    }
    
    public static int calculateCharacters (String text){
        return text.length();
    }
    
}
