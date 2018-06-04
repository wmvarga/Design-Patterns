package exercicio7_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Invertido extends TransformacaoTemplate {

	@Override
	String transforma(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}