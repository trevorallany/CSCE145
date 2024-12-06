/*
 * Written by Trevor Yarborough
 */
import java.util.Scanner;
public class TriangleMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		String ast = "*";
		System.out.println("Welcome to the triangle maker! Please enter the size of triangle you would like and we'll have it out for "
				+ "\nya in a jiffy!");//prompting user for input
		
		int height = keyboard.nextInt();//gathering input
		
		if (height >1)//seeing that if the inputted value is greater than one, we run our for statements.
		{
			for (int i = 0; i<=height; i++ )//i equals 0 to begin with. as long as it is less than the inputted height, we add one to i, and go through our for loop. 
			{
				for (int j = 0; j<i; j++)//j equals 0 to begin with. as long as it is less than i, we print an asterisk. 
				{
					System.out.print(ast);
				}
				System.out.println();//this puts us on the next line before we run through the for loop again.
			}
		{
			for (int i = height-1; i>=1; i-- )//i will now equal the height of the triangle, so we take one away from the height, and set i equal to that. 
				//after that, we check and make sure that i is greater than, or equal to, 1, then we run the for loop, and take one away from i.
			{
				for (int j = 0; j<i; j++)//j is set to 0 again, and since that is less than i, we print out the number of asterisks equal to the correct position.
				{
					System.out.print(ast);
				}
				System.out.println();
			}
		}
		System.out.println("There ya go! A real, genuine triangle!");
		}	
		if (height <= 0)//if the height is zero, or any negative number, we show invalid input, and then end the program. 
		{
			System.out.println("That's Invalid! Try again!");
			System.exit(0);
		}
		if (height == 1)
		{
			System.out.println("That's too small to be a triangle!");
			System.exit(0);
		}

	}
}
