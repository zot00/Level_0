import javax.swing.JOptionPane;
public class RUHAPPY {
	public static void main(String[] args) {
String a = JOptionPane.showInputDialog("Are you happy?");
if (a.equals("yes")){
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
}
if (a.equals("no")){
	String b = JOptionPane.showInputDialog("Do you want to be happy?");
	if(b.equals("yes")){
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	if(b.equals("no")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
}
}
}