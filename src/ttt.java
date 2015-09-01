import java.util.Scanner;

public class ttt {
	private static int varWin;

	public static void main(String[] args){
		//variables and a welcome message 
		//game loop
		
	
		boolean WIN = false;
		char[] board = new char[10];
		for(int i = 1; i < 10; i++){
			board[i] = Character.toChars(i);
		}
		/*Checks horizontal*/
		if((board[1] == board[2]) && (board[2] == var3))
			WIN = true;
		if((var4 == var5) && (var5 == var6))
			WIN = true;
		if((var7 == var8) && (var8 == var9))
			WIN = true;
		/*Checks vertical*/
		if((var1 == var4) && (var4 == var7))
			WIN = true;
		if((var2 == var5) && (var5 == var8))
			WIN = true;
		if((var3 == var6) && (var8 == var9))
			WIN = true;
		/*Checks diagonal*/
		if((var1 == var5) && (var5 == var9))
			WIN = true;
		if((var3 == var5) && (var5 == var7))
			WIN = true;
		
		
		
		
		
		
		if(WIN == true)
			System.out.println("You Won");
			
		
		
		System.out.println("Let's Get Ready To Rumble!");
		System.out.print("["+ var1);
		System.out.print("]["+ var2);
		System.out.print("]["+ var3);
		System.out.println("]");
		System.out.print("["+ var4);
		System.out.print("]["+ var5);
		System.out.print("]["+ var6);
		System.out.println("]");
		System.out.print("["+ var7);
		System.out.print("]["+ var8);
		System.out.print("]["+ var9);
		System.out.println("]");
		
		//switch players
	}
}