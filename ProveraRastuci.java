package domaci;

import java.util.Scanner;

public class ProveraRastuci {

	public static void main(String[] args) {
		/* Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
		Primer1 niza: 3 54 123 18
		Ispis: Niz nije rastuci.
		Primer2 niza: 71 422 1001 5054
		Ispis: Niz je rastuci. */


		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = sc.nextInt();
		int [] niz = new int [duzina];
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza: ");
			niz [i] = sc.nextInt();
		}
		
		boolean rezultatProvere = proveraRastuci(niz);
		if (rezultatProvere) {
			System.out.println("Niz je rastuci!");
		} else if (!rezultatProvere) {
			System.out.println("Niz nije rastuci!");
		}
	}

	public static boolean proveraRastuci (int [] niz)  {
		
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz [i] > niz [i + 1])
				return false;
		}
		return true;
	}
}
