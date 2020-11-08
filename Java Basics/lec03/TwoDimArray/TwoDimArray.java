public class TwoDimArray {
  public static void main(String[] args) {
    int[][] twoDimNums = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    for (int row = 0; row < twoDimNums.length; row++) {
      for (int col = 0; col < twoDimNums[row].length; col++) {
        System.out.print(twoDimNums[row][col] + " ");
      }
      System.out.println();
    }
  }
}