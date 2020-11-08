public class GradeTest {
  public static void main(String[] args) {
    char[][] answers = {
      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'D', 'A', 'B', 'B', 'C', 'E', 'A', 'B', 'C'},
      {'A', 'A', 'B', 'B', 'B', 'D', 'E', 'A', 'B', 'E'},
      {'B', 'C', 'A', 'A', 'E', 'B', 'B', 'A', 'C', 'B'},
      {'C', 'A', 'B', 'A', 'A', 'E', 'C', 'C', 'B', 'E'}
    };

    char[] keys = {'D', 'B', 'A', 'C', 'D', 'E', 'A', 'B', 'A'};

    for (int i = 0; i < answers.length; i++) {
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == keys[j])
          correctCount++;
      }
    }
  }
}