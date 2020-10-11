import java.lang.Math.*;

public class NumberFun {
  public static long findNextSquare(long sq) {
      //get the square root value
      int sqrValue = (int)Math.sqrt(sq);
      
      //if the square root value is not an int,
      //the given number was not a perfect square
      if(!(sqrValue == Math.sqrt(sq))){
        return -1;
      }//end if
      else{
        do{//this loop continues until a perfect square is found
          sq++;
          sqrValue = (int)Math.sqrt(sq);  //get the sqrt value
          if((sqrValue == Math.sqrt(sq))){  //check if it's an int
            return sq;  //return the value
          }//end if
        }while(true);
      }//end else
  }//end findNextSquare()
}//end class