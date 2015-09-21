package Loops;
/**
 * 
 * fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8
 * 
 * @author Radhika
 *
 */
public class FibonaciSeries {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = Integer.parseInt(args[0]);
		int[] series = new int[limit];
		series[0] = 0;
		series[1] = 1;
		for (int i = 2; i < limit; i++) {
			series[i] = series[i - 1] + series[i - 2];
		}

		System.out.println("Fibonacci Series upto " + limit);
		for (int i = 0; i < limit; i++) {
			System.out.print(series[i] + " ");
		}
	}

}
