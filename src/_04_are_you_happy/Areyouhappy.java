package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Areyouhappy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog (null,"ARE YOU HAPPY?");
	if (answer.contentEquals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing whatever you're doing");
	
	}
	else if (answer.contentEquals("no")){
		String answer = JOptionPane.showInputDialog(null,"do you want to be happy?");
	}
	
}
}
