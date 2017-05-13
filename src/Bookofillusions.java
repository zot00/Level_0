import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class Bookofillusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */
	public static void main(String[] args) throws Exception {
		Bookofillusions illusions = new Bookofillusions();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame a = new JFrame();
	JFrame b = new JFrame();
	private void createBook() {
		// 2. make the frame visible
		a.setVisible(true);
		// 3. set the size of the frame
		a.setSize(500, 500);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String r = "wut1.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel m;
		// 7. use the "loadImage..." methods below to initialize your JLabel
		m=loadImageFromComputer(r);
		// 8. add your JLabel to the frame
		a.add(m);
		// 9. call the pack() method on the frame
		a.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		a.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		b.setVisible(true);
		// 3. set the size of the frame
		b.setSize(500, 500);
		String r = "wut2.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel f;
		// 7. use the "loadImage..." methods below to initialize your JLabel
		f=loadImageFromComputer(r);
		// 8. add your JLabel to the frame
		b.add(f);
		// 9. call the pack() method on the frame
		b.pack();
		// 11. Print "clicked!" to the console when the mouse is pressed
				JOptionPane.showMessageDialog(null, "clicked!");
				// 12. remove everything from the frame that was added earlier
				b.dispose();
				// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
		b.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


