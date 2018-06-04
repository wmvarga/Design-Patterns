package exercicio2_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class TesteProvedores {
	
	public static void main(String[] args) {
		
		FactoryProvedor provFact = new FactoryProvedor();
		
		// Confidencial
		Provedor provedor = provFact.getProvedor("design patterns");
		provedor.exibir();
		
		// Público
		provedor = provFact.getProvedor();
		provedor.exibir();
		
	}

}
