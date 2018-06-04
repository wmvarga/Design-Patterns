package exercicio2_3;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class TesteLog {
	
	public static void main(String[] args) {
		
		// "Contando até 10"
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			numeros[i] = i + 1;
		}
		
		LogFactory logfact = new LogFactory();
		
		Log log = logfact.getLog("arquivo");
		log.efetuar(numeros);
		
		log = logfact.getLog("console");
		log.efetuar(numeros);
		
	}

}
