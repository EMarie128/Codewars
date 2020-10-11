import java.lang.Math.*;

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
      //the sum of the row is just the row number cubed
      return (int)Math.pow(n, 3);
    }
}