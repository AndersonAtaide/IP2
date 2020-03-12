package programa02; //EXERCÍCIO 2 DO SITE DO PROFESSOR

public class Porta {

	//ATRIBUTOS
	boolean aberta;
	String cor;
	double dimensaoX, dimensaoY, dimensaoZ;
	
	//METODOS
	void abrir() {
		this.aberta = true;
	}
	
	void fechar() {
		this.aberta = false;
	}
	
	void pintar(String cor) {
		this.cor = cor;
	}
	
	boolean estaAberta() {
		return this.aberta;
	}
}
