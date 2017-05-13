import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//1. Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. You will need to instantiate your class and call method an instance of it. 
	//in main method
public class ChuckleClicker implements ActionListener{
	public static void main(String[] args) {
		JFrame r = new JFrame();
		JPanel s = new JPanel();
		 JButton m = new JButton("Punch Line");
		 JButton x = new JButton("Joke");
		 s.add(x);
		 s.add(m);
		 r.add(s);
		 x.addActionListener(this);
//2. Make a JFrame in makeButtons() method and get it to show.
//3. Make JPanel and two JButtons and add them to each other.
		makeButtons();
//4. (optional) customize with setText, setSize, etc.

//5. Make a pop-up that says “hi” when either of the buttons are pressed.
//Add an action listener to the button: jButton.addActionListener(this);
//Let your class implement ActionListener [use quick fix]
//Add unimplemented methods [use quick fix]
//Make JOptionPane pop up inside actionPerformed() method.

//6. Check if the ActionEvent came from the joke button or the punchline button.
//Try using if(arg0.getSource() == jokeButton)and explain scoping (jokeButton is probably not a member variable at this stage).

//7. Use JOptionPane to print the joke and punchline when buttons are clicked.
		
	}
	public static void makeButtons(){
		 JFrame r = new JFrame();
		 r.setVisible(true);
		 r.setSize(500, 500);
		 JPanel s = new JPanel();
		 JButton m = new JButton("Punch Line");
		 JButton x = new JButton("Joke");
		 s.add(x);
		 s.add(m);
		 r.add(s);
		 x.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(x.getSource() == x){
			 
		 }
	}
}