public class Persona {

	//CAMPI
	private String email = "-";
	private String nome;
	private String cognome;

	//COSTRUTTORE
	public Persona(String n, String c) {
		nome = n;
		cognome = c;
	}

	//METODI
	public String getEmail() {
		return this.email;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setEmail(String e) {
		if(e.contains("@"))
			email = e;
		else
			System.out.println("email non valida ");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(cognome + " " + nome + "\n");
		sb.append("  email: " + email);
		return sb.toString();
	}
	
}
