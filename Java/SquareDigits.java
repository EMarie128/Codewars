import java.util.ArrayList;
import java.lang.Math;

public class SquareDigit {

  public int squareDigits(int n) {
  
    //create array list to add new elements to
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    do{
      //get each digit and add to first index of arr
      arr.add(0, n % 10);
      //reduce the initial int value
      n = n / 10;
    }while(n > 0);
        
    //create string to allow for each concatentation
    String str = "";
    //iterate through newly produced array and square each value,
    //adding each to the string
    for(int i = 0; i < arr.size(); i++){
      arr.set(i, (int)Math.pow(arr.get(i), 2));
      str += arr.get(i);
    }//end for    
    
    //return the string as an integer
    return Integer.valueOf(str);
  }//end SquareDigits
}//end class