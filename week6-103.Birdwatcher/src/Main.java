
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdWatcher birds = new BirdWatcher(scanner);
        String option;
        
        while(true){
            System.out.println("?");
            option = scanner.nextLine();
            if(option.equals("Quit")) break;
            else if(option.equals("Add")) addBirds(scanner, birds);   
            else if(option.equals("Observation")){
                System.out.println("What was observed:?");
                String name = scanner.nextLine();
                observeBird(name, birds);
            }
            else if(option.equals("Statistics")) birds.Statistics();
            else if(option.equals("Show")){
                System.out.println("What?");
                String name = scanner.nextLine();
                showBird(name, birds);
            }
            
        }
    }
    
    public static void addBirds(Scanner scanner, BirdWatcher b){
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Latin name:");
        String latinName = scanner.nextLine();
        
        b.Add(name,latinName);
    }
    public static void observeBird(String name,BirdWatcher b){
        for(Bird w:b.birds()){
            if(name.equals(w.getName())){
                w.addObservation(); return;
            }
        }
        System.out.println("Is not a bird");
    }
    public static void showBird(String name,BirdWatcher b){
        for(Bird bb:b.birds()){
            if(name.equals(bb.getName())){
                System.out.println(bb);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}
