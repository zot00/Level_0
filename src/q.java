import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class q {
public static void main(String[] args) {
	ImageIcon a = new ImageIcon("p1.jpeg");
	JOptionPane.showMessageDialog(null, "Pay Attention!", null, 0, a);
	ImageIcon b = new ImageIcon("p2.jpg");
	JOptionPane.showMessageDialog(null, "Pay Attention!", null, 0, b);
	ImageIcon c = new ImageIcon("p3.jpg");
	JOptionPane.showMessageDialog(null, "Pay Attention!", null, 0, c);
	ImageIcon d = new ImageIcon("p4.jpg");
	JOptionPane.showMessageDialog(null, "Pay Attention!", null, 0, d);
	ImageIcon e = new ImageIcon("p5.jpg");
	JOptionPane.showMessageDialog(null, "Pay Attention!", null, 0, e);
	ImageIcon f = new ImageIcon("p7.jpg");
	JOptionPane.showMessageDialog(null, "Pay Attention!", null, 0, f);
	ImageIcon g = new ImageIcon("p6.jpg");
	JOptionPane.showMessageDialog(null, "Pay Attention!", null, 0, g);
	String a1 = JOptionPane.showInputDialog(null, "How many presidents did you see?", null, 0, null, null,"Type your answer.");
}
}
