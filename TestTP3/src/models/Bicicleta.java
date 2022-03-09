package models;

import java.util.Scanner;

public class Bicicleta {
	//atributos
	private String localizacao;
	private int IdBicicleta;
	private String tipo;
	
	public Bicicleta() {
		super();
	}
	
	public Bicicleta(String loc, int ID, String type) {
		this.localizacao = loc;
		this.IdBicicleta = ID;
		this.tipo = type;
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
	public void buscarBicicleta() {
		
		int opcaoBike = 0;
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Busque uma bicicleta: ");
		System.out.println("Digite 1 para ver as Bicicletas Urbanas.");
		System.out.println("Digite 2 para ver as Bicicletas Elétricas.");
		System.out.println("Digite 3 para ver as Bicicletas Mountain Bike.");
		
		opcaoBike = resposta.nextInt();
		
		do {
			switch(opcaoBike){
				case 1:
					System.out.println("------------------------------");
					System.out.println("Bicicletas Urbanas:");
					System.out.println("Se você pretende andar de bike pelas ruas da cidade, \n"
							+ "seja para uso como transporte ao trabalho, \n"
							+ "faculdade ou simplesmente para aqueles passeios nos parques, \n"
							+ "jardins e ciclovias, a escolha e uma bicicleta urbana.\n");
					System.out.println("Ativas: 25");
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				case 2:
					System.out.println("------------------------------");
					System.out.println("Bicicletas Eletricas:");
					System.out.println("Uma bicicleta eletrica é uma bicicleta comum equipada com \n"
							+ "um motor eletrico numa das rodas e uma bateria lithium de ultima geracao, \n"
							+ "ajudando nas deslocacoes pela cidade ou zonas  rurais, podendo eliminar \n"
							+ "qualquer tipo de esforço. \n");
					System.out.println("Ativas: 15");
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				case 3:
					System.out.println("------------------------------");
					System.out.println("Bicicletas Mountain Bike");
					System.out.println("Mountain bike e o esporte que coloca o ciclista na montanha \n"
							+ "e em qualquer lugar fora dela. Ou seja, e a modalidade mais versatil, \n"
							+ "pois, a MTB tem peças e um design que permite que voce pedale \n"
							+ "por qualquer terreno, sendo uma bicileta mais leve. \n");
					System.out.println("Ativas: 10");
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				default:
					System.out.println("Opcao invalida. Por favor, escolha uma\n"
							+ "opcao de 1 a 3, somente.\n");
					break;
			}
		}while (opcaoBike >= 4);
		
		
	}
	
	public void listarBicicleta() {
		System.out.println("Localização: " + getLocalizacao());
		System.out.println("ID da Bicicleta: " + getIdBicicleta());
		System.out.println("Tipo de Bicicleta: \n"+ getTipo());
	}
	
	

}
