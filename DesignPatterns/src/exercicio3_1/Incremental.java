package exercicio3_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Incremental {
	private static int count = 0;
	private int numero;

	private static Incremental primeiraInstancia = null;

	static Incremental getInstanceOff() {
		if (primeiraInstancia == null) {
			primeiraInstancia = new Incremental();

		}
		return primeiraInstancia;
	}

	public void incrementa() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental " + numero;
	}
}
