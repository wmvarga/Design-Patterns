package exercicio2_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class FactoryProvedor {
	
	public Provedor getProvedor(String senha) {
		if (senha.equals("design patterns")) {
			return new ProvedorConfidencial();
		}
		// Se a senha for incorreta, retorna o público
		return new ProvedorPublico();
	}
	
	public Provedor getProvedor() {
		return new ProvedorPublico();
	}

}
