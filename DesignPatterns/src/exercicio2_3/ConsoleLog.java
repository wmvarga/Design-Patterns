package exercicio2_3;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class ConsoleLog extends Log {
	
	@Override
	void efetuar(int[] numeros) {
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
