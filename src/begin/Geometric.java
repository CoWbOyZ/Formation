package begin;

public class Geometric {

	public static void main(String[] args) {
		System.out.println("Procedure affichant une ligne d'etoile");
		nStarLine(10);
		System.out.println("Procedure entrainant un retour à la ligne");
		backToTheLine();
		System.out.println("Methode creant une ligne d'etoile");
		System.out.println(getStarLine(20));
		System.out.println("Procedure affichant une ligne de caracteres");
		printNTimesX(5,"@");
		System.out.println("Methode creant une ligne de caracteres");
		System.out.println(getXLine(10,"@"));
		System.out.println("Methode creant une ligne de x");
		System.out.println(retournerTrait(10));
		System.out.println("Methode creant une ligne de x et un retour à la ligne");
		System.out.println(retournerLigne(10,"x"));
		System.out.println("Procedure affichant un triangle de hauteur 8");
		displayTriangle8();
		System.out.println("Methode creant un triangle de hauteur variable");
		System.out.println(getTriangle(10));
		System.out.println("Methode creant un rectangle plein");
		System.out.println(getRectangle(3,6));
		System.out.println("Methode creant une chaine de caractere commencant par n vide et m *");
		System.out.println(getSpaceLine(2,3));
		System.out.println("Methode creant un rectangle vide");
		System.out.println(getEmptyRectangle(3,6));
		System.out.println("Methode creant un triangle isocele rectangle");
		System.out.println(getRec(5));
		System.out.println("Methode creant un triangle isocele");
		System.out.println(getIter(9));
		System.out.println("Methode creant un carre plein");
		System.out.println(getFullSquare(5));
		System.out.println("Methode creant un carre vide");
		System.out.println(getEmptySquare(5));
		System.out.println("Methode creant un cercle plein");
		System.out.println(getFullCircle(11));
		System.out.println("Methode creant un cercle vide");
		System.out.println(getEmptyCircle(11));
	}

	private static String getEmptyCircle(int i) {
		String circle = "";
		int i1 = (i-1)/2;
		int j2 = 1;
		for (int j = 0; j < (i+1)/2; j++) {
			if (j == 0) {
				circle += getSpaceLine(i1, 1)+"\n";
			} else {
				circle += getSpaceLine(i1, 1)+getSpaceLine(j2, 0)+"*\n";
				j2 += 2;
			}
			i1--;	
		}
		i1 = 1;
		j2 = i-2;
		while (j2 > 1) {
			j2 -= 2;
			circle += getSpaceLine(i1, 1)+getSpaceLine(j2, 0)+"*\n";
			i1++;
		}
		circle += getSpaceLine((i-1)/2, 1);
		return circle;

	}

	private static String getFullCircle(int i) {
		String circle = "";
		int i1 = (i-1)/2;
		int j2 = 1;
		for (int j = 0; j < (i+1)/2; j++) {
			circle += retournerLigne(1, getSpaceLine(i1, j2)+getXLine(i1, " "));
			i1--;
			j2 += 2;
		}
		i1++;
		j2 -= 2;
		while (j2 > 1) {
			i1++;
			j2 -= 2;
			circle += retournerLigne(1, getSpaceLine(i1, j2)+getXLine(i1, " "));
		}
		return circle;
	}

	private static String getEmptySquare(int i) {
		return getEmptyRectangle(i, i);
	}

	private static String getFullSquare(int i) {
		String fullSquare = "";
		for (int j = 0; j < i; j++) {
			fullSquare += retournerLigne(i,"x");
		}
		return fullSquare;
	}

	private static String getIter(int i) {
		if (i%2 == 0) {
			return "erreur, le nombre doit etre impair";
		} else {
			String triangle ="";
			int i2 = i;
			int j2 = 0;
			for (int j = 0; j < (i+1)/2; j++) {
				triangle += getSpaceLine(j2, i2);
				triangle += getXLine(j2, " ");
				triangle += "\n";
				i2 -= 2;
				j2 += 1;
			}
			return triangle;
		}


	}

	private static String getRec(int i) {
		String triangle = "";
		for (int j = 0; j < i; j++) {
			triangle += getSpaceLine(j,i-j);
			triangle += "\n";
		}
		return triangle;
	}

	private static String getEmptyRectangle(int h, int l) {
		String rectangle = "";
		for (int i = 0; i < h; i++) {
			if (i == 0 || i == h-1) {
				rectangle += getStarLine(l);
				rectangle += "\n";
			} else {
				rectangle += "*" + getSpaceLine(l-2,1);
				rectangle += "\n";
			}
		}
		return rectangle;
	}

	private static String getSpaceLine(int i, int j) {
		String spaceLine = "";
		for (int k = 0; k < i; k++) {
			spaceLine += " ";
		}
		for (int k = 0; k < j; k++) {
			spaceLine += "*";
		}
		return spaceLine;
	}

	private static String getRectangle(int h, int l) {
		String rectangle = "";
		for (int j2 = 0; j2 < h; j2++) {
			rectangle += getStarLine(l);
			rectangle += "\n";
		}
		return rectangle;

	}

	private static String getTriangle(int i) {
		String dessin = "";
		for (int j = 0; j < i; j++) {
			dessin += getStarLine(j+1);
			dessin += "\n";
		}
		return dessin;
	}

	private static void displayTriangle8() {
		String dessin = "x";
		for (int i = 0; i < 8; i++) {
			System.out.println(dessin);
			dessin += "x";
		}		
	}

	private static String retournerLigne(int i, String string) {
		return getXLine(i, string) + "\n";
	}

	private static String retournerTrait(int i) {
		return getXLine(i,"x");
	}

	private static String getXLine(int i, String string) {
		String line ="";
		for (int j = 0; j < i; j++) {
			line += string;
		}
		return line;
	}

	private static void printNTimesX(int i, String string) {
		String line ="";
		for (int j = 0; j < i; j++) {
			line += string;
		}
		System.out.println(line);
	}

	private static void backToTheLine() {
		System.out.println("");
	}

	private static String getStarLine(int i) {
		String starLine = "";
		for (int j = 0; j < i; j++) {
			starLine += "*";
		}
		return starLine;
	}

	private static void nStarLine(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");	
		}
	}

}
