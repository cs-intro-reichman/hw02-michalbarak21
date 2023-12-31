/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		/// Gets input from user
		int num = Integer.parseInt(args[0]);
		/// Creates a line in the damka board based on the number given by user
		String base = (" *"); 
		String line_even = (" *") + base.repeat(num - 1); 
		String line_odd = ("*") + base.repeat(num - 1) + (" ");
		for (int i = 1; i <= num; i++) {
			/// For each row checks if it's even or odd. 
			/// odd --> prints line as is; even --> adds space infront of the line to create indentation  
			if ( i % 2 == 1) {
				System.out.println(line_odd);
			} else { 
				System.out.println(line_even);
			}
		}
	}
}
