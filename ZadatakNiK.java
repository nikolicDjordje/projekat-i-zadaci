package domaci;

import java.util.Scanner;

public class ZadatakNiK {

	public static void main(String[] args) {
	//	Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci one koji su deljivi brojem k.
		

Scanner sc = new Scanner(System.in);
System.out.println("Koliko brojeva zelite da unesete: ");
int n = sc.nextInt();
System.out.println("Brojevi deljivi kojim brojem ne treba da ulaze u zbir? ");
int k = sc.nextInt();
int zbir = 0;
int broj;

for (int i = 1; i <= n; i++) {
	System.out.println("Unesite " + i + " .broj: ");
	broj = sc.nextInt();
	
	if (broj % k != 0) {
		zbir = zbir + broj;
	}
}

System.out.println("Zbir trazenih brojeva je: " + zbir);
	}

}
