package models;

public class Plano1440{
	
	protected double valorFixo = 110.75;
	
	
	public String valorTotalPagamento(String ponte) {
		ponte = "Você escolheu o plano de 24 horas de uso!" + "\nO valor total é: " +
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
