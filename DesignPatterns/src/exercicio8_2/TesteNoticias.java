package exercicio8_2;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class TesteNoticias {
	
	public static void main(String[] args) {
		
		NoticiarioAssina not = new NoticiarioAssina();
		ConsomeNoticia pub = new Publicador();
		Agregador agrTop = new AgregadorTopico("Programa��o");
		Agregador agrMes = new AgregadorMes();
		
		not.adicionaConsumidor(pub);
		not.adicionaConsumidor(agrTop);
		not.adicionaConsumidor(agrMes);
		
		agrTop.adicionaConsumidor(pub);
		agrMes.adicionaConsumidor(pub);
		
		not.notificaNoticia("Universit�rio vai votar em um candidato!", 3, 6, "Pol�tica");
		not.notificaNoticia("Universit�rio � visto programando em Java!", 6, 6, "Programa��o");
		not.notificaNoticia("Ocorrer� um Hackaton em breve!", 21, 6, "Programa��o");
		not.notificaNoticia("Imperd�vel! Jovem aprende a programar em duas linguagens de programa��o!", 2, 7, "Programa��o");
		not.notificaNoticia("Not�cia urgente de programa��o!", 4, 7, "Programa��o");
		not.notificaNoticia("Not�cia nem t�o urgente de programa��o!", 5, 7, "Programa��o");
		not.notificaNoticia("Not�cia sobre programa��o!", 7, 7, "Programa��o");
		not.notificaNoticia("Amontoado de informa��es!", 13, 7, "Programa��o");
		not.notificaNoticia("Nova linguagem de programa��o!", 21, 7, "Programa��o");
		not.notificaNoticia("App lan�ado!", 28, 7, "Programa��o");
		not.notificaNoticia("Padr�o de projeto revolucion�rio!", 15, 8, "Programa��o");
		
		/*T�pico: Pol�tica, data: 3/6
		Universit�rio vai votar em um candidato!

		T�pico: Programa��o, data: 6/6
		Universit�rio � visto programando em Java!

		T�pico: Programa��o, data: 21/6
		Ocorrer� um Hackaton em breve!

		T�pico: Programa��o, data: 2/7
		Imperd�vel! Jovem aprende a programar em duas linguagens de programa��o!

		T�pico: Mensal, data: 0/7
		Agregado do m�s: Universit�rio vai votar em um candidato!
		Universit�rio � visto programando em Java!
		Ocorrer� um Hackaton em breve!


		T�pico: Programa��o, data: 4/7
		Not�cia urgente de programa��o!

		T�pico: Programa��o, data: 5/7
		Not�cia nem t�o urgente de programa��o!

		T�pico: Programa��o, data: 7/7
		Not�cia sobre programa��o!

		T�pico: Programa��o, data: 13/7
		Amontoado de informa��es!

		T�pico: Programa��o, data: 21/7
		Nova linguagem de programa��o!

		T�pico: Programa��o, data: 28/7
		App lan�ado!

		T�pico: Programa��o, data: 15/8
		Padr�o de projeto revolucion�rio!

		T�pico: Programa��o, data: 15/8
		Agregado de Programa��o: Universit�rio � visto programando em Java!
		Ocorrer� um Hackaton em breve!
		Imperd�vel! Jovem aprende a programar em duas linguagens de programa��o!
		Not�cia urgente de programa��o!
		Not�cia nem t�o urgente de programa��o!
		Not�cia sobre programa��o!
		Amontoado de informa��es!
		Nova linguagem de programa��o!
		App lan�ado!
		Padr�o de projeto revolucion�rio!


		T�pico: Mensal, data: 0/8
		Agregado do m�s: Not�cia urgente de programa��o!
		Not�cia nem t�o urgente de programa��o!
		Not�cia sobre programa��o!
		Amontoado de informa��es!
		Nova linguagem de programa��o!
		App lan�ado!*/
		
	}

}
