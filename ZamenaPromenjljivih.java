package domaci;

public class ZamenaPromenjljivih {

	public static void main(String[] args) {
	/*	Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, 
		Napisati program tako da im se vrednosti zamene. Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih */

		int a = 3;
		int b = 7;
		int prom;
		
		System.out.println("Vrednost za a je: " + a + " a vrednost za b je: " + b);
		
		/* do {
		prom = b;
		b = a;
		a = prom;
					}
		while (a < b);
		
		System.out.println("Vrednost za a je: " + a + " a vrednost za b je: " + b); */
		
		b = 21 / b;
		a = 21 / a;
		System.out.println("Vrednost za a je: " + a + " a vrednost za b je: " + b);

	}

}
