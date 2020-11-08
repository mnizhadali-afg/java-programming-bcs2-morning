public class PassArrayToMethod {
  public static void main(String[] args) {
    String[] studentNames= {"Jamil", "Maryam", "Shams", "Jaweed"};
    int[] numbers = {12, 11, 10, 9, 8};

    // displayStudentNames(studentNames);
    // displayStudentIDNo(numbers);
    int result = sumOfArrayIndex(numbers);
    System.out.println("Sum of Array Indices: " + result);
  }

  private static void displayStudentNames (String[] stds) {
    for (String e: stds) {
      System.out.println("Name: " + e);
    }
  }

  private static void displayStudentIDNo(int[] ids) {
    for (int i = 0; i < ids.length; i++)
      System.out.println("ID: " + ids[i]);
  }

  private static int sumOfArrayIndex(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = nums[i] + sum; 
    }    
    return sum;
  }
}