import javax.swing.JOptionPane;

public class Freestyle {
	static int soda = JOptionPane.showOptionDialog(null, "Which of these two do you prefer?", "Question", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Pepsi", "Coke" }, null);
	static int favorite = soda;
	public static void main(String[] args) {
		if(favorite == 0){
			String pet = JOptionPane.showInputDialog("What pet do you want?");
			JOptionPane.showMessageDialog(null, "You and your pet " + pet + " threw the biggest party ever, won the lottery and met Pepsiman!!! *Theme song* PEPSIMAN!!! BUM BUM BUM BATTA BUM BUM BUM PEPSIMAN!!!");
		}	
		if(favorite == 1){
			String pet = JOptionPane.showInputDialog("What pet do you want?");
			JOptionPane.showMessageDialog(null, "You and your pet " + pet + " got ran over by a Cocacola truck... I'm not biased");
		}
	}
}
