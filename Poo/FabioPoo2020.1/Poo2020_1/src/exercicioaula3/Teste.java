package exercicioaula3;

public class Teste {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Fabio", "Fabio@eu.com", 'M');
		Autor autor2 = new Autor("Augusto", "Augusto@eu.com", 'M');

		Livro livro1 = new Livro("A saga do programador", autor1, 2022, 1);
		Livro livro2 = new Livro("A saga do mestre", autor2, 2024, 1);
				
		System.out.println(autor1);
		System.out.println(autor2);
		
		System.out.println(livro1);
		System.out.println(livro2);
		
	}

}
