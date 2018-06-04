package exercicio2_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


import java.util.ArrayList;

public class FactorySobrenomeNome implements FactoryNome {
	
	ArrayList<Nome> nomes;
	
	public FactorySobrenomeNome() {
		nomes = new ArrayList<Nome>();
	}
	
	public Nome getNome(String string) {
		Nome nome = new SobrenomeNome(string);
		nomes.add(nome);
		return nome;
	}

	@Override
	public void listarNomes() {
		System.out.println("Listando 'Sobrenome, Nome':");
		for(Nome nome : nomes) {
			nome.exibir();
		}
		
	}

}
