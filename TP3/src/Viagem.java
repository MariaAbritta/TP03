
public class Viagem {
	
	private double pre�oMinuto;
	private String bicicleta = "";
	private String avaliacao = "";
	private String lugarSaida = "";
	private String lugarChegada = "";
	
	public Viagem(double pM, String b, String a, String lS, String lC) {
		pre�oMinuto = pM;
		bicicleta = b;
		avaliacao = a;
		lugarSaida = lS;
		lugarChegada = lC;
	}
	
	public double getPre�oMinuto() {
		return pre�oMinuto;
	}

	public void setPre�oMinuto(double pre�oMinuto) {
		this.pre�oMinuto = pre�oMinuto;
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
