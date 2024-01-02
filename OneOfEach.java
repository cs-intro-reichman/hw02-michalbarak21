
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Generate a boolean argument to follow if the family has a boy / girl and a count integer
		boolean girl = false; 
		boolean boy = false;
		int count = 0; 
		while (girl == false || boy == false) {
			/// Generate a random number between [0, 1)
			/// values greater than 0.5 are considered girls, lower are considered boys
			double number = Math.random(); 
			if (number > 0.5) { 
				girl = true; 
				System.out.print("g ");
			} else { 
				boy = true; 
				System.out.print("b ");
			}
			count++;
		}
		System.out.println();
		System.out.print("You made it... and you now have " + count + " children.");
	}
}
