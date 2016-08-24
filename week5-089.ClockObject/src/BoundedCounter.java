
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value = 0;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }
    
    public void next(){
        if(this.value < this.upperLimit) this.value++;
        else reset();   
    }
    
    private void reset(){
        this.value = 0;
    }
    
    public String toString(){
        if(this.value>=10) return ""+this.value;
        return "0"+this.value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        if( !(value < 0 || value > this.upperLimit) )this.value = value;
    } 
}
