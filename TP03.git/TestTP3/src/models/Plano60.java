package models;

public class Plano60{

	protected double valorFixo = 10.50;
	
	
	public String valorTotalPagamento(String ponte) {
		ponte = "Você escolheu o plano de 1 hora de uso!" + "\nO valor total é: " +
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
