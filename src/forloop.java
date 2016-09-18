import java.io.IOException;

public class forloop {
	public static void main(String[] args) {
		while(true){
		for(int i = 10; i >= 1; i--) {
			String s = "" + i;
			speak(s);
		}
			speak("blastoff!!!!!!!!!!!!!");
		}
		}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}