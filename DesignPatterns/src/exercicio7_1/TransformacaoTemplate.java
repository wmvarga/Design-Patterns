package exercicio7_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


import java.util.Scanner;

public abstract class TransformacaoTemplate {
	
	public final void processo() {
		String s = lerString();
		String st = transforma(s);
		printa(st);
	}
	
	abstract String transforma(String s);
	
	@SuppressWarnings("resource")
	final String lerString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira a string: ");
		String s = scanner.next();
		return s;
	}
	
	final void printa(String st) {
		System.out.print(st + "\n");
	}
	

}
