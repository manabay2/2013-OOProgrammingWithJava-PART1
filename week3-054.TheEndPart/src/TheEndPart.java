import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String result="";
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int len = Integer.parseInt(reader.nextLine());
        
        result = word.substring(word.length()-len);
        System.out.println("Result: "+result);
        
    }
}
