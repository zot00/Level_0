import javax.swing.JOptionPane;

public class worstfortune {
public static void main(String[] args) {
	
	JOptionPane.showInputDialog(null, "Where do you like to go on vacation?");
	JOptionPane.showInputDialog(null, "Name your number of pets.");
	String p = JOptionPane.showInputDialog(null, "Who is your favorite family member?");
	String r = JOptionPane.showInputDialog(null, "Who is your second favorite family member?");
	String q = JOptionPane.showInputDialog(null, "Who is your favorite pet?");
	String w = JOptionPane.showInputDialog(null, "Who is your second favorite pet?");
	JOptionPane.showMessageDialog(null, "I hope you weren't lying about " + w + " being your second favorite pet and " + r +" being your second favorite!");
	
	}
}
