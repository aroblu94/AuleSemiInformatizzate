public class PC {

	//CAMPI
	private boolean connesso;

	//COSTRUTTORE
	public PC() {
		proiettore = null;
	}
	
	//METODI
	public void connetti(Proiettore p) {
		if(proiettore == null)
			proiettore = p;
		else
			System.out.println("Proiettore già connesso ");
	}

	public void disconnetti(Proiettore p) {
		if(proiettore != null)
			proiettore = null;
		else
			System.out.println("Nessun proiettore connesso ");
	}
}
