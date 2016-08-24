
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public int getRooms(){
        return this.rooms;
    }
    public int getSquareMeters(){
        return this.squareMeters;
    }
    
    public boolean larger(Apartment otherApartment){
        if(this.rooms > otherApartment.rooms) return true;
        if(this.rooms == otherApartment.rooms 
                && this.squareMeters > otherApartment.squareMeters) return true;
        return false;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        if(this.pricePerSquareMeter > otherApartment.pricePerSquareMeter) return true;
        return false;
    }
    
    public int price(){
        return this.pricePerSquareMeter * this.squareMeters;
    }
    public int priceDifference(Apartment a){
        int amount = this.price() - a.price();
        if(amount<0) return -1*amount;
        return amount;
    }
   
    
}
