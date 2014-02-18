import java.util.*;
import java.lang.*;

public class Aula {

	//CAMPI
	private int capienzaMax;
	private int minPrenotazioni;
	private Vector<Persona> prenotati;
	private Vector<Persona> presenti;
	private PC pc;
	private Docente docente;
	private String nome;
	private Proiettore proiettore;

	//COSTRUTTORE
	public Aula(String n, int max, int min) {
		capienzaMax = max;
		minPrenotazioni = min;
		prenotati = new Vector<Persona>();
		presenti = new Vector<Persona>();
		nome = n;
	}

	//METODI
	public void setCapienza(int cap) {
		capienzaMax = cap;
	}

	public void setMinimo(int min) {
		minPrenotazioni = min;
	}

	public boolean raggiuntoMinimo() {
		return prenotati.size()==minPrenotazioni;
	}

	public double percentualePrenotati() {
		return prenotati.size()/capienzaMax*100;
	}

	public double percentualePresenti() {
		return presenti.size()/capienzaMax*100;
	}

	public void assegnaPC(PC pc) {
		this.pc = pc;
	}
	
	public void assegnaProiettore(Proiettore p) {
		this.proiettore = p;
	}

	public void assegnaDocente(Docente doc) {
		this.docente = doc;
	}

	public void prenota(Persona p) {
		boolean presente = false;
		if(prenotati.size() < capienzaMax) {
			for(Persona x : prenotati) {
				if(x.getEmail().equals(p.getEmail())) {
					presente = true;
					break;
				}
			}
			if(!presente)
				prenotati.addElement(p);
			else
				System.out.println("Persona già prenotata ");
		}
	}

	public void annullaPrenota(Persona p) {
		boolean presente = false;
		for(Persona x : prenotati) {
			if(x.getEmail().equals(p.getEmail())) {
					presente = true;
					break;
			}
		}
		if(presente)
			prenotati.remove(p);
		else
			System.out.println("Persona non prenotata! ");
	}

	public void entra(Studente s) {
		for(Persona x : prenotati) {
			if(s.getEmail().equals(x.getEmail()))
				presenti.addElement(s);
		}
	}

	public void esce(Studente s) {
		boolean dentro = false;
		for (Persona x : presenti) {
			if(s.getEmail().equals(x.getEmail())) {
				dentro = true;
				break;
			}
		}
		if(dentro)
			presenti.remove(s);
		else
			System.out.println("Persona non presente!" );
	}

	//Soliti metodi get...
	public int getCapienzaMax() {
		return capienzaMax;
	}

	public int getMinPrenotazioni() {
		return minPrenotazioni;
	}

	public PC getPc() {
		return this.pc;
	}

	public Docente getDocente() {
		return this.docente;
	}

	public Vector<Persona> getPresenti() {
		return presenti;
	}

	public Vector<Persona> getPrenotati() {
		return prenotati;
	}

	public String getNome() {
		return nome;
	}

	public boolean haPc() {
		if(this.pc==null)
			return false;
		else
			return true;
	}

	public boolean haProiettore() {
		if(this.proiettore==null)
			return false;
		else 
			return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("AULA " + nome + "\n");
		sb.append("(Capienza: " + capienzaMax + " posti \nMinimo prenotazioni: " + minPrenotazioni + ")\n");
		sb.append("PC " + haPc() + "\n");
		sb.append("Proiettore " + haProiettore() + "\n");
		return sb.toString();
	}
		



}
