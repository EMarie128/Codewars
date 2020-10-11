public class FindOutlier{
  static int find(int[] integers){
    //initialize return value
    int number = -1;
    //check overall array's int type by looking at first 3 values
    int evenCount = 0;
    for(int i = 0; i < 3; i++){
      if(integers[i] % 2 == 0)
        evenCount++;
    }//if this evenCount results in 2 or more, the array is even overall
    
    if(evenCount >= 2){//checking for an odd value
      for(int num: integers){
        if(num % 2 != 0){
          number = num;  //if odd value is found, set return value and break
          break;
        }//end if
      }//end for
    }else{//checking for an even value
      for(int num: integers){
        if(num % 2 == 0){
          number = num;  //if even value is found, set return value and break
          break;
        }//end if
      }//end for
    }//end if else
    return number;
  }//end find()
}//end class