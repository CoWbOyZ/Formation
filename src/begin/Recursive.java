package begin;

public class Recursive {

	public static void main(String[] args) {
		System.out.println("somme des 10 premiers nombres: "+sumFirstNumbers(10));
		
		System.out.println("somme des nombres pairs inférieurs ou égaux à 10: "+sumEvenNumbers(10));
		
		System.out.println("Somme des 10 premiers nombres pairs: "+sumFirstEvenNumbers(10));
		
		System.out.println("Somme des 10 premiers nombres pairs sans appel de fonction: "+sumFirstEvenNumbersSelf(10));
		
		System.out.println("Somme de 8 et 5 en incrémentant: "+sumUsingUnit(8,5));
		
		System.out.println("Multiplication de deux entiers en utilisant l'addition: "+timesUsingAdd(2,-6));

	}
/**
 * la fonction realise le produit de deux entiers en utilisant uniquement l'addition
 * @param i premier entier du produit
 * @param j deuxieme entier du produit
 * @return le produit des deux entiers
 */
	private static  int timesUsingAdd(int i, int j) {
		int res = 0;
		if ((i < 0 && j > 0) || (i > 0 && j < 0)) {
			for (int j2 = 0; j2 < Math.abs(j); j2++) {
				res = res + Math.abs(i);
			}
			return -res;
		} else {
			for (int j2 = 0; j2 < j; j2++) {
				res = res + i;
			}
			return res;
		}
	}
/**
 * sumUingUnit est une fonction faisant la somme de deux entiers en utilisant uniquement l'incrémentation
 * @param i est le premier nombre de la somme
 * @param j est le deuxième nombre de la somme
 * @return la somme des deux nombres
 */
	private static int sumUsingUnit(int i, int j) {
		if (i > j) {
			return sumUsingUnitAux(j, i);
		} else {
			return sumUsingUnitAux(i, j);
		}
	}
	
	private static int sumUsingUnitAux(int i, int j) {
		if (i == 0) {
			return j;
		} else {
			return sumUsingUnitAux(i-1, j+1);
		}
	}

	private static int sumFirstEvenNumbersSelf(int i) {
		if (i == 0) {
			return 0;
		} else {
			if (i % 2 == 1) {
				return 0 + sumFirstEvenNumbersSelf(i-1);
			} else {
				return i + sumFirstEvenNumbersSelf(i-2);
			}
		}
	}

	private static int sumFirstEvenNumbers(int i) {
		return sumEvenNumbers(2*i);
	}

	private static int sumEvenNumbers(int i) {
		if (i == 0) {
			return 0;
		} else {
			if (i % 2 == 1) {
				return 0 + sumEvenNumbers(i-1);
			} else {
				return i + sumEvenNumbers(i-2);
			}
		}
		
	}

	private static int sumFirstNumbers(int i) {

		if (i == 0) {
			return 0;
		} else {
			return i + sumFirstNumbers(i-1);
		}
	}
}
