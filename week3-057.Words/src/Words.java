import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.print("Type a word: ");
            String x = reader.nextLine();
            
            if(!(x.isEmpty()))
                words.add(x);
            else break;
        }
        System.out.println("You types the following words:");
        for(String word: words){
            System.out.println(word);
        }
    }
}
