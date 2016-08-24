
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String x="";
        int len = text.length()-1;
        
        while(len>=0){
            x+=text.charAt(len);
            len--;
        }        
        return x;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
