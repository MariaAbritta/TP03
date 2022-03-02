
public class Viagem {
	
	private double preçoMinuto;
	private String bicicleta = "";
	private String avaliacao = "";
	private String lugarSaida = "";
	private String lugarChegada = "";
	
	public Viagem(double pM, String b, String a, String lS, String lC) {
		preçoMinuto = pM;
		bicicleta = b;
		avaliacao = a;
		lugarSaida = lS;
		lugarChegada = lC;
	}
	
	public double getPreçoMinuto() {
		return preçoMinuto;
	}

	public void setPreçoMinuto(double preçoMinuto) {
		this.preçoMinuto = preçoMinuto;
	}

	public String getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(String bicicleta) {
		this.bicicleta = bicicleta;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getLugarSaida() {
		return lugarSaida;
	}

	public void setLugarSaida(String lugarSaida) {
		this.lugarSaida = lugarSaida;
	}

	public String getLugarChegada() {
		return lugarChegada;
	}

	public void setLugarChegada(String lugarChegada) {
		this.lugarChegada = lugarChegada;
	}
}
