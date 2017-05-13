import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chuckle_Clicker {
	public static void main(String[] args) {
		//The point of this exercise is to guide the students through making a Swing app from scratch. The code here is for your reference. 

		//1. Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. You will need to instantiate your class and call method an instance of it. 
			//in main method
		ChuckleClicker chuckleClicker = new ChuckleClicker();
			chuckleClicker.makeButtons();

		//2. Make a JFrame in makeButtons() method and get it to show: 
			JFrame jFrame = new JFrame();
		jFrame.setVisible(true);

		//3. Make JPanel and two JButtons and add them to each other.
			JPanel jPanel = new JPanel();
		JButton jokeButton = new JButton();
		JButton punchlineButton = new JButton();
			jPanel.add(jokeButton);
		jPanel.add(punchlineButton);
		jFrame.add(jPanel);
		jFrame.pack();

		//4. (optional) customize with setText, setSize, etc.

		//5. Make a pop-up that says “hi” when either of the buttons are pressed.
		//Add an action listener to the button: jButton.addActionListener(this);
		//Let your class implement ActionListener [use quick fix]
		//Add unimplemented methods [use quick fix]
		//Make JOptionPane pop up inside actionPerformed() method.

		//6. Check if the ActionEvent came from the joke button or the punchline button.
		//Try using if(arg0.getSource() == jokeButton)and explain scoping (jokeButton is probably not a member variable at this stage).

		//7. Use JOptionPane to print the joke and punchline when buttons are clicked.

		//8. Quiz kids (using easy buttons as buzzers) on all of this.
	
	}
}
