# Sudoku-Solver
There are many variants of Sudoku like 3 x 3 , 9 x 9 (most popular) , 16 x 16 grids . I have tried to focus mainly on the   9 x 9 grid and design a program such that the user enters the given Sudoku problem to the computer and the computer does all the work same as we would solve it ourselves and gives out an appropriate solution for the given Sudoku.

CONDITIONS / CONSTRAINTS

The conditions and constraints my project aims at solving Sudoku are as follows:
•	The grid should be of either 3 X 3, 9 X 9 or basically in multiples of 3 otherwise it will generate wrong dimension error.
•	Fixed Symbols – 1 to 9
•	One symbol cannot be repeated in same row, column.
•	Limitations on the number of patterns implemented.
•	The blank spaces that we need to solve should be entered as ‘0’ in the user input. 
•	The ordering of a given set of puzzles by difficulty will be the same for the program as for humans.


PSEUDOCODE

1.	Assign numbers one by one to empty cells.
2.	Before assigning, we check if it is safe or not?
3.	After checking for safety, we assign the numbers and recursively check whether the assignment leads to a solution or not 
4.	Find the position that is row and column of an unassigned cell
If there is none ,
	return true
For digits 1 to 9,
	If there is no conflict for digit at row, col then assign cell fill the grid.
If recursion is successful 
	return true
else
	remove digit and try another 



recursiveBacktrackning(Puzzle[][])
{
       Puzzle [][] //global
 solvePuzzle(row,col)
{ 
if (no more choices) : the puzzle is solved! 
If (puzzle[row][col]= notEmpty): move to the next square. for 1 to 9:
 if(checkRow(row,col,digit) & checkCol(row,col,digit) & checkBox(row,col,digit)
{
 puzzle[row][col]= digit; move to the next square
 }
 if not valid number is found go the previous square that was recently filled 
}
              }
