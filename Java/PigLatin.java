import java.util.*;

public class PigLatin {
    public static String pigIt(String str) {
      
      String[] words = str.split(" ");
      String output = "";
      char firstLetter = 'a';
      String letter = "";
      
      for(int i = 0; i < words.length; i++){

        if(!(words[i].equals("!"))){
            firstLetter = words[i].charAt(0);
            letter = String.valueOf(firstLetter);
  
            words[i] = words[i].replaceFirst(letter, "");
          
            if(i != words.length - 1){
              words[i] += ("" + letter + "ay ");
            }else{
              words[i] += ("" + letter + "ay");
            }            
        }
        
        output += words[i];
      }      
        return output;
    }
}