package exercicio1_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */

public class ConcreteHelloWorldFactory implements AbstractHelloWorldFactory {
	
	@Override
	public HelloWorld getHelloWorldSystem() {
		return new HelloWorldSystem();
		
	}
	
	@Override
	public HelloWorld getHelloWorldFile() {
		return new HelloWorldFile();
		
	}

}
