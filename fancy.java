import easyIO.*;

public class fancy {
	 public static void main(String[] args) {

		In tast = new In();
		Out skjerm = new Out();

		skjerm.out("Navn: ");
		String navn = tast.inLine();

		skjerm.out("Alder: ");
		int alder = tast.inInt();

		skjerm.out("Yrke: ");
		String yrke = tast.inLine();

		skjerm.out("Hei, " + navn + " du er " + alder);
		skjerm.outln("år gammel, og jobber som" + yrke);	
	}
}