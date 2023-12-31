import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
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
				double number = generator.nextDouble(); 
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

		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
