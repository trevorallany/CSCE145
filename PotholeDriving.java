/*
 * Written by Trevor Yarborough
 */
import java.util.Scanner;
import java.util.Random;
public class PotholeDriving {
//creating constants for the board size, and the characters for the road, player, home, and the potholes
	public static final int BOARD_SIZE = 11;
	
	public static final char ROAD = '_';
	public static final char PLAYER = 'X';
	public static final char HOME = '^';
	public static final char POTHOLE = '_';
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int playX = 0;//Starting point for the player
		int playY = 0;
		
		int homeX = 9;//Home point 
		int homeY = 9;
		
		char[][] road = new char[BOARD_SIZE-1][BOARD_SIZE-1];//creating an array for the board
		
		int PhX1 = r.nextInt(BOARD_SIZE-1);//declaring integers for the potholes (random)
		int PhY1 = r.nextInt(BOARD_SIZE-1);
		int PhX2 = r.nextInt(BOARD_SIZE-1);
		int PhY2 = r.nextInt(BOARD_SIZE-1);
		int PhX3 = r.nextInt(BOARD_SIZE-1);
		int PhY3 = r.nextInt(BOARD_SIZE-1);
		int PhX4 = r.nextInt(BOARD_SIZE-1);
		int PhY4 = r.nextInt(BOARD_SIZE-1);
		int PhX5 = r.nextInt(BOARD_SIZE-1);
		int PhY5 = r.nextInt(BOARD_SIZE-1);
		
		for(int i=0; i<road.length; i++)//assigning all of the game board to our road variable
		{
			for(int j=0; j<road[i].length; j++)
			{
				road[i][j] = ROAD;
			}
		}
		road[playY][playX] = PLAYER;//setting the player coordinates to our player character
		road[9][9] = HOME;//setting our home character to the home position
		
		
		road[PhX1][PhY1] = POTHOLE;
		road[PhX2][PhY2] = POTHOLE;
		road[PhX3][PhY3] = POTHOLE;
		road[PhX4][PhY4] = POTHOLE;
		road[PhX5][PhY5] = POTHOLE;
		
		
		System.out.println("It's foggy outside! You need to get home, but avoid the potholes!");//setting up the game :)
		
		boolean GameOver = false;
		while (!GameOver)//the game loop
		{
			if(road[PhX1][PhY1]==HOME||road[PhX2][PhY2]==HOME||road[PhX3][PhY3]==HOME||road[PhX4][PhY4]==HOME||road[PhX5][PhY5]==HOME)
			{
				GameOver = true;
				GameOver = false;
			}
			for(int i=0; i<road.length;i++)
			{
				for(int j=0; j<road[i].length;j++)//printing out the game board
				{
					System.out.print(road[i][j]);
				}
				System.out.println();
			}
			System.out.println("Enter either -1, 0, or 1 to move in the y direction");//gathering input for the player's movement
			int directX = keyboard.nextInt();
			System.out.println("Enter either -1, 0, or 1 to move in the x direction");
			int directY = keyboard.nextInt();
			if (directX == 1)//moving in the x direction
			{
				road[playX][playY] = ROAD;
				playX++;
			}
			
			else if (directX == -1)
			{
				road[playX][playY] = ROAD;
				playX--;
			}
			else if (directX == 0)
			{
				road[playX][playY] = ROAD;
			}
			if(directY == 1)//moving in the y direction
			{
				road[playX][playY] = ROAD;
				playY++;
			}
			else if(directY == -1)
			{
				road[playX][playY] = ROAD;
				playY--;
			}
			else if (directY == 0)
			{
				road[playX][playY] = ROAD;
			}
			if(directX < -1 || directX > 1)//contingencies
			{
				System.out.println("That's invalid!");
				directX = 0;
			}
			if(directY < -1 || directY > 1)
			{
				System.out.println("That's invalid!");
				directY = 0;
			}
			if(playX<0)
			{
				road[playX][playY] = ROAD;
				playX=0;
			}
			else if(playX>BOARD_SIZE-1)
			{
				road[playX][playY] = ROAD;
				playX=BOARD_SIZE-1;
			}
			if(playY<0)
			{
				road[playX][playY] = ROAD;
				playY=0;
			}
			else if(playY>BOARD_SIZE-1)
			{
				road[playX][playY] = ROAD;
				playY=BOARD_SIZE-1;
			}
			road[playX][playY] = PLAYER;
			
			if(playX==PhX1&&playY==PhY1||playX==PhX2&&playY==PhY2||playX==PhX3&&playY==PhY3||playX==PhX4&&playY==PhY4||playX==PhX5&&playY==PhY5)
			{
				GameOver=true;
				System.out.println("You've hit a pothole! You lose!\nWould you like to try again?\nYes or No?");
				String choice = keyboard.next();
				if(choice.equalsIgnoreCase("Yes"))
				{
					GameOver=false;
					road[9][9] = HOME;
					playX = 0;
					playY = 0;
					road[playY][playX] = PLAYER;	
				}
				if(choice.equalsIgnoreCase("No"))
				{
					System.out.println("Ok.Bye!");
					GameOver=true;
				}
				
				
			}
			if(playX>road[BOARD_SIZE-3][BOARD_SIZE-3]||playY>road[BOARD_SIZE-3][BOARD_SIZE-3])
			{
				road[playX][playY]=PLAYER;
				System.out.println("Hey! Stay on the road!!!");
			}
			if (playX == homeX && playY == homeY)//if the player makes it home, they win
			{
				System.out.println("You made it home!");
				GameOver=true;
				System.out.println("Would you like to play again?\nYes or No?");
				String choice = keyboard.next();
				if(choice.equalsIgnoreCase("Yes"))
				{
					GameOver=false;
					road[9][9] = HOME;
					playX = 0;
					playY = 0;
					road[playY][playX] = PLAYER;
				}
				if(choice.equalsIgnoreCase("No"))
				{
					System.out.println("Ok.Bye!");
					GameOver=true;
				}
			}
			
		}
	}

}
