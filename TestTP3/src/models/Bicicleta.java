package models;

public class Bicicleta {
	private Bicicletario localizacao;
	private int IdBicicleta;
	private String tipo;
	
	public Bicicleta() {
		super();
	}
	
	public Bicicleta(Bicicletario loc, int ID, String type) {
		localizacao = loc;
		IdBicicleta = ID;
		tipo = type;
	}
	
	public Bicicletario getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Bicicletario localizacao) {
		this.localizacao = localizacao;
	}

	public int getIdBicicleta() {
		return IdBicicleta;
	}

	public void setIdBicicleta(int idBicicleta) {
		IdBicicleta = idBicicleta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
