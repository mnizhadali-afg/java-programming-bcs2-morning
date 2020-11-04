public class Claculator {
  
  public static void main(String[] args) {
    int x = 25;
    int y = 11;
    int z = 7;

    double result1 = sum(x, y, z);
    int result2 = sub(x, y);

    System.out.println("Sum: " + result1);
    System.out.println("Subtract: " + result2);
  }

  // sum of numbers
  public static double sum(int x, int y, double z) {

    double sum = x + y + z;
    return sum;
  }

  // subtract numbers
  private static int sub(int x, int y) {
    int result = (x - y);
    return result;
  }
}