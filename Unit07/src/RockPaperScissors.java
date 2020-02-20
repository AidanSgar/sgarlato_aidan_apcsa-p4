
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors {
	private String play;
	private String comp;

	public RockPaperScissors() {
		this("");
	}

	public RockPaperScissors(String player) {
		setPlayers(player);
	}

	public void setPlayers(String player) {
		double rand = 3 * Math.random();
		play = player;
		if (0 == (int) rand)
			comp = "S";
		if (1 == (int) rand)
			comp = "R";
		if (2 == (int) rand)
			comp = "P";
	}

	public String determineWinner()
	{
		String winner="";
		if(play.equals("S")) {
			if(comp.equals("S")) {
				comp = "Siscors";
				winner = "It's a tie";
			}
			else if(comp.equals("R")) {
				comp = "Rock";
				winner = "I win, you lost";
			}
			else {
				comp = "Paper";
				winner = "You win!!";
			}
		}
		if (play.equals("R")) {
			if(comp.equals("S")) {
				comp = "Siscors";
				winner = "I win, you lost";
			}
			else if(comp.equals("R")) {
				comp = "Rock";
				winner = "It's a tie";
			}
			else {
				comp = "Paper";
				winner = "You win!!";
			}
		}
		if (play.equals("P")) {
			if(comp.equals("S")) {
				comp = "Siscors";
				winner = "I win, you lost";
			}
			else if(comp.equals("R")) {
				comp = "Rock";
				winner = "You win!!";
			}
			else {
				comp = "Paper";
				winner = "It's a tie";
			}
		}
		return winner;
	}

	public String toString() {
		String out = determineWinner();
		return "I chose: "+ comp +"\n"+ out;
	}
}