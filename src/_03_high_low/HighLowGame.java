//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		System.out.println(random);
	
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String number = JOptionPane.showInputDialog(null, "enter a number through 1-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int answer = Integer.parseInt(number);
			if (random == answer){
				JOptionPane.showMessageDialog(null, "you win");
				System.exit(0);
			}
			if (random <= answer) {
				JOptionPane.showMessageDialog(null,"too high, you lose");
			}
			if (random >= answer) {
				JOptionPane.showMessageDialog(null, "too low, you lose");
			}
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


