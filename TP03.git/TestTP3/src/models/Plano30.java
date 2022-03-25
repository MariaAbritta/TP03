package models;

public class Plano30 implements IPlano{
		
	protected double valorFixo = 5.75;
		
		
	public Double valorTotalPagamento() {
		System.out.println("------------------------------");
		System.out.println("Você escolheu o plano de 30  minutos de uso!");
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
