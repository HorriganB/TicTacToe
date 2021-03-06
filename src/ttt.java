import java.util.Scanner;

public class ttt {

/**
 * Main Function
 * Creating boolean = player, decides who is playing
 * Creating char Board Array, creates game board
 * While loop gives decides  for the game and changes the player every time
 * @param args
 */
	public static void main(String[] args) {

		boolean player = true;
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = Integer.toString(i).charAt(0);
		}
		while (winner(board)) {
			printBoard(board);
			takeMove(board, player);
			player = !player;
		} //closes while loop
	}//closes main method
/**Checks to see if there is a winner, in every direction possible. If there is a winner it returns false, 
 * which tells the game that someone won. 
 * 
 * @param board
 * @return
 */
	public static boolean winner(char[] board) {
		if ((board[1] == board[2]) && (board[2] == board[3])) {
			System.out.println("You Won!");
			return false;
		}
		if ((board[4] == board[5]) && (board[5] == board[6])) {
			System.out.println("You Won!");
			return false;
		}
		if ((board[7] == board[8]) && (board[8] == board[9])) {
			System.out.println("You Won!");
			return false;
		}
		/* Checks vertical */
		if ((board[1] == board[4]) && (board[4] == board[7])) {
			System.out.println("You Won!");
			return false;
		}
		if ((board[2] == board[5]) && (board[5] == board[8])) {
			System.out.println("You Won!");
			return false;
		}
		if ((board[3] == board[6]) && (board[6] == board[9])) {
			System.out.println("You Won!");
			return false;
		}
		/* Checks diagonal */
		if ((board[1] == board[5]) && (board[5] == board[9])) {
			System.out.println("You Won!");
			return false;
		}
		if ((board[3] == board[5]) && (board[5] == board[7])) {
			System.out.println("You Won!");
			return false;
		}
		return true;
	}// Closes Winner Method
/**Prints out the entire board one row at a time. **/

	public static void printBoard(char[] board) {
		System.out.println("Let's Get Ready To Rumble!");
		System.out.print("[" + board[1]);
		System.out.print("][" + board[2]);
		System.out.print("][" + board[3]);
		System.out.println("]");
		System.out.print("[" + board[4]);
		System.out.print("][" + board[5]);
		System.out.print("][" + board[6]);
		System.out.println("]");
		System.out.print("[" + board[7]);
		System.out.print("][" + board[8]);
		System.out.print("][" + board[9]);
		System.out.println("]");
	}// Closes printBoard Method
/**Checks if the boolean player is true or false, then changes the space to X or O accordingly.
*Also prints out whose turn it is. 
*/

	public static void takeMove(char[] board, boolean player) {
		Scanner in = new Scanner(System.in);
		char move;
		if (player) {
			System.out.println("It is player 1's turn!");
			move = 'X';
		} else {
			System.out.println("It is player 2's turn!");
			move = 'O';
		}
		while (true) {
			System.out.println("Enter your move.");
			int input = in.nextInt();
			if (board[input] != 'X' && board[input] != 'O') {
				board[input] = move;
				break;
			}
		} // Closes While loop
	}// Closes takeMove method
}// Closes class TTT
