/*
 * Written by Trevor Yarborough 
 */

import java.util.Scanner;
import java.util.Random;
public class RPSGame {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors. Paper beats rock, rock beats scissors, and scissors beats paper.\nPlay me!!!");
		String Keepplaying = ("Yes");
		int PlayerScore = 0;//Starting score must be zero
		int CompScore = 0;//Same for the computer
		int Rounds = 1;//Starting rounds at 1 so that it will print "Round 1" on the console
		
		while (Keepplaying.equalsIgnoreCase("Yes"))//The game loop. This will repeat every time we want to play the game.
		{
			while (Rounds != 5)//Game will never reach 5 rounds, so this loop will keep going until we stop it.
			{	
				System.out.println("It is round: "+Rounds + "\nYour score:"+PlayerScore+"\nMy score:"+CompScore);//Presenting the scores and the round 
				System.out.println("Please enter either Rock, Paper, or Scissors.");
				String Choice = keyboard.nextLine();//Taking input
				String[] Comp ={"Rock","Paper","Scissors"};//Creating an array of choices for random choosing
				Random r = new Random();
				int select = r.nextInt(Comp.length);
				System.out.println("I chose: "+Comp[select]);//using the random tool to choose randomly from the array
				if (Comp[select].equals("Rock")&&Choice.equalsIgnoreCase("Paper")||Comp[select].equals("Scissors")&&Choice.equalsIgnoreCase("Rock")||Comp[select].equals("Paper")&&Choice.equalsIgnoreCase("Scissors"))
				{//All of the choices where the player would win comparatively to the random choice.
					System.out.println(Choice+" beats "+Comp[select] 
							+"\nYou get a point!");
					PlayerScore ++;
					Rounds ++;
					//Adding one to the score of the player if they win, and adding one to the round every time the player wins
				}
				
				else if(Comp[select].equals("Rock")&&Choice.equalsIgnoreCase("Scissors")||Comp[select].equals("Scissors")&&Choice.equalsIgnoreCase("Paper")||Comp[select].equals("Paper")&&Choice.equalsIgnoreCase("Rock"))
				{//All of the choices where the computer would win compared to the player's choices.
					System.out.println(Comp[select]+" beats "+Choice);
					CompScore ++;
					Rounds ++;
					//Adding one to the score of the computer if they win, and adding one to the round every time the computer wins
				}
				else if(Comp[select].equals("Rock")&&Choice.equalsIgnoreCase("Rock")||Comp[select].equals("Paper")&&Choice.equalsIgnoreCase("Paper")||Comp[select].equals("Scissors")&&Choice.equalsIgnoreCase("Scissors"))
				{//In case the player inputs the same thing that the computer randomly chose, it prints a tie.
					System.out.println("It is a tie! No one gets a point!");
					Rounds ++;
				}
				
				else
				{//In case player inputs something other than the three choices given.
					System.out.println("Invalid Input! I get a point!");
					CompScore ++;
					Rounds ++;
				}
				if (Rounds == 4)//When the game reaches round 3, it will compare the scores and see who won, and then print who won.
				{
					System.out.println("The final scores are:\nMe:"+CompScore+"\nYou:"+PlayerScore);
					if (PlayerScore > CompScore)
					{
						System.out.println("YOU WIN!!!!");
					}
					if (CompScore > PlayerScore)
					{
						System.out.println("Sorry, maybe next time :(");
					}
					if (CompScore == PlayerScore)
					{
						System.out.println("It's a tie!");
					}
					System.out.println("Would you like to play again?\nYes or No?");
					String again = keyboard.nextLine();
					if (again.equalsIgnoreCase("Yes"))//If player decides to play again, we reset the points to 0 and the round back to 1 so that the while loop will start over.
					{
						Rounds = 1;
						PlayerScore = 0;
						CompScore = 0;
					}
					else if (again.equalsIgnoreCase("No"))//If player decides not to play again, we end the program. 
					{
						System.out.println("Bye then!");
						System.exit(0);
					}
				}
			}
			
		}

			
			


	}

}
