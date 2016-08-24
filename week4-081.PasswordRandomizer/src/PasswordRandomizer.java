import java.util.Random;

public class PasswordRandomizer {
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {   
        
        String newPass = "";
        Random random = new Random();
        
        for(int i=0;i<this.length;i++){
        int character = random.nextInt(26);
        char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(character);
        newPass+=symbol;
        }
        
        return newPass;
    }
}
