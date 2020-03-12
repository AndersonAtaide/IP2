package aulas;

public class Pessoa {
	
	//ATRIBUTOS
		String nome;
		int idade;
		
		//CONSTRUTORES
		
		public Pessoa() { //(construtor padrão, pq se criar um construtor ele não fica mais no padrão).
			
		}
		
		public Pessoa (String nome, int idade) { //(construtor criado, ele retira o construtor padrão).
			this.nome = nome;
			this.idade = idade;
		}
		
		//METODOS
		public int fazerAniversario() {
			idade = idade + 1;
			return idade;
		}
}
