package begin;

public class Begin {

	public static void main(String[] args) {

		System.out.println(factoriellle(4));

		for (int i = 0; i < 10; i++) {
			System.out.println(factoriellle(i));
		}

		System.out.println("résultat: " + plusRecursifTerminal(5, 4));
	}

	public static void displayText(String phrase) {
		System.out.println(phrase);
	}

	private static int factoriellle(int n) {
		if (n >= 0) {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return n * factoriellle(n-1);
			}
		} else {
			return 0;
		}

	}
/*
	private static int sommerRecursif(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sommerRecursif(n-1);
		}
	}

	private static int sommerRecursifTerminal(int n, int m) {
		if (n == 0) {
			return m;
		} 
		else {
			return sommerRecursifTerminal(n-1, n+m);
		}
	}

	private static int plusRecursif(int n1, int n2){
		if (n1 > n2) {
			return plusRecursifAux(n2, n1);
		} 
		else {
			return plusRecursifAux(n1, n2);
		}
	}

	private static int plusRecursifAux(int n, int m){

		if (n == 0) {
			return m;
		}
		else {
			return 1 + plusRecursifAux(n-1, m);
		}
	}
*/
	private static int plusRecursifTerminal(int n1, int n2){
		if (n1 > n2) {
			return plusRecursifTerminalAux(n2, n1);
		} 
		else {
			return plusRecursifTerminalAux(n1, n2);
		}
	}

	private static int plusRecursifTerminalAux(int n1, int n2){
		if (n1 == 0) {
			return n2;
		} else {
			return plusRecursifTerminalAux(n1-1, n2+1);
		}
	}

}