public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    
    public int differenceInYears(MyDate comparedDate){

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
}
