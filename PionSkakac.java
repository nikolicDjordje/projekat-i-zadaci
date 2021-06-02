package domaci;

import java.util.Scanner;

public class PionSkakac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite red u kojem se nalazi pion: ");
		int redPion = sc.nextInt();
		System.out.println("Unesite kolonu u kojoj se nalazi pion: ");
		int kolonaPion = sc.nextInt();
		System.out.println("Unesite red u kojem se nalazi skakac: ");
		int redSkakac = sc.nextInt();
		System.out.println("Unesite kolonu u kojoj se nalazi skakac: ");
		int kolonaSkakac = sc.nextInt();
		pozicija(redPion, kolonaPion, redSkakac, kolonaSkakac);
	
	}
public static void pozicija(int a, int b, int c, int d) {
	boolean provera = true;
	provera = (a <= 8 && a > 0) && (b <= 8 && b > 0) && (c <= 8 && b > 0) && (d <= 8 && d > 0);
	while (provera) {
	if ((c + 1 == a && d + 1 == b) || (a - 1 == c && b + 1 == d)) {
		System.out.println("Skakac je napadnut!");
		return;
	} else {
		System.out.println("Skakac nije napadnut!");
		return;
	}
	
	}
	
	if (!provera)  {
		System.out.println("Greska u unosu!");
	}
}
}
