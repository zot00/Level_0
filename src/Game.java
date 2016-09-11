import java.util.Random;

import javax.swing.JOptionPane;

public class Game {
	public static void main(String[] args) {

		Random r = new Random();
		int x = r.nextInt(100);
		String g = JOptionPane.showInputDialog("I'm thinking of a number between 1 and 100. What is it?");
		int q = Integer.parseInt(g);
		while (q != x)
		{
			if (q > x) {
				JOptionPane.showMessageDialog(null, "Too high");
			}
			if (q < x) {
				JOptionPane.showMessageDialog(null, "Too little");
			}
			if (q == x) {
				JOptionPane.showMessageDialog(null, "Good!");
			}
			g = JOptionPane.showInputDialog("I'm thinking of a number between 1 and 100. What is it?");
			q = Integer.parseInt(g);
		}
	}
}