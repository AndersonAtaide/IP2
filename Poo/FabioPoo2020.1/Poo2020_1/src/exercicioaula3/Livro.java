package exercicioaula3;

public class Livro {
	String nomeLivro;
	Autor autor;
	double preco;
	int qtyEmEstoque;
	
	public Livro (String nomeLivro, Autor autor, double preco, int qtyEmEstoque) {
		this.nomeLivro = nomeLivro;
		this.preco = preco;
		this.qtyEmEstoque = qtyEmEstoque;
		this.autor = autor;
	}
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQtyEmEstoque() {
		return qtyEmEstoque;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setQtyEmEstoque(int qtyEmEstoque) {
		this.qtyEmEstoque = qtyEmEstoque;
	}

	@Override
	public String toString() {
		return "Livro [nome do Livro=" + nomeLivro + ", " + autor + ", Preço=" + preco + ", Quantidade Em Estoque= "
				+ qtyEmEstoque + "]";
	}
	
}
