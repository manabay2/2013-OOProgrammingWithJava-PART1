import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        
        Grades grades = new Grades(scanner);
        grades.getScores();
        grades.countGrades();
        grades.printGrades();
        
        
        
    }
}
