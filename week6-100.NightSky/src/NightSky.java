
import java.util.Random;


public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }    
    public NightSky(int width, int height){
        this(0.1, width, height);
    }
    public NightSky(double density){
        this(density, 20, 10);
    }
    public void printLine(){
        Random random = new Random();
        double d = 0;
        
        for(int i=0;i<this.width;i++){
            d = random.nextDouble();
            if(d<this.density){
                System.out.print("*");
                starsInLastPrint++;
            } else System.out.print(" ");
        }
        System.out.println("");
    }
    public void print(){
        for(int i=0;i<this.height;i++)
            printLine();
    }
    public int starsInLastPrint(){
        int starsNumber = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        return starsNumber;
    }
}
