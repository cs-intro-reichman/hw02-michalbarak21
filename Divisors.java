/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		/// Gets input from user as int
		int num = Integer.parseInt(args[0]); 
		/// Starts checking every number from 1 to num that was given by user 
		for (int i = 1; i < num+1; i++) {
			/// if num % i returns true, num % i is a divisor of num
			/// therefore, we will save it under string 'result'
			if (num % i == 0) {
				System.out.println(i);	
			}
		}

	}
}
