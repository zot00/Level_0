import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String p = JOptionPane.showInputDialog(null, "Is it your birthday?");
		// 2. If they say "yes", tell them they will rule the world.
		if (p.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null, "WHAT?!?!?!??!?!?!?!??!");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else{
			JOptionPane.showMessageDialog(null, "Happy unbirthday!");
		}
	}
}
