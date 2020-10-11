var uniqueInOrder=function(iterable){
  //declarations
  var prev = null;
  var arr = new Array();
  //convert given value to array
  var givenArr = Array.from(iterable);
  
  //iterate through
  givenArr.forEach(function(item){
    //check if the current item matches the previous one,
    //and if it doesn't, add it to the new array and update
    //the previous item
    if(item != prev){
      arr.push(item);
      prev = item;
    }//end if
  });
  
  return arr;
}//end uniqueInOrder