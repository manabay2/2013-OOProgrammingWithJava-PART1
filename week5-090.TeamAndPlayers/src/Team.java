
import java.util.ArrayList;


public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int maxSize = 16;
    
    public Team(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if(list.size() < this.maxSize)list.add(player);        
    }
    
    public void printPlayers(){
        for(Player p : list){
            System.out.println(p.getName()+", goals "+p.goals());
        }
    }
    
    public int size(){
        return list.size();
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
        if(list.size()>this.maxSize){
            for(int i= this.maxSize; i<list.size();i++){
                list.remove(i);                
            }
        }
    }
    
    public int goals(){
        int sum = 0;
        for(Player p : list)
            sum+= p.goals();
        return sum;
    }
    
    
    
}
