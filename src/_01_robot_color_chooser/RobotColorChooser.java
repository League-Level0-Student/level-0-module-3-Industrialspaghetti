//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot CLC = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color = 
		JOptionPane.showInputDialog("What color do you want your shape to be? colors: "
				+ "red,"
				+ "orange, "
				+ "yellow, "
				+ "green, "
				+ "blue, "
				+ "purple.");
		//5. Use an if/else statement to set the pen color that the user requested
	if (color .equals ("red" )) {
	CLC.setPenColor(Color.RED);
}
	if (color .equals ("orange" )) {
		CLC.setPenColor(Color.orange);
	}
	if (color .equals ("yellow" )) {
		CLC.setPenColor(Color.yellow);
	}
	if (color .equals ("green" )) {
		CLC.setPenColor(Color.green);
	}
	if (color .equals ("blue" )) {
		CLC.setPenColor(Color.blue);
	}
	if (color .equals ("purple" )) {
		CLC.setPenColor(Color.magenta);
	}
        //6. If the user doesn’t enter anything, choose a random color
if (color.equals ("null")) {
	CLC.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		CLC.setSpeed(20);
		//4. Set the pen width to 10
		CLC.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int i = 0; i < 4; i++) {
			CLC.setPenWidth(7);
			CLC.penDown();
			CLC.move(200);
			CLC.turn(90);
		}


	}
}
