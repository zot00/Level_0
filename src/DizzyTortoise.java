import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {			 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
 String f = JOptionPane.showInputDialog("On a scale of 1-10 [in turns], how dizzy do you think the tortoise will get?");
 // 1. Use the dance method to make the Tortoise spin.
  int q = Integer.parseInt(f);
		 dance(q);
			JOptionPane.showMessageDialog(null,"Correct!");
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
