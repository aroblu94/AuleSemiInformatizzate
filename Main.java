import java.util.*;

public class Main {

	public static boolean debug = true;

	public static void main(String[] args) {

		//creo le aule
		Aula aula1 = new Aula("A1", 8, 2);
		Aula aula2 = new Aula("A2", 10, 5);

		//creo gli studenti
		Studente aronne = new Studente("Aronne", "Brivio", 831154);
		Studente lorenzo = new Studente("Lorenzo", "Cucchi", 831234);
		Studente fede = new Studente("Federico", "Almaviva", 834321);

		//creo i docenti
		Docente tarallo = new Docente("Massimo Emilio", "Tarallo", "Matematica del Continuo");
		Docente pighizzini = new Docente("Giovanni", "Pighizzini", "Programmazione");

		//imposto le email
		aronne.setEmail("aroblu94@gmail.com");
		lorenzo.setEmail("lorenzopuntocucchi@gmail.com");
		fede.setEmail("nonmiricordo");
		pighizzini.setEmail("pighizzini@di.unimi.it");

		//creo i PC
		PC pc1 = new PC("pc1");
		PC pc2 = new PC("pc2");

		//creo i proiettori
		Proiettore p1 = new Proiettore("p1");
		Proiettore p2 = new Proiettore("p2");
		Proiettore p2 = new Proiettore("p3");

		//setto la potenza dei proiettori
		p1.setPotenza(60.0);
		p2.setPotenza(50.6);
		p3.setPotenza(87.2);

		//assegno i docenti alle aule
		aula1.assegnaDocente(tarallo);


		if(debug) {
			System.out.println();
			System.out.println(aula1);
			System.out.println(aula2);
			System.out.println();
			System.out.println(aronne);
			System.out.println(lorenzo);
			System.out.println(fede);
			System.out.println();
			System.out.println(pighizzini);
			System.out.println(tarallo);
			System.out.println();
			System.out.println(pc1);
			System.out.println(pc2);
			System.out.println();
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println();
		}
	}
}