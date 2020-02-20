//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		RockPaperScissors game = new RockPaperScissors();
		String input;
		
		//add in a do while loop after you get the basics up and running
		
		while(true) {
			out.print("Choose Rock, [R,P,S] :: ");
			input = keyboard.nextLine();
			game.setPlayers(input);
			System.out.println(game);
		}
			
			
			//read in the player value
		
					
	}
}



