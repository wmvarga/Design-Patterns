package exercicio8_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Publicador implements ConsomeNoticia {

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("T�pico: " + topico + ", data: " + dia + "/" + mes);
		System.out.println(textoNoticia + "\n");
	}

}
