import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this(name, birthday.getDay(), birthday.getMonth(), birthday.getYear());        
    }   
    
    public Person(String name){
        this(name,Calendar.getInstance().get(Calendar.DATE), 
                  Calendar.getInstance().get(Calendar.MONTH) + 1,
                  Calendar.getInstance().get(Calendar.YEAR) );
    }
    
    public int age() {

        int day = Calendar.getInstance().get(Calendar.DATE) ;
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR); 
        MyDate now = new MyDate(day, month, year); 
        
        return now.differenceInYears(birthday);        
    }
    
    public int ageInDays(){
        int day = Calendar.getInstance().get(Calendar.DATE) ;
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR); 
        MyDate now = new MyDate(day, month, year);
        
        return now.difference(birthday);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if(this.ageInDays()> compared.ageInDays()) return true;
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    
}
