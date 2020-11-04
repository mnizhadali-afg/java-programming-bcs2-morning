public class MethodOverloading {
  public static void main(String[] args) {
    printMessage();
    printMessage("Ali");
    printMessage("Orfan", 28);
  }

  private static void printMessage() {
    System.out.println("Good Morning");
  }

  private static void printMessage(String name) {
    System.out.println("Good Morning: " + name);
  }

  private static void printMessage(String name, int weather) {
    System.out.println("Good Morning: " + name);
    System.out.println("Today is: " + weather + "C");
  }
 }