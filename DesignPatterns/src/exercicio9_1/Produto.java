package exercicio9_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Produto {

	private String nome;
	private double preco;
	private double valorFaltante;
	
	public Produto(String nome, double preco) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setValorFaltante(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorFaltante() {
		return valorFaltante;
	}

	public void setValorFaltante(double valorFaltante) {
		this.valorFaltante = valorFaltante;
	}

}
