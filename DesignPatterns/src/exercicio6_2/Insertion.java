package exercicio6_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Insertion implements Sort {

	@Override
	public int[] sort(int v[]) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
			x = v[j];
			for (i = j - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			v[i + 1] = x;
		}
		return v;
	}

}
