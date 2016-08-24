
import java.util.ArrayList;


public class Phonebook {
    private ArrayList<Person> list;
    
    public Phonebook(){
        list =new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        Person p = new Person(name, number);
        list.add(p);
    }
    public void printAll(){
        for(Person p:list)
            System.out.println(p.getName()+" number: "+p.getNumber());
    }
    public String searchNumber(String name){       
        for(Person p: list){
            if(p.getName().equals(name)) return p.getNumber();
        }
        return "number not known";
    }
}
