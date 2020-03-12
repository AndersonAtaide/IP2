package programa02; //EXERCÍCIO 2 DO SITE DO PROFESSOR

public class Casa {
	
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	void pintar(String cor) {
		
		this.cor = cor;
		
		this.porta1.pintar(cor);
		this.porta2.pintar(cor);
		this.porta3.pintar(cor);
	}

	
	int quantasPortasEstaoAbertas() {
		
		int portasAbertas = 0;
		
		portasAbertas = (porta1.aberta) ? portasAbertas + 1 : portasAbertas;
		portasAbertas = (porta2.aberta) ? portasAbertas + 1 : portasAbertas;
		portasAbertas = (porta3.aberta) ? portasAbertas + 1 :  portasAbertas;
		
		return portasAbertas;
	}
}
