    
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.print("Type a word: ");
            String x = reader.nextLine();
            if(!(words.contains(x)))
                words.add(x);
            else
            {
                System.out.println("You typed the word "+x+" twice");
                break;
            }
        }
        
    }
}
