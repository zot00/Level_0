import javax.swing.JOptionPane;

public class simplesorter {
public static void main(String[] args) {
	String uno = JOptionPane.showInputDialog("WHY ON EARTH DO YOU NEED ME?!?!?!?!? GIVE ME A NUMBER!!!!!!!!!!!!!!!!!");
	String dos = JOptionPane.showInputDialog("WHY ON EARTH DO YOU NEED ME?!?!?!?!? GIVE ME A NUMBER!!!!!!!!!!!!!!!!!");
	String tres = JOptionPane.showInputDialog("WHY ON EARTH DO YOU NEED ME?!?!?!?!? GIVE ME A NUMBER!!!!!!!!!!!!!!!!!");
	int one = Integer.parseInt(uno);
	int two = Integer.parseInt(dos);
	int three = Integer.parseInt(tres);
	if(one<two && one < three){
		JOptionPane.showMessageDialog(null, one);
	}
		else if(two<three && one > three){
			JOptionPane.showMessageDialog(null, three);
		}
		else if(one>two && one < three){
			JOptionPane.showMessageDialog(null, two);
		}
		else{
			JOptionPane.showMessageDialog(null, "TOO COMPLICATED. CIRCUITS. FRYING. LOSING. POWE- *sizzle, sizzle, sizzle*");
	}
}
}
//this is wrong DO NOT try this :?