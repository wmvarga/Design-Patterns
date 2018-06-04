package exercicio4_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class TesteSomador {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
		
	}

}
