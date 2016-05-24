package begin.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import begin.Liste;

public class ListeTest {

	@Test
	public void testPalindromeListe() {
		fail("Not yet implemented");
	}

	@Test
	public void testInverserListe() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testSupprimerToutesLesOccurences() {
		fail("Not yet implemented");
	}

	@Test
	public void testSupprimerPremierElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testSupprimerElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetElement() {
		fail("Not yet implemented");
	}

	@Test
	public void testConcat() {
		ArrayList<String> listeVide = getListeVideTest();
		ArrayList<String> liste1 = getListCoucouLeMonde();
		ArrayList<String> liste2 = getListLeMonde();  
		//assertEquals(Liste.concat(liste1,liste2));
		assertEquals(liste2.addAll(liste1),Liste.concat(liste2,liste1));
		assertEquals(liste1.addAll(listeVide),Liste.concat(liste1,listeVide));
	}

	@Test
	public void testGetTaille() {
		ArrayList<String> listeVide = getListeVideTest();
		ArrayList<String> liste1 = getListCoucouLeMonde();
		ArrayList<String> liste2 = getListLeMonde();
		ArrayList<String> liste3 = getListMonde();
		assertEquals(0,Liste.getTaille(listeVide));
		assertEquals(3,Liste.getTaille(liste1));
		assertEquals(2,Liste.getTaille(liste2));
		assertEquals(1,Liste.getTaille(liste3));
	}

	@Test
	public void testDernier() {
		ArrayList<String> listeVide = getListeVideTest();
		ArrayList<String> liste1 = getListCoucouLeMonde();
		ArrayList<String> liste2 = getListLeMonde();
		ArrayList<String> liste3 = getListMonde();
		assertNull(Liste.dernier(listeVide));
		assertEquals("monde", Liste.dernier(liste1));
		assertEquals("monde", Liste.dernier(liste2));
		assertEquals("monde", Liste.dernier(liste3));
	}

	@Test
	public void testEstSurDernierElement() {
		ArrayList<String> listeVide = getListeVideTest();
		ArrayList<String> liste1 = getListCoucouLeMonde();
		ArrayList<String> liste2 = getListLeMonde();
		ArrayList<String> liste3 = getListMonde();
		assertFalse(Liste.estSurDernierElement(listeVide));
		assertFalse(Liste.estSurDernierElement(liste1));
		assertFalse(Liste.estSurDernierElement(liste2));
		assertTrue(Liste.estSurDernierElement(liste3));
	}

	@Test
	public void testSuite() {
		ArrayList<String> listeVide = getListeVideTest();
		ArrayList<String> liste1 = getListCoucouLeMonde();
		ArrayList<String> liste2 = getListLeMonde();
		ArrayList<String> liste3 = getListMonde();
		assertNull(Liste.suite(listeVide));
		assertEquals(liste2, Liste.suite(liste1));
		assertEquals(liste3, Liste.suite(liste2));
		assertEquals(listeVide, Liste.suite(liste3));
	}

	@Test
	public void testPremier() {
		ArrayList<String> listeVide = getListeVideTest();
		ArrayList<String> liste1 = getListCoucouLeMonde();
		assertNull(Liste.premier(listeVide));
		assertEquals(Liste.premier(liste1),"coucou");
	}

	@Test
	public void testEstVide() {
		ArrayList<String> listeVide = getListeVideTest();
		ArrayList<String> liste1 = getListCoucouLeMonde();
		assertFalse(Liste.estVide(liste1));
		assertTrue(Liste.estVide(listeVide));
	}

	private ArrayList<String> getListMonde() {
		ArrayList<String> liste3 = new ArrayList<String>(3);
		liste3.add("monde");
		return liste3;
	}
	
	private ArrayList<String> getListLeMonde() {
		ArrayList<String> liste2 = new ArrayList<String>(3);
		liste2.add("le");
		liste2.add("monde");
		return liste2;
	}
	
	private ArrayList<String> getListCoucouLeMonde() {
		ArrayList<String> liste1 = new ArrayList<String>(3);
		liste1.add("coucou");
		liste1.add("le");
		liste1.add("monde");
		return liste1;
	}

	private ArrayList<String> getListeVideTest() {
		return new ArrayList<String>(1);
	}

}
