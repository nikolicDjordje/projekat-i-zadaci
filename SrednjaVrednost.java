package domaci;

import java.util.Scanner;

public class SrednjaVrednost {

	public static void main(String[] args) {
		
	/*	Napisati program koji za tri unete ocene ispisuje srednju vrednost i u numeričkom i opisnom obliku 
		(opisan oblik - odlican, vrlo dobar, dobar, dovoljan, nedovoljan) */
		
		Scanner sc = new Scanner(System.in);
		int ocena;
		int zbirOcena = 0;
		double srednjaVrednost = 0;
	    
		for (int i = 1; i <= 3; i++) {
			System.out.println("Unesite " + i + ". ocenu");
			ocena = sc.nextInt();
			zbirOcena = zbirOcena + ocena;
			while (ocena <= 0 || ocena > 5) {
				System.out.println("Netacan unos ocene, pokusajte ponovo");
				ocena = sc.nextInt();
			}
			srednjaVrednost = zbirOcena / 3;
	}
		
		if (srednjaVrednost < 1.5) {
			System.out.println("1, Nedovoljan");
		} else if (srednjaVrednost >= 1.5 && srednjaVrednost < 2.5)  {
			System.out.println("2, Dovoljan");
		} else if (srednjaVrednost >= 2.5 && srednjaVrednost < 3.5) {
			System.out.println("3, Dobar");
		} else if (srednjaVrednost >= 3.5 && srednjaVrednost < 4.5) {
			System.out.println("4, Vrlo dobar");
		} else if (srednjaVrednost >= 4.5) {
			System.out.println("5, Odlican");
		}

	}
		
	
}
