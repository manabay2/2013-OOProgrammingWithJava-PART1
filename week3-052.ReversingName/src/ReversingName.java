import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int x=name.length()-1;
        String reverse="";
        
        while(x>=0){
            reverse+= name.charAt(x);
            x--;
        }
        System.out.println("In reverse order: "+reverse);
    }
}
