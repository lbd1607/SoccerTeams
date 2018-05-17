import javax.swing.JOptionPane;

/**
*Laura Davis CIS 260 903
*This program calculates the number of soccer teams
*that a youth league may create from a number of 
*available players. Input validation is demonstrated
*with while loops.
**/

public class SoccerTeams
{
	public static void main(String[] args)
	
	{
		//declare variables
		final int MIN_PLAYERS = 9;
		final int MAX_PLAYERS = 15;
		int players;
		int teamSize;
		int teams;
		int leftOver;
		String input;
		
		//get the number of players per team from the user
		input = JOptionPane.showInputDialog("Enter the number of players per team. ");
		teamSize = Integer.parseInt(input);
		
		//validate the number of players entered
		while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
		{
			input = JOptionPane.showInputDialog("The number must be at least " + MIN_PLAYERS +
			"and no more than" + MAX_PLAYERS + "\nRe-enter the number of players. ");
			teamSize = Integer.parseInt(input);
			
		}
		//get the number of available players
		input = JOptionPane.showInputDialog("Enter the number of players: ");
		players = Integer.parseInt(input);
		
		//validate the number entered
		while (players < 0)
		{
			input = JOptionPane.showInputDialog("Please enter a number that is 0 or greater. ");
			players = Integer.parseInt(input);
		}
		
		//calculates the number of teams
		teams = players / teamSize;
		
		//calculates the number of leftover players
		leftOver = players % teamSize;
		
		//displays the results
		JOptionPane.showMessageDialog(null, "There will be " + teams + " teams with " + leftOver 
		+ " players left over. ");
		
		System.exit(0);
	}//end of main
	
}//end of class
