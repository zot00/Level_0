import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class code4life {
	public static void main(String[] args) {
		String q = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
		int a = Integer.parseInt(q);
		if(a>=3){
			JOptionPane.showMessageDialog(null, "You're a code ninja!");
		}
		else if(a<2){
			JOptionPane.showMessageDialog(null, "Quit watching Youtube and write code instead!");
		}
		else if(a>5){
			JOptionPane.showMessageDialog(null, "Batman!!!!!!!!!!");
			playBatmanTheme();
		}	
		else{
			JOptionPane.showMessageDialog(null, "Now I know you didn't do any code!!!!!!!!!!!!!");
		}
	}
	/*
	 * Ask the user how many hours they spent coding this week.
	 * 
	 * 1. If it's 3 or more, tell them they're a Code Ninja.
	 * 
	 * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	 * 
	 * 3. If it's more than 5, play the Batman theme song.
	 */

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

