package models;

public class Bicicletario {
	private String localizacao;
	private String funcionamento;
	private int disponibilidadeBicicletas;
	
	public Bicicletario() {
		super();
	}
	
	public Bicicletario(String loc, String func, int dispoBikes) {
		localizacao = loc;
		funcionamento = func;
		disponibilidadeBicicletas = dispoBikes;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getFuncionamento() {
		return funcionamento;
	}

	public void setFuncionamento(String funcionamento) {
		this.funcionamento = funcionamento;
	}

	public int getDisponibilidadeBicicletas() {
		return disponibilidadeBicicletas;
	}

	public void setDisponibilidadeBicicletas(int disponibilidadeBicicletas) {
		this.disponibilidadeBicicletas = disponibilidadeBicicletas;
	}
}
