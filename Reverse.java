/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		/// Gets input from user as string
		String input = args[0];
		for (int i = 0; i < input.length(); i++ ) {
			int idx = input.length() - 1 - i;
			System.out.print(input.charAt(idx));
		}
		System.out.println();
		/// Calculates the length of the string to find it's middle character
		/// if the length is an even number, it returns the character at index (len \ 2)
		/// if the length is an odd number, it returns the character at rounded up index (len + 1 \ 2) 
		if (input.length() % 2 == 0) {
			int idx = ( (input.length() ) / 2 ) - 1; 
			System.out.println("The middle character is " + input.charAt(idx));
			} else {
			int idx = (input.length() ) / 2; 
			System.out.println("The middle character is " + input.charAt(idx));
		 }
		}
	}

