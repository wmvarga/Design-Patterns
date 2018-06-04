package exercicio9_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public interface HandlerChain {
	
	void setNextChain(HandlerChain nextChain);
	void handleRequest(int requisicao);

}
