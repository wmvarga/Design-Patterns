package exercicio2_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class TesteNomes {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		FactoryNome factNS = new FactoryNomeSobrenome();
		FactoryNome factSN = new FactorySobrenomeNome();
		
		String scott = "McNealy, Scott";
		String james = "James Gosling";
		String patrick = "Naughton, Patrick";
		
		Nome nomeScott = factSN.getNome(scott);
		Nome nomeJames = factNS.getNome(james);
		Nome nomePatrick = factSN.getNome(patrick);
		
		factNS.listarNomes();
		factSN.listarNomes();
		
	}
}
