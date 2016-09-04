import javax.swing.JOptionPane;

public class world_domination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String p = JOptionPane.showInputDialog(null, "Do you know how to program?");
		// 2. If they say "yes", tell them they will rule the world.
		if (p.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null, "You will rule the world.");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else{
			JOptionPane.showMessageDialog(null, "Have fun at your mom's funeral! I'm not paying for it");
		}
	}
}
