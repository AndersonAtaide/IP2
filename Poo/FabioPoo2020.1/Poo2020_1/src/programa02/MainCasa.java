package programa02;

public class MainCasa {

	public static void main(String[] args) {
		
		//instanciando 3 objetos do tipo Porta
		
		Porta p1 = new Porta();
		p1.pintar("Branca");
		p1.abrir();
		
		Porta p2 = new Porta();
		p2.pintar("Branca");
		p2.fechar();
		
		Porta p3 = new Porta();
		p3.pintar("Branca");
		p3.abrir();
		
		//criar uma casa
		
		Casa casa = new Casa();
		casa.porta1 = p1;
		casa.porta2 = p2;
		casa.porta3 = p3;
		
		System.out.println("Quantidade de poras abertas: " + casa.quantasPortasEstaoAbertas());
		
	}

}


/*Foi iniciado a CLASSE PORTA e preenchido os seus atributos, depois disso foi iniciado a CLASSE CASA e seus atributos
foram apotados para a CLASSE PORTA*/