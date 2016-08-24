
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        double x = 0;
        
        while(true){
        System.out.println("Type floating point numbers");
        x = Double.parseDouble(reader.nextLine());
        
        if(!(x<-30 || x>40))
        Graph.addNumber(x);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}