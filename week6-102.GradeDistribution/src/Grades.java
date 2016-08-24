
import java.util.ArrayList;
import java.util.Scanner;

public class Grades{
    private ArrayList<Integer> list;
    private Scanner scanner;
    private int[] grades;
    
    public Grades(Scanner scanner){
        this.scanner = scanner;
        list = new ArrayList<Integer>(); 
        grades = new int[6];
        
        for(int i=0;i<grades.length;i++)
            grades[i]=0;        
    }
    public void getScores(){
        System.out.println("Type exam score, -1 completes:");
        while(true){
            int score = Integer.parseInt(scanner.nextLine());
            if(score == -1) break;
            if(score>=0 && score<=60)
                list.add(score);
        }
    }
    private int getGrade(int x){
        if(x<30) return 0;
        if(x<35) return 1;
        if(x<40) return 2;
        if(x<45) return 3;
        if(x<50) return 4;
        return 5;
    }
    public void countGrades(){
        for(int score:list){
            int grade = getGrade(score);
            for(int i=0;i<grades.length;i++){
                if(grade==i) grades[i]++;
            }
        }
    }    
    public double getAccPercent(){
        double sum = 0;
        for(int i=0;i<grades.length;i++){
            sum+= grades[i];
        }
        if(sum ==0) return 0;
        return (sum-grades[0])*100/sum;        
    }
    public void printGrades(){
        System.out.println("Grade distribution:");
        for(int i=5;i>=0;i--){
            System.out.print(i+": ");
            for(int j=0;j<grades[i];j++)
                System.out.print("*");
            System.out.println();
        }
         System.out.println("Acceptance percentage: " + getAccPercent());
    }
    
    
    
}