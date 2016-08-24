import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
                
        Scanner reader = new Scanner(System.in);
        int sum=0, counter =0, countEven = 0, countOdd = 0;
        double average =0;
        
        System.out.println("Type numbers: ");
        while(true){            
            int number = Integer.parseInt(reader.nextLine());
            counter++;
            sum+=number;
            
            if(number%2==0)
                countEven++;
            else
                countOdd++;
            if(number==-1){
                System.out.println("Thank you and see you later!");
                sum++; counter--; average =(double) sum/counter;
                countOdd--;
                
                System.out.println("The sum is "+sum);
                System.out.println("How many numbers: "+counter);
                System.out.println("Average: "+average);
                System.out.println("Even numbers: "+countEven);
                System.out.println("Odd numbers: "+countOdd);
                    
                break;
            }
        }
    }
}
