import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();
       
        System.out.println("Type numbers:");
        int i=0;
        while(true){     
            
            i= Integer.parseInt(reader.nextLine());
            if(i == -1) break;    
            
            if(i!= -1)stats.addNumber(i);
            if(i%2==0) statsEven.addNumber(i);            
            else statsOdd.addNumber(i);
            
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum of odd: " + statsOdd.sum());
    }
}
