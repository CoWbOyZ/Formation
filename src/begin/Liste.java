package begin;

import java.util.ArrayList;

public class Liste {

	public static void main(String[] args) {
		ArrayList<String> testListe = init();
		System.out.println("La liste est :");
		display(testListe);
		System.out.println("\nLa liste est elle vide?");
		System.out.println(estVide(testListe));
		System.out.println("\nle premier element de la liste est :");
		System.out.println(premier(testListe));
		System.out.println("\nApr�s supression du premier �l�ment la liste est :");
		display(suite(testListe));
		System.out.println("\nLa liste est elle r�duite a un seul element?");
		System.out.println(estSurDernierElement(testListe));
		System.out.println("\nLe dernier �l�ment de la liste est :");
		System.out.println(dernier(testListe));
		display(testListe);
		System.out.println("\nLa taille de la liste est :");
		System.out.println(getTaille(testListe));
		System.out.println("\nLa liste est :");
		afficherListe(testListe);
		System.out.println("\nLa concat�nation des deux listes nous donnent :");
		afficherListe(concat(testListe, testListe));
		/*System.out.println(getElement(liste,1));
		System.out.println(supprimerElement(liste,1));
		System.out.println(supprimerPremierElement(liste,1));
		System.out.println(supprimerToutesLesOccurences(liste,1));
		System.out.println(setElement(liste,1,18));
		System.out.println(addElement(liste,1,19));
		System.out.println(inverserListe(liste));
		System.out.println(palindromeListe(liste));*/

	}
	
	/**
	 * test si la liste n'est compos� d'aucun �l�ment
	 * @param liste, la liste � tester
	 * @return true si la liste est vide, false sinon
	 */
	public static boolean estVide(ArrayList<String> liste) {
		return liste.size() == 0;
	}
	
	/**
	 * Renvoi le premier element d'une liste
	 * @param liste
	 * @return entier
	 */
	public static String premier(ArrayList<String> liste) {
		String rep = null;
		if (!estVide(liste)) {
			rep = liste.get(0);
		}
		return rep;
	}
	
	/**
	 * Supprime le premier element d'une liste
	 * @param liste
	 * @return la liste tronqu� de son premier �l�ment
	 */
	public static ArrayList<String> suite(ArrayList<String> liste) {
		ArrayList<String> liste2 = null;
		if (!estVide(liste)) {
			liste2 = new ArrayList<String>();
			liste2.addAll(liste);
			liste2.remove(0);
		}
		return liste2;
	}

	/**
	 * permet de savoir si la liste est r�duite � son dernier �l�ment
	 * @param liste
	 * @return
	 */
	public static boolean estSurDernierElement(ArrayList<String> liste) {
		return !estVide(liste) && estVide(suite(liste));
	}
	
	/**
	 * fonction retournant le dernier �l�ment d'une liste
	 * @param liste
	 * @return un entier, dernier �l�ment de la liste
	 */
	public static String dernier(ArrayList<String> liste) {
		String rep = null;
		if (!estVide(liste)) {
			if (estSurDernierElement(liste)) {
				rep = premier(liste);
			} else {
				rep = dernier(suite(liste));
			}
		} 
		return rep;
	}
	
	/**
	 * fonction  recursive terminal permettant de connaitre le nombre d'�l�ment contenu par une liste
	 * @param liste dont on souhaite connaitre la taille
	 * @return le nombre d'�l�ment contenu par la liste
	 */
	public static int getTaille(ArrayList<String> liste) {
		return getTailleAux(liste,1);
	}
	
	/**
	 * fonction auxiliaire op�rant la r�cursivit� de getTaille
	 * @param liste dont on souhaite connaitre la taille
	 * @param cpt doit �tre initialis� � 1, permet de compter le nombre de r�cursivit�
	 * @return le nombre d'�l�ment contenu par la liste
	 */
	public static int getTailleAux(ArrayList<String> liste, int cpt) {
		if (estVide(liste)) {
			return 0;
		} else {
			if (estSurDernierElement(liste)) {
				return cpt;
			} else {
				cpt++;
				return getTailleAux(suite(liste),cpt);
			}
			
		}
	}
	
	/**
	 * Proc�dure d'affichage de liste
	 * @param liste
	 */
	public static void afficherListe(ArrayList<String> liste) {
		int i = 0;
		while (!estVide(liste)) {
			System.out.println("donn�e � l'indice "+i+" = "+premier(liste));
			i++;
			liste = suite(liste);
		}
		
	}
	
	/**
	 * Fonction r�alisant la concat�nation de deux en liste en une nouvelle
	 * @param liste, la liste qui sera en haut de la nouvelle liste
	 * @param liste2, la liste qui sera en bas de la nouvelle liste
	 * @return une nouvelle liste
	 */
	public static ArrayList<String> concat(ArrayList<String> liste, ArrayList<String> liste2) {
		ArrayList<String> concatListe = new ArrayList<String>(getTaille(liste)+getTaille(liste2));
		concatListe.addAll(liste);
		concatListe.addAll(liste2);
		return concatListe;
	}
	/*
	public static int getElement(ArrayList<String> liste, int i) {
		return 0;
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<String> supprimerElement(ArrayList<String> liste, int i) {
		return liste;
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<String> supprimerPremierElement(ArrayList<String> liste, int i) {
		return liste;
		// TODO Auto-generated method stub

	}

	public static ArrayList<String> supprimerToutesLesOccurences(ArrayList<String> liste, int i) {
		return liste;
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<String> setElement(ArrayList<String> liste, int i, int j) {
		return liste;
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<String> addElement(ArrayList<String> liste, int i, int j) {
		return liste;
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<String> inverserListe(ArrayList<String> liste) {
		return null;
		// TODO Auto-generated method stub

	}
	
	public static boolean palindromeListe(ArrayList<String> liste) {
		return false;
		// TODO Auto-generated method stub

	}
	*/

	/**
	 * Permet l'affichage de la liste avec l'indice correspondant � l'�l�ment affich�
	 * @param liste
	 */
	private static void display(ArrayList<String> liste) {
		for (int i = 0; i < liste.size(); i++) {
			System.out.println("donn�e � l'indice "+i+" = "+liste.get(i));
		}
	}

	/**
	 * Cr�e une liste pour pouvoir faire des tests
	 * @return liste
	 */
	private static ArrayList<String> init() {
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("a");
		liste.add("b");
		liste.add("c");
		liste.add("d");
		return liste;

	}
}