import java.util.Scanner;

public class Conditions {
	public static void main(String[] args) {

		// This program, suggests a small walk, 
		// according to the weather condition.
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a condition: ");
		String condition = in.nextLine();

		if (condition.equals("Rainy")) {
			System.out.println("It is: " + condition);
			System.out.println("We suggest you a 5min walk.");
		} else if (condition.equals("Cloudy")) {
			System.out.println("It is: " + condition);
			System.out.println("We suggest you a 15min walk.");
		} else {
			System.out.println("We suggest you a 30min walk,"
			 + "plus a cup of tea.");
		}
	}
}