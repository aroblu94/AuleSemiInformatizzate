public class Studente extends Persona {

	//CAMPI
	private int matricola;

	//COSTRUTTORE
	public Studente(String n, String c, int m) {
		super(n,c);
		matricola = m;
	}

	//METODI
	public int getMatricola() {
		return matricola;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("STUDENTE \n");
		sb.append("Matricola: " + matricola + "\n");
		super.toString();
		return sb.toString();
	}
}
