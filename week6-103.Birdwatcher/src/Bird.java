public class Bird {
    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName, int observation){
        this.name = name;
        this.latinName = latinName;
        this.observation = observation;
    }
    public Bird(String name, String latinName){
        this(name,latinName,0);
    }
    public String getName() {
        return name;
    }
    public String getLatinName() {
        return latinName;
    }
    public int getObservation() {
        return this.observation;
    }
    public void addObservation() {
        this.observation++;
    }
    public String toString(){
        return this.name+" ("+this.latinName+"): "+this.observation+" observations";
    }
        
}
