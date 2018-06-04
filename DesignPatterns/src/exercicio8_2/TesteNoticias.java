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
		Agregador agrTop = new AgregadorTopico("Programação");
		Agregador agrMes = new AgregadorMes();
		
		not.adicionaConsumidor(pub);
		not.adicionaConsumidor(agrTop);
		not.adicionaConsumidor(agrMes);
		
		agrTop.adicionaConsumidor(pub);
		agrMes.adicionaConsumidor(pub);
		
		not.notificaNoticia("Universitário vai votar em um candidato!", 3, 6, "Política");
		not.notificaNoticia("Universitário é visto programando em Java!", 6, 6, "Programação");
		not.notificaNoticia("Ocorrerá um Hackaton em breve!", 21, 6, "Programação");
		not.notificaNoticia("Imperdível! Jovem aprende a programar em duas linguagens de programação!", 2, 7, "Programação");
		not.notificaNoticia("Notícia urgente de programação!", 4, 7, "Programação");
		not.notificaNoticia("Notícia nem tão urgente de programação!", 5, 7, "Programação");
		not.notificaNoticia("Notícia sobre programação!", 7, 7, "Programação");
		not.notificaNoticia("Amontoado de informações!", 13, 7, "Programação");
		not.notificaNoticia("Nova linguagem de programação!", 21, 7, "Programação");
		not.notificaNoticia("App lançado!", 28, 7, "Programação");
		not.notificaNoticia("Padrão de projeto revolucionário!", 15, 8, "Programação");
		
		/*Tópico: Política, data: 3/6
		Universitário vai votar em um candidato!

		Tópico: Programação, data: 6/6
		Universitário é visto programando em Java!

		Tópico: Programação, data: 21/6
		Ocorrerá um Hackaton em breve!

		Tópico: Programação, data: 2/7
		Imperdível! Jovem aprende a programar em duas linguagens de programação!

		Tópico: Mensal, data: 0/7
		Agregado do mês: Universitário vai votar em um candidato!
		Universitário é visto programando em Java!
		Ocorrerá um Hackaton em breve!


		Tópico: Programação, data: 4/7
		Notícia urgente de programação!

		Tópico: Programação, data: 5/7
		Notícia nem tão urgente de programação!

		Tópico: Programação, data: 7/7
		Notícia sobre programação!

		Tópico: Programação, data: 13/7
		Amontoado de informações!

		Tópico: Programação, data: 21/7
		Nova linguagem de programação!

		Tópico: Programação, data: 28/7
		App lançado!

		Tópico: Programação, data: 15/8
		Padrão de projeto revolucionário!

		Tópico: Programação, data: 15/8
		Agregado de Programação: Universitário é visto programando em Java!
		Ocorrerá um Hackaton em breve!
		Imperdível! Jovem aprende a programar em duas linguagens de programação!
		Notícia urgente de programação!
		Notícia nem tão urgente de programação!
		Notícia sobre programação!
		Amontoado de informações!
		Nova linguagem de programação!
		App lançado!
		Padrão de projeto revolucionário!


		Tópico: Mensal, data: 0/8
		Agregado do mês: Notícia urgente de programação!
		Notícia nem tão urgente de programação!
		Notícia sobre programação!
		Amontoado de informações!
		Nova linguagem de programação!
		App lançado!*/
		
	}

}
