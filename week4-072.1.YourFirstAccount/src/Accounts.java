
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        //initial state
        Account euAccount = new Account("Eugen Milas",100.0);
        
        //deposit 20.0
        euAccount.deposit(20.0);
        
        //print state.
        System.out.println(euAccount);
        
    }

}
