package models;

public class Plano30{
		
	protected double valorFixo = 5.75;
		
		
	public String valorTotalPagamento(String ponte) {
		ponte = "Você escolheu o plano de 30  minutos de uso!" + "\nO valor total é: " +
				getValorFixo() + " reais.";
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
