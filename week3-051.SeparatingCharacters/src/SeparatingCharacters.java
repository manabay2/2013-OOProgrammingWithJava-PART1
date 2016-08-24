
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int x = name.length();
        int y=0;
        while(y<x){
            System.out.println((y+1)+". character: "+name.charAt(y));
            y++;
        }
        
    }
}
