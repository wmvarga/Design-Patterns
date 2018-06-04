package exercicio6_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Bubble implements Sort {

	@Override
	public int[] sort(int v[]) {
		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j + 1];
					v[j + 1] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}

}
