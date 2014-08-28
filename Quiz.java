import easyIO.*;

public class Quiz {
	public static void main(String[] args) {
		Out swanky = new Out("quiz.txt", true);
		swanky.out("Fancy ");
		swanky.close();

		In hoho = new In("quiz.txt");
		int antall = 0;

		while(!hoho.endOfFile()) {
			char tegn = hoho.inChar();
			System.out.print(tegn);
			antall++;
		}

		System.out.println("Antall tegn: " + antall);
	}
}