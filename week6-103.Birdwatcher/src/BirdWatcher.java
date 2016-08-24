
import java.util.ArrayList;
import java.util.Scanner;

public class BirdWatcher {
    private ArrayList<Bird> list;
    private Scanner scanner;
    
    public BirdWatcher(Scanner scanner){
        this.list = new ArrayList<Bird>();
    }
    public void Add(String name, String latinName){       
        list.add(new Bird(name,latinName));
    }    
    public void Statistics(){
        for(Bird b: list){
            System.out.println(b);
        }
    }
    public ArrayList<Bird> birds(){
        return this.list;
    }
}
