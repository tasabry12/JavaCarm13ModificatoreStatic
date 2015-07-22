/*
 * MODIFICATORE STATIC
 * Il modificatore static è condiviso da tutte le istanze della classe
 */

class Esempio {
	public static int x = 10;
}

public class mainClass {
	public static void main(String[] args) {

		/*
		 * ad un metodo dichiarato static vi possiamo accedere in questo modo
		 * nomeClasse.nomeMetodo()
		 * 
		 * senza accedervi cosi
		 * 
		 * nomeOggetto.nomeMetodo();
		 */

		System.out.println(Esempio.x);

		Esempio e1 = new Esempio();
		Esempio e2 = new Esempio();
		
		e1.x=20;              //qui vado a modificare x per tutte le istanze di quella classe
		
		System.out.println(e1.x);
		System.out.println(e2.x);

	}
}
