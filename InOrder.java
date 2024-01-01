/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		/// Generate a number in range [0,10) and generate a boolean to check if decreasing order value is met
		int num = (int) (Math.random() * 10);
		boolean isDecreasing = false; 
		/// As long as num - new_num =! 1, the loop will generate a new number and check if criteria is met
		do { 
			int new_num = (int) (Math.random() * 10);
			System.out.print(num + " ");
			if (num - new_num >= 1) {
				isDecreasing = true;
			}
			num = new_num;
		}
		while (isDecreasing == false);  
	}
}
