public class Docente extends Persona {

	//CAMPI
	private String materia;

	//COSTRUTTORE
	public Docente(String n, String c, String m) {
		super(n,c);
		materia = m;
	}

	//METODI
	public String toString() {
		/*StringBuilder sb = new StringBuilder();
		sb.append("DOCENTE \n");
		super.toString();
		sb.append("Materia: " + materia + "\n");*/
		return super.toString() + "\n  materia: " + materia + "\n";
	}

	public String toStringAula() {
		return super.getCognome() + " " + super.getNome() + "\n";
	}
}
