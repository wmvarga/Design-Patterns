package exercicio7_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Duplicado extends TransformacaoTemplate {

	@Override
	String transforma(String s) {
		return s + s;
	}

}
