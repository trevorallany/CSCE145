/*
 * Written by Trevor Yarborough
 */

import java.util.Scanner;

public class WhatsUrZodiac {

	public static void main(String[] args) 
	{
	Scanner keyboard = new Scanner(System.in);//Creating a scanner object 
	
	System.out.println("What is your zodiac?"
			+ "\nEnter your birthday"
			+ "\nEnter your birth month as a number, then press ENTER:");//asking user for data
	int month = keyboard.nextInt();//gathering input for month
	System.out.println("Enter your birth day as a number, then press ENTER:");
	int day = keyboard.nextInt();//gathering input for day
	
	if ((month <= 0)||(month >= 13))//Contingencies. Making sure you can't input a wrong number 
	{
		System.out.print("Invalid month!!!");
		if ((day <= 0)||(day >= 32))
		{
			System.out.println("\nInvalid day!!!");
			System.exit(0);
		}
		
		System.exit(0);
	}
	if ((day <= 0)||(day >= 32))
	{
		System.out.println("Invalid day!!!");
		if ((month <= 0)||(month >= 13))
		{
			System.out.print("\nInvalid month!!!");
		}
		System.exit(0);
	}
	//Contingencies for specific months 
	if ((month == 4 && day >=31))
	{
		System.out.println("Invalid day!!!");
		System.exit(0);
	}
	if ((month == 6 && day >=31))
	{
		System.out.println("Invalid day!!!");
		System.exit(0);
	}
	if ((month == 9 && day >=31))
	{
		System.out.println("Invalid day!!!");
		System.exit(0);
	}
	if ((month == 10 && day >=31))
	{
		System.out.println("Invalid day!!!");
		System.exit(0);
	}
	if ((month == 2 && day >=30))
	{
		System.out.println("Invalid day!!!");
		System.exit(0);
	}
	
	
	if ((month == 3 && day >= 21)||(month == 4 && day <= 19)) //Setting parameters for each Zodiac Sign 
	{
		System.out.println("You are a Aries!");	
	}
	else if ((month == 4 && day >= 21)||(month == 5 && day <= 20))
	{
		System.out.println("You are a Taurus!");
	}
	else if ((month == 5 && day >= 21)||(month == 6 && day <= 20))
	{
		System.out.println("You are a Gemini!");
	}
	else if ((month == 6 && day >= 21)||(month == 7 && day <= 22))
	{
		System.out.println("You are a Cancer!");
	}
	else if ((month == 7 && day >= 23)||(month == 8 && day <= 22))
	{
		System.out.println("You are a Leo!");
	}
	else if ((month == 8 && day >= 23)||(month == 9 && day <= 22))
	{
		System.out.println("You are a Virgo!");
	}
	else if ((month == 9 && day >= 23)||(month == 10 && day <= 22))
	{
		System.out.println("You are a Libra!");
	}
	else if ((month == 10 && day >= 23)||(month == 11 && day <= 21))
	{
		System.out.println("You are a Scorpio!");
	}
	else if ((month == 11 && day >= 22)||(month == 12 && day <= 21))
	{
		System.out.println("You are a Sagittarius!");
	}
	else if ((month == 12 && day >= 22)||(month == 1 && day <= 19))
	{
		System.out.println("You are a Capricorn!");
	}
	else if ((month == 1 && day >= 20)||(month == 2 && day <= 18))
	{
		System.out.println("You are a Aquarius!");
	}
	else if ((month == 2 && day >= 19)||(month == 3 && day <= 20))
	{
		System.out.println("You are a Pisces!");
	}
	}
}
