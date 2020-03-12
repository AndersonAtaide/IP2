package aulas;

public class Aulas {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(); //construtor default.
		p1.nome = "Jose Silva";
		p1.idade = 23;
		
		Pessoa p2 = new Pessoa("Maria Silva", 19); //construtor criado.

		System.out.println("Idade de Maria: " + p2.idade);
		System.out.println("Idade de José: " + p1.idade);
		
		p1.fazerAniversario();
		
		System.out.println("Nova idade de José " + p1.idade);
	}

}
