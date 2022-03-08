package models;

public class Bicicleta {
	//atributos
	private String localizacao;
	private int IdBicicleta;
	private String tipo;
	
	public Bicicleta() {
		super();
	}
	
	public Bicicleta(String loc, int ID, String type) {
		localizacao = loc;
		IdBicicleta = ID;
		tipo = type;
	}
	
	public  String  getLocalizacao() {
		Bicicletario bicicletario = new Bicicletario();
		localizacao = bicicletario.getLocalizacao();
		
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getIdBicicleta() {
		IdBicicleta = 897458935;
		return IdBicicleta;
	}

	public void setIdBicicleta(int idBicicleta) {
		IdBicicleta = idBicicleta;
	}

	public String getTipo() {
		tipo = "Montanha";
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Metodos
	public void listarBicicleta() {
		System.out.println("Localização: " + getLocalizacao());
		System.out.println("ID da Bicicleta: " + getIdBicicleta());
		System.out.println("Tipo de Bicicleta: "+ getTipo());
	}
	
	public void buscarBicicleta() {
		System.out.println("Busque sua bicicleta aqui");
	}

}
