package exercicio5_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class TesteFacade {
	
	public static void main(String[] args) {
		
		IOFacade iof = new IOFacade();
		
		String[] texto = {"Primeira linha", "Segunda linha"};
		System.out.println("Gravando arquivo texto.");
		iof.gravarArquivoTexto("TesteTexto.txt", texto);
		System.out.println("Lendo arquivo texto.");
		iof.lerArquivoBinario("TesteTexto.txt");
		
		byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println("Gravando arquivo binário.");
		iof.gravarArquivoBinario("TesteBin", byteArray);
		System.out.println("Lendo arquivo binário.");
		iof.lerArquivoBinario("TesteBin");
		
		Cliente cliente = new Cliente();
		cliente.setNome("ClienteTeste");
		System.out.println("Gravando objeto.");
		iof.gravarObjeto("TesteObjeto", cliente);
		System.out.println("Lendo objeto.");
		iof.lerObjeto("TesteObjeto");
		
	}
}
