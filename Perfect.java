/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Gets input from user as int 
		int num = Integer.parseInt(args[0]);
		/// Initiate the answer string as well as the sum value
		int sum = 1; 
		String answer = (num + " is a perfect number since " + num + " = 1"); 
		for (int i = 2; i < num; i++) {
			/// For each i checks if i is a divisor of num, and if so adds it to the sum & concatenates to the answer
			if (num % i == 0) {
				answer = answer + (" + ") + i;
				sum = sum + i; 
			}
		}
		/// Checks if the sum calcualted in the loop is equal to the input number
		/// If yes, then we have a perfect number; Otherwise, it is not a perfect number
		if (num == sum) {
			System.out.println(answer);
		} else {
			System.out.println(num + " is not a perfect number");
		}
	}
}
