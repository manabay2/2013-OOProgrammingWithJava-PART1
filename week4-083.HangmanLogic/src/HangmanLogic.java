
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {

        if(this.guessedLetters.contains(letter));
        else {
            if(!this.word.contains(letter))
            this.numberOfFaults++;
            this.guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        String hidden = "";
        int i = 0;
        String s = "";
        
        for(;i<word.length();i++){
            s=""+word.charAt(i);
            if(guessedLetters.contains(s)) hidden+=s;
            else hidden+="_";
        }
        
        return hidden;
    }
}
