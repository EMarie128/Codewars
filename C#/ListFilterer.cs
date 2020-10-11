using System.Collections;
using System.Collections.Generic;

public class ListFilterer
{
   public static IEnumerable<int> GetIntegersFromList(List<object> listOfItems)
   {
     //make new list
     List<int> newList = new List<int>();
               
      for(int i = 0; i < listOfItems.Count; i++){
        if(listOfItems[i].GetType() == i.GetType()){
          newList = newList.Concat(new[] { (int)listOfItems[i] });
        }
      }

      return newList;
   }
}