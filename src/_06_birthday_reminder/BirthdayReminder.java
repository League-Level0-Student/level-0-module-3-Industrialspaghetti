
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "October 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer = JOptionPane.showInputDialog("who's birthday do you want to know? options: mom , dad, or mine");
		// 3. Print out what the user typed
		if(answer.contentEquals("mom")) {
			JOptionPane.showMessageDialog(null, " March 25th ");
			
		}
		else if (answer.contentEquals("dad")) {
			JOptionPane.showMessageDialog(null, "December 5th");
		
		}
		else if (answer.contentEquals("yours")) {
			JOptionPane.showMessageDialog(null, "October 2nd");
		}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, idk");
			}
	
		
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		}
	} 

