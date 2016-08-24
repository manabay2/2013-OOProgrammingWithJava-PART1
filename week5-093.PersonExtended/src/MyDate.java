
public class MyDate {

    private int day;
    private int month;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        MyDate start = this.earlier(comparedDate)? comparedDate:this;
        MyDate end   = this.earlier(comparedDate)? this: comparedDate;
        
        int dayz, monthz, yearz;
        
        dayz = start.day - end.day;
        monthz = start.month - end.month;
        yearz = start.year - end.year;
        
        if(dayz < 0) monthz--;
        if(monthz < 0) yearz--;
        
        return yearz;        
    }
    
    public int difference(MyDate compare){
        //returns difference in days
        MyDate start = this.earlier(compare)? compare:this;
        MyDate end   = this.earlier(compare)? this: compare;
        int sum = 0;
        
        sum+= start.day - end.day;
        sum+= ( start.month - end.month ) * 30;
        sum+= (start.year - end.year) * 365;
        
        return sum;               
    }

  
}