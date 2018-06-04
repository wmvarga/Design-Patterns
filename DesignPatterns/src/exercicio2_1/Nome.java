package exercicio2_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public abstract class Nome {
	
	private String nome;
	private String sobrenome;
	
	public abstract void exibir();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
