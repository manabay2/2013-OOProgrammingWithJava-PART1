
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int grade = 0;
        
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        if(points>=0 && points<=29)
            System.out.println("failed");
        else if(points>60)
            System.out.println("Invalid entry");
        else{
        if(points>29 && points<=34)
            grade =1;
        else if(points>34 && points<=39)
            grade = 2;
        else if(points>39 && points<=44)
            grade = 3;
        else if(points>44 && points<=49)
            grade = 4;
        else if(points>49 && points<=60)
            grade = 5;
            System.out.println("Grade: "+grade);
                }
            
    }
}
