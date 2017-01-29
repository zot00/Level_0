import javax.swing.JOptionPane;

import org.omg.CORBA.DoubleHolder;

public class grader {
	public static void main(String[] args) {
		while(true){
String a = JOptionPane.showInputDialog("Put in your grade (anything other than numbers or numbers greater than 100 will not be tolerated)");
double d = Double.parseDouble(a);
if(d>=90){
	
	JOptionPane.showMessageDialog(null, "A for Awesome!");
}
else if(d>=80){
	
	JOptionPane.showMessageDialog(null, "B for Ballistic!");
}
else if(d>=70){
	
	JOptionPane.showMessageDialog(null, "C for Cool!");
}
else if(d>=60){
	
	JOptionPane.showMessageDialog(null, "D for Deluxe fail!");
}
else{
	JOptionPane.showMessageDialog(null, "F for absolute Fail!");
}
		}
		}
}