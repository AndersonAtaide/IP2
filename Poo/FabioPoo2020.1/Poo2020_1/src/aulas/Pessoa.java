package aulas;

public class Pessoa {
	
	//ATRIBUTOS
		String nome;
		int idade;
		
		//CONSTRUTORES
		
		public Pessoa() { //(construtor padr�o, pq se criar um construtor ele n�o fica mais no padr�o).
			
		}
		
		public Pessoa (String nome, int idade) { //(construtor criado, ele retira o construtor padr�o).
			this.nome = nome;
			this.idade = idade;
		}
		
		//METODOS
		public int fazerAniversario() {
			idade = idade + 1;
			return idade;
		}
}
