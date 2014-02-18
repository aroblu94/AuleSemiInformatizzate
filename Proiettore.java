public class Proiettore {

	//CAMPI
	private double potenza;
	private String nome;

	//COSTRUTTORE
	public Proiettore(String n) {
		nome = n;
	}

	//METODI
	public void setPotenza(double p) {
		potenza = p;
	}

	public double potenza() {
		return potenza;
	}

	public String toString() {
		return ("PROIETTORE " + nome + " - potenza: " + potenza + " Watt");
	}
}
