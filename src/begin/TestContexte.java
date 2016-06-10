package begin;

import java.util.ArrayList;

public class TestContexte {

	public static void main(String[] args) {
		ArrayList<String> chaineA = new ArrayList<String>(1);
		ArrayList<String> chaineB = new ArrayList<String>(1);
		chaineB.add("valeur ?");
		System.out.println("A = "+chaineA+" B = "+chaineB);
		inverser(chaineA, chaineB);
		System.out.println("A = "+chaineA+" B = "+chaineB);
		
	}
	
	public static void inverser (ArrayList<String> a, ArrayList<String> b) {
		System.out.println("a = "+a+" b = "+b);
		ArrayList<String> c=a; a=b; b=c;
		c.add("reference");
		System.out.println("a = "+a+" b = "+b+" c = "+c);
	}
}
