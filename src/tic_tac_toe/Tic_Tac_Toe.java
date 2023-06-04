package tic_tac_toe;
import java.util.Scanner;
import java.lang.Exception;
public class Tic_Tac_Toe extends Player{

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		
		int player,box;
		boolean flag1=false,flagsymbol=false;
		char symbol;
		while(true)
		{
			player=flag1?2:1;
			symbol=flagsymbol?'o':'x';
			display_board();
			System.out.println("Player:"+player+"\nEnter box number:");
			try {
			box=sc.nextInt();
			}catch(Exception e)
			{
				System.out.println("Enter valid number.");continue;
			}
			if(!(player_insert(box,symbol)))
			{
				System.out.println("Oops!!Invalid box number.Enter correct box number.");
				continue;
			}
			if(empty<5) {
			if(checkWinner(symbol,player)==player) {
				display_board();
				System.out.println("Hurray!!..Player "+player+" Won The Match");
				System.out.println("Play again?[Y/N]");
				char play_again;
				play_again=sc.next().charAt(0);
				if(Character.toUpperCase(play_again)=='Y')
				{
					reset_board();
					flag1=false;flagsymbol=false;
					continue;
				}
				break;
			}
			}
		/*	display_board();
			
			System.out.println("Player:2\nEnter box number:");
			n=sc.nextInt();
			if(!(player2_set_o(n)))
			{
				System.out.print("Oops!!Box already full.Can't fill in box "+n+" Enter box number again.\n");
				
			}
			if(empty<5) {
				if(checkWinner()==2) {
					System.out.print("Hurray!!..Player 2 Won The Match");break;
				}
				}*/
			flag1=!flag1;
			flagsymbol=!flagsymbol;
		}
		
		sc.close();
	}

}
