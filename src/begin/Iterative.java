package begin;

public class Iterative {

	public static void main(String[] args) {
		System.out.println("somme des 10 premiers nombres: "+sumFirstNumbers(174));
		
		System.out.println("somme des nombres pairs inférieurs ou égaux à 10: "+sumEvenNumbers(10));
		
		System.out.println("Somme des 10 premiers nombres pairs: "+sumFirstEvenNumbers(10));
		
		System.out.println("le plus grand nombre n tel que la somme des n premiers nombres est inférieure à 15 000: "+determineBig(15000));
		
		System.out.println("Somme de 8 et 5 en incrémentant: "+sumUsingUnit(10,5));		
	}

	private static int sumFirstNumbers(int i) {
		int res = 0;
		for (int j = 0; j < i; j++) {
			res += j;
		}
		return res;
	}
	
	private static int sumEvenNumbers(int i) {
		int res = 0;
		for (int j = 0; j <= i; j++) {
			if (j%2 == 0) {
				res += j;
			}
		}
		return res;
	}

	private static int sumFirstEvenNumbers(int i) {
		int res = 0;
		for (int j = 0; j < 2*i; j = j+2) {
			res = res + j;
		}
		return res;
	}
	
	private static int determineBig(int i) {
		int res = 0;
		int cpt = 0;
		while (res < i) {
			cpt ++;
			res = sumFirstNumbers(cpt);
		}
		return cpt-1;
	}

	private static int sumUsingUnit(int i, int j) {
		for (int j2 = 1; j2 <= j; j2++) {
			i++;
		}
		return i;
	}
	
}
