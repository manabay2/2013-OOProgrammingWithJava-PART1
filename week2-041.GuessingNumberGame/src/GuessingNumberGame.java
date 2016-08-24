
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int counter = 0;
        
        while(true){
        System.out.print("Guess a number: ");
        int number = Integer.parseInt(reader.nextLine());
        counter++;
        
        if(number == numberDrawn){
            System.out.println("Congratulations, your guess is correct!");
            break;
        }
        else if (number<numberDrawn)
            System.out.println("The number is greater, guesses made "+counter);
        else
            System.out.println("The number is lesser, guesses made "+counter);
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
