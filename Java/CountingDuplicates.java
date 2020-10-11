import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    // Write your code here
    //convert all letters to lowercase
    text = text.toLowerCase();
    
    //create a set because duplicates are not allowed
    Set<Character> set = new HashSet<Character>();
    int size = 0; 
    int newSize = 0;
    int count = 0;
    
    //iterate through the string
    for( int i = 0; i < text.length(); i++){
      Character current = new Character(text.charAt(i));
      if(current.equals(' ')){
        continue;
      }else{        
        size = set.size();
        set.add(current);
        newSize = set.size();
        //if the set did not grow, there was a duplicate
        if(size == newSize){
          //increment count
          //need to make sure the future chars that were already duplicated are removed
          count++;
          text = text.replaceAll(Character.toString(current), " ");
        }//end if
      }//end if else
    }//end for
    
    return count;
  }
}