package models;

public class Viagem {
	private Pagamento pagamento;
	private Bicicleta bicicleta;
	private String avaliacao;
	private String lugarSaida;
	private String lugarChegada;
	
	public Viagem() {
		super();
	}
	
	public Viagem(Pagamento p, Bicicleta b, String a, String lS, String lC) {
		bicicleta = b;
		avaliacao = a;
		lugarSaida = lS;
		lugarChegada = lC;
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
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
