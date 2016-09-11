import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ShinyObject {

	public static void main(String[] args) {

		// 2. Ask the user how many shiny objects they want
	String a =	JOptionPane.showInputDialog("How many shiny objects do you have?");
		// 3. Play the sound that many times
	int s = Integer.parseInt(a);
	if (s > 3){
		JOptionPane.showMessageDialog(null, "Don't tire Mr. Zee with your big numbers!");
		System.exit(0);
	}
for (int i = 0; i < s; i++) {
	playMisterZee();
}

		// 1. Call the method below
	while(true){
		playMisterZee();	
	}
	}

	public static void playMisterZee() {
    	try {
   		 File soundFile = new File("/Users/League/Google Drive/league-sounds/shiny-objects.wav");
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

}
