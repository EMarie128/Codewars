import java.util.*;

public class StringSplit {
    public static String[] solution(String s) {
        //create new list
        ArrayList<String> arrList = new ArrayList<String>();
        String section = "";
        //get length
        int length = s.length();
        if(length % 2 == 0){
          for(int i = 0; i < s.length(); i += 2){
            section = s.substring(i, i + 2);
            arrList.add(section);
          }
        }else{
            for(int i = 0; i < s.length(); i += 2){
              if(i == (s.length() - 1)){
                section = s.substring(i, i + 1) + "_";
              }else{
                section = s.substring(i, i + 2);
              }
              arrList.add(section);
            }
        }
        String[] returnArr = new String[arrList.size()];
        returnArr = arrList.toArray(returnArr);
        return returnArr;
    }
}