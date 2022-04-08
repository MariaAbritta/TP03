package models;
/**
 * Exibe com o valor fixo.
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */
public class Plano1440{
	
	protected double valorFixo = 110.75;
	
	/**
	 * Exibe o plano que o usu�rio escolheu e mostra o valor a ser pago
	 * @param ponte
	 * @return ponte
	 */
	public String valorTotalPagamento(String ponte) {
		ponte = "Voc� escolheu o plano de 24 horas de uso!" + "\nO valor total �: " +
				getValorFixo() + " reais." + "\nPagamento realizado!" + "\nObrigada por usar nosso app!";
		return ponte;
	}

	
	//Gets and sets
	public double getValorFixo() {
		return valorFixo;
	}


	public void setValorFixo(double valorFixo) {
		this.valorFixo = valorFixo;
	}
	
}
