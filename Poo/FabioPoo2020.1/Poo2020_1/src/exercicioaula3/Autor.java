package exercicioaula3;

public class Autor {
	String nomeAutor;
	String email;
	char genero;
	
	public Autor (String nomeAutor, String email, char genero ) {
		this.nomeAutor = nomeAutor;
		this.email = email;
		this.genero = genero;		
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail (String email) {
		this.email = email;
	}
	
	public char getGenero() {
		return genero;
	}

	
	
}
