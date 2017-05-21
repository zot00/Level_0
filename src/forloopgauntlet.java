
public class forloopgauntlet {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			} else {
				System.out.println(" ");
			}
		}
		for (int i = 0; i <= 500; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " odd");
			} else {
				System.out.println(i + " even");
			}
		}
		for (int i = 7; i <= 777; i = i + 7) {
			System.out.println(i);
		}
		int i = 0;
		for (int j = 2003; j < 2017; j++) {
			System.out.println(j + ", " + i + " years old.");
			i = i + 1;
		}
		for (int j = 0; j <= 2; j++) {
			for (int j2 = 0; j2 <= 2; j2++) {
				System.out.println(j + " " + j2);
			}
		}
		for (int j = 1; j <= 9; j = j + 3) {
			for (int j2 = j; j2 < j + 3; j2 = j2 + 1) {
				System.out.print(j2 + " ");
			}
			System.out.println("");
		}
	}
}
