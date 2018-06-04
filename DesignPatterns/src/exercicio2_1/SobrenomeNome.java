package exercicio2_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class SobrenomeNome extends Nome {
	
	public SobrenomeNome(String string) {
		String[] partes = string.split(", ");
		super.setNome(partes[1]);
		super.setSobrenome(partes[0]);
		
	}


	@Override
	public void exibir() {
		System.out.println(super.getSobrenome() + ", " + super.getNome());
		
	}
	
	

}
