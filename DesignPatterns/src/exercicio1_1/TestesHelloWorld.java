package exercicio1_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */

public class TestesHelloWorld {
	
	public static void main(String[] args) {
		
		// Exercício 1.1: Hello World
		ConcreteHelloWorldFactory factory = new ConcreteHelloWorldFactory();
		HelloWorld helloWorld;
		
		if (Math.random() < 0.5) {
			helloWorld = factory.getHelloWorldSystem();
		} else {
			helloWorld = factory.getHelloWorldFile();
		}
		
		helloWorld.display();
		
	}

}
