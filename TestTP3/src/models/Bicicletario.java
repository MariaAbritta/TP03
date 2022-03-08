package models;

public class Bicicletario {
	//Atributos
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

	//Gets and sets
	public String getLocalizacao() {
		localizacao = "Brasilia";
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public  String getFuncionamento() {
		funcionamento = "Ativo";
		return funcionamento;
	}

	public void setFuncionamento(String funcionamento) {
		this.funcionamento = funcionamento;
	}

	public int getDisponibilidadeBicicletas() {
		disponibilidadeBicicletas = 50;
		return disponibilidadeBicicletas;
	}

	public void setDisponibilidadeBicicletas(int disponibilidadeBicicletas) {
		this.disponibilidadeBicicletas = disponibilidadeBicicletas;
	}
	
	//Metodos
	public void listarBicicletario() {
		System.out.println("Localização: \n" + getLocalizacao());
		System.out.println("Funcionamento: \n" + getFuncionamento());
		System.out.println("Numero de Bicicletas disponiveis: "+ getDisponibilidadeBicicletas());
	}
	
	public void buscarBicicletario() {
		System.out.println("Buscar bicicletario");
	}

}
