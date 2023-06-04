package tic_tac_toe;

public class Board {
	//initializing board with dot(empty)
 static char[][] board= {{'.','.','.'},{'.','.','.'},{'.','.','.'}};
 static int empty=9;
public static void display_board()
{
	System.out.println("Tic Tac Toe\n");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(board[i][j]+"\t");
		}
		System.out.println();
		System.out.println();
	}
	//System.out.print("\033[H\033[2J");  
	//System.out.flush();  
}
public static void reset_board()
{
	empty=9;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			board[i][j]='.';
		}
	}
}



}
