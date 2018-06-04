package exercicio9_1;

/**
 * 
 * @author 81612389 - William Morone Varga
 *
 */


public class Slot5Cent implements SlotChain {

	private SlotChain nextChain;

	@Override
	public void setNextChain(SlotChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calcula(Moeda moeda, Produto produto) {

		if (moeda.getValor() == 0.05) {
			if (produto.getValorFaltante() - 0.05 > 0) {
				produto.setValorFaltante(produto.getValorFaltante() - 0.05);
				System.out.println("Moeda de R$" + moeda.getValor() + " inserida." + " Cr�ditos faltantes: R$" + produto.getValorFaltante());
			} else {
				produto.setValorFaltante(produto.getValorFaltante() - 0.05);
				System.out.println(produto.getNome() + " entregue. Troco: R$" + produto.getValorFaltante() * -1);
			}
			
			
		} else {
			nextChain.calcula(moeda, produto);
		}

	}

}
