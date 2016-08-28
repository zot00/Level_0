//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class candyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String p = JOptionPane.showInputDialog(null, "Who do you not like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + p + "!");
		// 3. Ask the user for the name of their best friend
		String i = JOptionPane.showInputDialog(null, "Who is your worst enemy?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, i + "  is worse than " + p + "!");
		String s = JOptionPane.showInputDialog(null, "Where do you want to work in the future?");
		JOptionPane.showMessageDialog(null, "at" + s + ", "+ i + "  will be your boss and " + p + " is your succesor!");
	} 
}


