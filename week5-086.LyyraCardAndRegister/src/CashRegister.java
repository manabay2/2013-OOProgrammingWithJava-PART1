
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        double priceEconomical = 2.5;

        if (cashGiven >= priceEconomical) {
            this.cashInRegister += priceEconomical;
            this.economicalSold++;
            return cashGiven - priceEconomical;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        double priceGourmet = 4;
        if(cashGiven>=priceGourmet){
            this.cashInRegister += priceGourmet;
            this.gourmetSold++;
            return cashGiven-priceGourmet;
        }          
        else return cashGiven;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card){
        double priceEconomical = 2.5;
        if(card.balance()>=priceEconomical){            
            this.economicalSold++;
            card.pay(priceEconomical);
            return true;
        }          
        else return false;
    }
    
    public boolean payGourmet(LyyraCard card){
        double priceGourmet = 4;
        if(card.balance()>=priceGourmet){            
            this.gourmetSold++;
            card.pay(priceGourmet);
            return true;
        }          
        else return false;
    }
        
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum>=0){
        card.loadMoney(sum);
        cashInRegister += sum;
        }
    } 
}
