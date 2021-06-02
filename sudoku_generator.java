/*
 * @author details  
 * -------------------
 * Programmed By - Lokesh Kumar Nahata
 * Registration Number - 1841017158
 * Branch - CSIT A 
 * Section A
 * DATE of EDITING - 19/12/2020
 * Classic 9x9 Sudoku solver using backtracking algorithm approach
 */
import java.util.Scanner;

public class Sudoku_solution_Generator
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner (System.in);	
		int n;  //sudoku matrix size

		System.out.println("...Welcome To Sudoku Solver...");
		System.out.print("Enter the size of Sudoku grid : ");
		n = sc.nextInt();
		
//If not 9X9 sudoku grid not possible
		if (n != 9 )
	System.out.println("!! Wrong Dimensions !!"+n+"X"+n);
		else
		{
			// input the numbers as per the problem
		int data[][] = new int [n][n];
		System.out.println("Instructions-->");
		System.out.println("Enter the sudoku data in the repective row and columns\nEnter data Row-wise separating each element by a SPACE.");
		System.out.println("\nEnter the values between 1 - 9 at respective places");
	System.out.println("\nIf the position is empty (no data value) enter '0' in that place.");
		
		for (int i = 0 ; i<n; i++)
		{
			System.out.print("Enter the values as in problem for row "+i+" :");
			for(int j = 0; j<n;j++)
			{
				
				data[i][j] = sc.nextInt();	
			}
		}
		//print the problem question
		System.out.println("Sudoku Problem : ");
		for (int i =0;i<n;i++)
		{
			for (int j = 0;j<n;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		//create sudoku solution
		if(solving_sudoku(data,n))
			//print solution
			generate_sudoku(data,n);
		else
System.out.println("!! NO SOLUTION FOR THE PROBLEM !!");
		}
	}
	
	public static boolean solving_sudoku(int data[][],int n)
	{
		int row = -1;
		int column = -1;
		boolean flag = true; //check for the position if      empty or not
		
		

for(int i = 0; i<n;i++)
		{
			for(int j =0; j<n ; j++)
			{
				if (data[i][j] == 0 )
				{
					row = i;
					column = j;

		//we have some missing values in sudoku still
					flag = false;
					break;
				}
			}
			    if (!flag)
			    {
			    	break;
			    }
		}
				//if there is no empty space remaining 
				if (flag)
				{
					return true;
				}
			//else use the backtracking for each row 
				for(int num = 1; num <=n; num++)
				{
					if (check(data,row,column,num))
					{
						data [row][column] = num;
						if(solving_sudoku(data,n))
						{
							//print (data ,n)
							return true;
						}
						else 
						{
							// replace
							data[row][column] =  0;
						}
					}
				}
				return false;
			}
			
public static void generate_sudoku(int data [][], int n)
{
	System.out.println("\nSolution for the Sudoku : \n");
				//display the result
			for (int i = 0; i<n;i++)
			{
				for (int j =0;j<n;j++)
				{						     
                     System.out.print(data[i][j]+" ");
					}
					System.out.println();
					
				if ((i+1) % (int) Math.sqrt(n) == 0)
					{
						System.out.println("");
					}
				}
			}
	public static boolean check (int data[][],int row,int      
                                  column,int num )
			{
				//checking uniqueness  for rows
				for (int d = 0; d < data.length; d++) 
				{
//check if the number we are placing already present in the row
					if (data[row][d] == num)
					{
						return false;
					}
				}
		//checking uniqueness of the number in columns
				for (int c = 0; c < data.length; c++ )
				{
//to check if the number placing is already in that column
					if (data[c][column] == num)
					{
						return false;
					}
				}
			// if it has unique number
			int s = (int)Math.sqrt(data.length);
		int data_row_begins = row - row % s;
		int data_column_begins = column - column % s;
				
for (int i = data_row_begins; i<data_row_begins +s ; i++)
{
for(int j=data_column_begins;j<data_column_begins + s;j++)     
					{
						if (data[i][j] == num)
							return false;
					}
				}
				//if no repetation of number found 
				return true;
			}
	}
