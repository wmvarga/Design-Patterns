package exercicio9_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Slot1Real implements SlotChain {

	private SlotChain nextChain;

	@Override
	public void setNextChain(SlotChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calcula(Moeda moeda, Produto produto) {

		if (moeda.getValor() == 1.00) {
			if (produto.getValorFaltante() - 1.00 > 0) {
				produto.setValorFaltante(produto.getValorFaltante() - 1.00);
				System.out.println("Moeda de R$" + moeda.getValor() + " inserida." + " Cr�ditos faltantes: R$" + produto.getValorFaltante());
			} else {
				produto.setValorFaltante(produto.getValorFaltante() - 1.00);
				System.out.println(produto.getNome() + " entregue. Troco: R$" + produto.getValorFaltante() * -1);
			}
			
			
		} else {
			nextChain.calcula(moeda, produto);
		}

	}

}
