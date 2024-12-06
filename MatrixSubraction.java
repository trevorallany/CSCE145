/*
 * Written by Trevor Yarborough
 */

import java.util.Scanner;
public class MatrixSubraction {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the matrix subtractor!");
		
		System.out.println("Please input matrix height: ");//gathering height and width for the matrices 
		int y = keyboard.nextInt();
		
		System.out.println("Please input matrix width: ");
		int x = keyboard.nextInt(); 
		
		
		int matrix[][] = new int[x][y];//putting values into the matrix 
		
		for (int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				System.out.println("Enter matrix value" + i + ", " + j);//asking for populating values 
				matrix[i][j] = keyboard.nextInt();
			}
		}
		
		System.out.println("Please input matrix 2 height: ");// filling out info for the second matrix 
		int y2 = keyboard.nextInt();
		
		System.out.println("Please input matrix 2 width: ");
		int x2 = keyboard.nextInt();
		
		int matrix2[][] = new int[x2][y2];
		
		for (int i = 0; i < x2; i++)
		{
			for(int j = 0; j < y2; j++)
			{
				System.out.println("Enter matrix value" + i + ", " + j);//populating
				matrix2[i][j] = keyboard.nextInt();
			}
		}
		
		if(x+y != x2+y2)//making sure the dimensions of both matrices are equal to each other. If not, error is printed
		{
			System.out.println("Invalid. Cannot subtract.");
			System.exit(0);
		}
		
		int sum[][] = new int[x][y];//making a matrix for the difference of both matrices 
		
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				sum[i][j] = matrix[i][j]-matrix2[i][j];// storing the difference of each point in both matrices into the new matrix
			}
		}
		for(int i = 0; i < x; i++)// printing the matrices in order to look like their grid forms
		{
			for(int j = 0; j < y; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-");
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=");
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
