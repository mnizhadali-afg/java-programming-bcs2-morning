public class RaggedArray {
  public static void main(String[] args) {
    int[][] raggedArray = {
      {1, 2, 3, 4, 5},
      {1, 2, 3, 4},
      {1, 2, 3},
      {1, 2},
      {1}
    };

    System.out.println("\nHere is Ragged Array: \n");
    for (int row = 0; row < raggedArray.length; row++) {
      for (int col = 0; col < raggedArray[row].length; col++) {
        System.out.print(raggedArray[row][col] + " ");
      }
      System.out.println();
    }
  }
}