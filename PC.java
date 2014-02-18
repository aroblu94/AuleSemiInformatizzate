import java.util.*;

public class PC {

	//CAMPI
	private boolean connesso;
	private Vector<Proiettore> proiettori;
	private double potenzaTot;
	private String nome;

	//COSTRUTTORE
	public PC(String n) {
		nome = n;
		proiettori = new Vector<Proiettore>();
	}
	
	//METODI
	public boolean connetti(Proiettore p) {		// boolean solo per debug
		connesso = false;
		for(Proiettore x : proiettori) {
			if(p == x) {
				connesso = true;
				break;
			}
		}
		if(!connesso) {
			proiettori.addElement(p);
			return true;
		}
		else
			return false;
	}

	public boolean disconnetti(Proiettore p) {	//boolean solo per debug
		connesso = false;
		for(Proiettore x : proiettori) {
			if(p == x) {
				connesso = true;
				break;
			}
		}
		if(connesso) {
			proiettori.remove(p);
			return true;
		}
		else 
			return false;
	}

	public double potenzaTotale() {
		potenzaTot = 0;
		for(Proiettore x : proiettori) {
			potenzaTot = potenzaTot + x.potenza();
		}
		return potenzaTot;
	}

	public int getNumProiettori() {
		return proiettori.size();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PC " + nome + "\n");
		if(proiettori.isEmpty())
			sb.append("  Nessun proiettore collegato \n");
		else { 
			for(Proiettore x : proiettori) {
				sb.append(x.toString() + "\n");
			}
		}
		return sb.toString();
	}
}
