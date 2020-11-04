public class Methods {
  public static void main(String[] args) {
    String name = "Ali";
    int age = 28;
    String message = printHelloWorld(name, age);
    System.out.println(message);
    
  } // end of main method

  // a method that prints a message
  public static String printHelloWorld(String name, int age) {
    // hello ali. he is 28 years old.
    return "Hello: " + name + ". He is " + age + " years old.";
  } // end of printHelloWorld()
}