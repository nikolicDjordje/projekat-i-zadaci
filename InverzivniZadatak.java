package domaci;

import java.util.Scanner;

public class InverzivniZadatak {

	public static void main(String[] args) {
	/*	Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
		Primer niza: 32 54 123 18
		Ispis: 18 123 54 32 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = sc.nextInt();
		
		int [] niz = new int [duzina];
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza: ");
			niz[i] = sc.nextInt();
		}
	//	ispisNiza(niz);
ispisInverzibilnog(niz);
	/*}
	
	public static void ispisNiza (int [] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
			*/
	}
	public static void ispisInverzibilnog (int [] niz) {
		for (int i = niz.length - 1; i >= 0 ; i--) {
				System.out.print(niz[i]+ " ");	
	}
		
	}
}
