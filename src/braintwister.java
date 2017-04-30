import javax.swing.JOptionPane;

public class braintwister {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "All answers must be done within ten seconds prior to reading the question.");
		JOptionPane.showInputDialog("What screams when you boil water in it?");
		JOptionPane.showInputDialog("What do you earn by getting first place that is not a trophy?");
		JOptionPane.showInputDialog("What do you do when you mess with someone's plans?");
		String l = JOptionPane.showInputDialog("Do you wrap food in?");
		if(l.equals("aluminum foil")){
			JOptionPane.showMessageDialog(null, "You win!");
		}
		else{
			JOptionPane.showMessageDialog(null, "You lose!");
		}
	}
}