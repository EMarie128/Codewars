//IN PROGRESS

import java.util.*;

class Diamond {
  public static String print(int n) {
    
    //check if negative, even, or zero
    if((n % 2 != 0) && (n > 0)){
      //create string
      StringBuilder diamonds = new StringBuilder();

      for(int i = 0; i <= (n/2); i+=2){
        
        for(int j = 0; j <= i; j++){ 
          diamonds.append("*");
        }
        diamonds.append("\n");
      }
      
      if(n == 1){
        return diamonds.toString();
      }else{
        for(int k = 0; k < (n - (n/2)); k+=2){
          for(int m = n; m > k; m--){
            diamonds.append("*");
          }
          diamonds.append("\n");
        }
      }//end if else
      
      return diamonds.toString();
    }else
      return null;
	}
}