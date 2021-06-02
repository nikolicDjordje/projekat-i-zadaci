package domaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*Napisati program koji ispisuje koliko cifara ima uneti broj n. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljeni broj: ");
		int broj = sc.nextInt();
		int cifra = broj % 10;
		int zbirCifara = 0;
		int pojedinacnaCifra = 1;
		
	do {
		if (cifra > 0) {
			pojedinacnaCifra = 1;
		}
		zbirCifara = zbirCifara + pojedinacnaCifra;
		broj = broj / 10;
	} while (broj > 0);
		
		System.out.println("Uneti broj ima: " + zbirCifara + " cifara");


	}

}
