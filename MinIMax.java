package domaci;

import java.util.Scanner;

public class MinIMax {

	public static void main(String[] args) {
	
	/*	Cest zadatak na intervjuu: Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i minimalni broj. */
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete?");
		int n = sc.nextInt();
		int max = 0;
		int min = 10;
		int i = 1;
		int broj = 0;
		
		for (i = 1; i <= n; i++ ) {
			System.out.println("Unesite " + i + ". broj: ");
			broj = sc.nextInt();
		if (broj > max) {
			max = broj;
		}
		if (broj < min) {
			min = broj;
		
		}
			
	}
		System.out.println("Najveci od unetih brojeva je: " + max);
		System.out.println("Najmanji od unetih brojeva je: " + min);
		
		}

}
