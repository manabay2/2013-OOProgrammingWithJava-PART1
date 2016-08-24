public class StringUtils {
    //public StringUtils(){};
    public static boolean included(String word, String searched){
        if(word.trim().toLowerCase().contains(searched.trim().toLowerCase())) 
            return true;
        return false;
    }
}
