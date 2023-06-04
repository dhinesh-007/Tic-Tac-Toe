package tic_tac_toe;

public class Game extends Board{

	public static int checkWinner(char symbol,int player)
	{
		for(int i=0;i<3;i++)
		{
			if(board[i][0]==symbol&&board[i][1]==symbol&&board[i][2]==symbol)
			{
				return player;
			}
			if(board[0][i]==symbol&&board[1][i]==symbol&&board[2][i]==symbol)
			{
				return player;
			}
		}
		if(board[0][0]==symbol&&board[1][1]==symbol&&board[2][2]==symbol)
		{
			return player;
		}
		if(board[0][2]==symbol&&board[1][1]==symbol&&board[2][0]==symbol)
		{
			return player;
		}
		
		
		return 0;
	}
}
