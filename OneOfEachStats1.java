/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		/// Accepts input from user as integer
		int T = Integer.parseInt(args[0]); 
		int sum = 0; 
		int twoChildren = 0; 
		int threeChildren = 0; 
		int fourChildren = 0; 
		for (int i = 1; i <= T; i++) {
			boolean girl = false; 
			boolean boy = false;
			int count = 0; 
			while (girl == false || boy == false) {
			/// Generate a random number between [0, 1)
			/// values greater than 0.5 are considered girls, lower are considered boys
				double number = Math.random(); 
				if (number > 0.5) { 
					girl = true; 
					//System.out.print("g ");
				} else { 
					boy = true; 
					//System.out.print("b ");
				}
			count++;
			}
			//System.out.println();
			//System.out.println("You made it... and you now have " + count + " children.");
			sum = sum + count;  
			if (count == 2) {
				twoChildren++;
			 } else if (count == 3) { 
				threeChildren++; 
			 } else if (count >= 4) {
				fourChildren++;
			 }
		}
		double avg = (double) sum / T ; 
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourChildren);
		int max = Math.max(threeChildren, fourChildren); 
		max = Math.max(max, twoChildren); 
		if (max == twoChildren) {
			System.out.println("The most common number of children is 2.");
		} else if (max == threeChildren) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4 or more.");
		}

	}
}

			
			
			