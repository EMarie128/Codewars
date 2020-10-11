using System;

public class Kata
{
  public static int CountBits(int n)
  {
    //initialize count variable
    int count = 0;
  
    //convert given int into binary string
    string binary = Convert.ToString(n, 2);
    
    //iterate through each character in string
    //and check occurence of 1's
    foreach(char ch in binary){
      if(ch == '1'){
        count++;
      }//end if
    }//end foreach
    
    //return # of 1's
    return count;
  }//end CountBits
}//end class
