import java.util.Random;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		JOptionPane.showInputDialog("What's your birthday?");
		int n = new Random().nextInt(6);
		if(n == 0){
			JOptionPane.showMessageDialog(null, "You will die before age 493329548428754079289757892309. You're a capricorn");
		}
		else if(n == 1){
			JOptionPane.showMessageDialog(null, "You won't win the lottery today. You're a pisces");
		}
		else if(n == 2){
			JOptionPane.showMessageDialog(null, "You will die. You're a sagittaire");
		}
		else if(n == 3){
			JOptionPane.showMessageDialog(null, "You will earn at least $1 before you die. You're an aquarius");
		}
		else if(n == 4){
			JOptionPane.showMessageDialog(null, "You will live to at least age 1. You're a libre");
		}
		else if(n == 5){
			JOptionPane.showMessageDialog(null, "You will kill yeast. You're a cancer");
		}
		else{
			JOptionPane.showMessageDialog(null, "WOMAN!!!!!! Kitchen. You're everything but a cancer, libre, aquarius, sagittaire, pisces, and capricorn");
		}
	}
}