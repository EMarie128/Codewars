public class Vowels {
  public static int getCount(String str) {
    //initialize vowelsCount var
    int vowelsCount = 0;
    //convert string contents to array
    char[] charArray = str.toCharArray();
    //iterate through the string and check for vowels,
    //incrementing the count if found
    for(char c: charArray){
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
              vowelsCount++;
              break;
            default:
              break;
        }//end switch
    }//end for
    //return number of vowels
    return vowelsCount;
  }//end getCount
}//end class