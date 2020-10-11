using System;

public static class Kata
{
  public static string Likes(string[] name)
  {
    //initialize variable with array length
    int elements = name.Length;
    
    //depending on the length, different strings get returned
    switch(elements){
      case 0: 
        return "no one likes this";
        break;
      case 1:
        return name[0] + " likes this";
        break;
      case 2:
        return name[0] + " and " + name[1] + " like this";
        break;
      case 3:
        return name[0] + ", " + name[1] + " and " + name[2] + " like this";
        break;
      default:
        return name[0] + ", " + name[1] + " and " + (elements - 2) + " others like this";
        break;
    }//end switch
  }
}
