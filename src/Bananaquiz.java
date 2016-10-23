// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class Bananaquiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String a = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (a.equals("no")){
			JOptionPane.showMessageDialog(null,"911! crazy person! ukaguidcvgfizsugczstg diuefy 7r9z8 f7xyudzs6f76sudy fcr76y iwsefwztyfg76ixertz8.´w7u8@!");
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		if (a.equals("yes")){
			String b = JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, b + " is much better with bananas and without your face!");
		}
		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}