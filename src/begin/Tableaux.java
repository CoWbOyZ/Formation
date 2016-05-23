package begin;

import java.util.ArrayList;

public class Tableaux {

	public static void main(String[] args) {
		int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
		double tableaudouble[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		char tableauCharactere[] = {'a','b','c','d','e','f','g','h'};
		String tableauChaine[] = {"chaine1","chaine2","chaine3","chaine4"};
		
		int tableauEntier2[] = new int[6];
		int[] tableauEntier3 = new int[6];
		
		int premiersNombres[][] = {{0,2,4,6,8},{1,3,5,7,9}};
		
		for (int i = 0; i < tableauEntier.length; i++) {
			System.out.println("emplacement: "+i+"\nvaleur :"+tableauEntier[i]);
			
		}
		
	}
	
	public void listeDeChocolats() {
		ArrayList<Integer> boite = new ArrayList<Integer>(5);
		boite.add(3);
		boite.add(-3);
		boite.add(8);
		boite.add(18);
		boite.add(1);
		boite.add(4);
		
		Integer chocolat = null;
		for (int i = 0; i < boite.size(); i++) {
			chocolat = boite.get(i);
			System.out.println(chocolat);
		}
		
		for (Integer chocolat2 : boite) {
			System.out.println(chocolat2);
		}
	}

}
