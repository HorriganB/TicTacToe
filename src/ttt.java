import java.util.Scanner;

public class ttt {
	private static int varWin;

	public static void main(String[] args){
		//variables and a welcome message 
		//game loop
		
	
		boolean WIN = false;
		char[] board = new char[10];
		for(int i = 1; i < 10; i++){
			board[i] = Integer.toString(i).charAt(0);
		}
		/*Checks horizontal*/
		if((board[1] == board[2]) && (board[2] == board[3]))
			WIN = true;
		if((board[4] == board[5]) && (board[5] == board[6]))
			WIN = true;
		if((board[7] == board[8]) && (board[8] == board[9]))
			WIN = true;
		/*Checks vertical*/
		if((board[1] == board[4]) && (board[4] == board[7]))
			WIN = true;
		if((board[2] == board[5]) && (board[5] == board[8]))
			WIN = true;
		if((board[3] == board[6]) && (board[6] == board[9]))
			WIN = true;
		/*Checks diagonal*/
		if((board[1] == board[5]) && (board[5] == board[9]))
			WIN = true;
		if((board[3] == board[5]) && (board[5] == board[7]))
			WIN = true;
		
		
		
		
		
		
		if(WIN == true)
			System.out.println("You Won")
			;
		
			
		
		while {
		System.out.println("Let's Get Ready To Rumble!");
		System.out.print("["+ board[1]);
		System.out.print("]["+ board[2]);
		System.out.print("]["+ board[3]);
		System.out.println("]");
		System.out.print("["+ board[4]);
		System.out.print("]["+ board[5]);
		System.out.print("]["+ board[6]);
		System.out.println("]");
		System.out.print("["+ board[7]);
		System.out.print("]["+ board[8]);
		System.out.print("]["+ board[9]);
		System.out.println("]");
		}
		//switch players
	}
}