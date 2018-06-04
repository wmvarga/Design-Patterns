package exercicio9_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public interface SlotChain {
	
	void setNextChain(SlotChain nextChain);
	void calcula(Moeda moeda, Produto produto);

}
