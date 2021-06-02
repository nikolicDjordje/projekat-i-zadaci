package domaci;

import java.util.Scanner;

public class SkakacPion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite red u kojem se nalazi skakac: ");
		int redSkakac = sc.nextInt();
		System.out.println("Unesite kolonu u kojoj se nalazi skakac: ");
		int kolonaSkakac = sc.nextInt();
		System.out.println("Unesite red u kojem se nalazi pion: ");
		int redPion = sc.nextInt();
		System.out.println("Unesite kolonu u kojoj se nalazi pion: ");
		int kolonaPion = sc.nextInt();
		
		Pozicija(redSkakac, kolonaSkakac, redPion, kolonaPion);
		
	}
public static void Pozicija(int a, int b, int c, int d)  {
	boolean napad = true;
	boolean prviNacin = (a == c - 2 && b == d - 1);
	boolean drugiNacin = (a == c - 2 && b == d + 1);
	boolean treciNacin = (a == c - 1 && b == d + 2);
	boolean cetvrtiNacin = (a == c - 1 && b == d - 2);
	boolean petiNacin = (a == c + 1 && b == d + 2);
	boolean sestiNacin = (a == c + 1 && b == d - 2);
	boolean sedmiNacin = (a == c + 2 && b == d + 1);
	boolean osmiNacin = (a == c + 2 && b == d - 1);
	napad = (a <= 8 && a > 0) && (b <= 8 && b > 0) && (c <= 8 && b > 0) && (d <= 8 && d > 0);
	while (napad)  {
		if ((prviNacin) || (drugiNacin) || (treciNacin) || (cetvrtiNacin) 
				|| (petiNacin) || (sestiNacin) || (sedmiNacin) || (osmiNacin)) {
			System.out.println("Pion je napadnut!");
			return;
		} else {
			System.out.println("Pion nije napadnut!");
			return;
		}
	}
         if (!napad) {
        	 System.out.println("Greska u unosu!");
         }
}
}
