package models;

public class Plano60 implements IPlano{

	protected double valorFixo = 10.50;
	protected int minutos = 0;
	
	
	public Double valorTotalPagamento() {
		return 10.0;
	}

	//Gets and sets
	public double getValorFixo() {
		return valorFixo;
	}


	public void setValorFixo(double valorFixo) {
		this.valorFixo = valorFixo;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	

}
