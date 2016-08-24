
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        Money x = new Money (this.euros()+added.euros(), this.cents()+added.cents());
        return x;
    }
    public boolean less(Money compared){
        if(this.euros()<compared.euros()) return true;
        if(this.euros()==compared.euros()){
            if(this.cents()<compared.cents()) return true;
        }
        return false;
    }    
    public Money minus(Money decremented){
        Money m;
        
        if(decremented.euros()>this.euros()){            
            m = new Money(0,0);            
        }
        else if(decremented.euros()== this.euros() && decremented.cents()>this.cents())
            m = new Money(0,0);
        else{
            int totalHave = this.euros()*100+this.cents();
            int totalLose = decremented.euros()*100+decremented.cents();
            int remaining = totalHave - totalLose;
            
            int remainEuro = remaining/100;
            int remainCents = remaining%100;
            
            m = new Money(remainEuro, remainCents);
        }
        return m;
    }

}
