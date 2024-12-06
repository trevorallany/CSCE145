/*
 * Trevor Yarborough
 */

import java.util.Scanner;

public class ColdWinter {

	public static void main(String[] args) {
		System.out.println("Welcome to the below average temperature tester program.");//Prompt the user for input
		Scanner keyboard = new Scanner(System.in);
		double[] degrees = new double[12];//Set up an array with size 10 (for 10 days)
		double average = 0;
		int day = 1;
		for(int i=1; i+1<degrees.length;i++)//setting up a for loop to gather all of the temperatures for each day
		{
			System.out.println("Please enter the temperature for day "+day);
			degrees[i] = keyboard.nextDouble();
			average = average + degrees[i];//adding the temperatures together (every time a new double is added, it is added onto the total)
			day++;
		}
		double finalavg = (average/10);//dividing the added degrees together and dividing them by the number of values in the set to get the average
		System.out.println("The average was: "+finalavg);//Printing average
		System.out.println("The days that were below average were:");//Printing below average days
		for(int i=1; i+1<degrees.length;i++)//Setting up for loop to go through the array and look for numbers smaller than the average
		{
			if (degrees[i]<finalavg)
			{
				System.out.println("Day "+i+" with "+degrees[i]);
				
			}
		}


	}

}
