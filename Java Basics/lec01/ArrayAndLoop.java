public class ArrayAndLoop {
	public static void main(String[] args) {
		double[] classAverage = {98.2, 89.4, 97.11, 90.20, 88.32};
		
		// for
		// while
		// do-while
		// foreach
		int count = 0;

		while (count < classAverage.length) {
			System.out.println("Average: " + 
				classAverage[count]);
			count++;
		}
	}
}