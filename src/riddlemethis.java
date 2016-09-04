import javax.swing.JOptionPane;

public class riddlemethis {
	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int s = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String o = JOptionPane.showInputDialog("You're running a race and pass the person in 2nd place. What place are you in now?");
		String t = JOptionPane.showInputDialog("Imagine you are in a dark room. How do you get out?");
		String th = JOptionPane
				.showInputDialog("Who makes it, but has no need of it. Who buys it, but has no use for it. Who uses it but can neither see nor feel it. What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (o.equalsIgnoreCase("Second")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			s += 1;
		}
		else{
			JOptionPane.showMessageDialog(null,"Incorrect!");
			JOptionPane.showMessageDialog(null,"You're running a race and pass the person in 2nd place. What place are you in now?");
			JOptionPane.showMessageDialog(null,"Second");
		}
		if (t.equalsIgnoreCase("Stop imagining")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			s += 1;
		}
		else{
			JOptionPane.showMessageDialog(null,"Incorrect!");
			JOptionPane.showMessageDialog(null,"Imagine you are in a dark room. How do you get out?");
			JOptionPane.showMessageDialog(null,"stop imagining");
		}
		if (t.equalsIgnoreCase("a coffin")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			s += 1;
		}
		else{
			JOptionPane.showMessageDialog(null,"Incorrect!");
			JOptionPane.showMessageDialog(null,"Who makes it, but has no need of it. Who buys it, but has no use for it. Who uses it but can neither see nor feel it. What is it?");
			JOptionPane.showMessageDialog(null,"a coffin!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, s);
	}
}