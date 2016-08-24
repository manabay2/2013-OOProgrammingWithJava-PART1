import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        
        this.numbers = new ArrayList<Integer>();
        
        while(true){
            Random random = new Random();
            int j;
            
            j = random.nextInt(39)+1;
            if(!containsNumber(j)) this.numbers.add(j);
            if(numbers.size()==7) break;
        }
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)) return true;
        return false;
    }
}
