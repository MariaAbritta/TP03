package models;

public class Plano1440 implements IPlano{
	
	protected double valorFixo = 110.75;
	
	
	public Double valorTotalPagamento() {
		System.out.println("------------------------------");
		System.out.println("Você escolheu o plano de 24 horas de uso!");
		System.out.println("O valor total é: "+ valorFixo);
		System.out.println("------------------------------");
		return valorFixo;
	}

	
	//Gets and sets
	public double getValorFixo() {
		return valorFixo;
	}


	public void setValorFixo(double valorFixo) {
		this.valorFixo = valorFixo;
	}
	
}
