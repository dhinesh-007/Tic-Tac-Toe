package tic_tac_toe;

public class Player extends Game {
		public static boolean player_insert(int n,char symbol)
		{
			int x=n>6?2:n>3?1:0;
			int y=n%3==1?0:n%3==2?1:2;
			if(board[x][y]!='.') return false;
			board[x][y]=symbol;
			empty--;
			return true;
		}
	
}
