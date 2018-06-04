package exercicio8_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


import java.util.ArrayList;
import java.util.List;

public abstract class Agregador implements ConsomeNoticia {
	
	protected List<ConsomeNoticia> assinantes = new ArrayList<>();
	
	public void adicionaConsumidor(ConsomeNoticia assinante) {
		this.assinantes.add(assinante);
	}
	
	public void removeConsumidor(ConsomeNoticia assinante) {
		this.assinantes.remove(assinante);
	}
	
}
