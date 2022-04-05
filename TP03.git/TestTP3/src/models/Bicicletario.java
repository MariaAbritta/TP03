package models;

import java.util.Scanner;
import java.util.Random;
import models.Bicicleta;

public class Bicicletario {
	//Atributos
	private String localizacao;
	private String funcionamento;
	private int horarioCliente;
	private int disponibilidadeBicicletas;
	private int disponibilidadeBicicletasEco;
	Bicicleta bicicleta = new Bicicleta();

	
	public Bicicletario() {
		super();
	}
	
	public Bicicletario(String loc, String func, int dispoBikes) {
		this.localizacao = loc;
		this.funcionamento = func;
		this.disponibilidadeBicicletas = dispoBikes;
	}

	//Gets and sets
	public String getLocalizacao() {
		localizacao = "1 - Brasilia - Asa Sul - Parque da Cidade Dona Sarah Kubitschek\n"
				+ "2 - Brasilia - Aguas Claras - Parque Ecologico de Aguas Claras\n";
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

	public int getDisponibilidadeBicicletaSarah() {
		return disponibilidadeBicicletas;
	}

	public int setDisponibilidadeBicicletasSarah(int disponibilidadeBicicletasEco) {
		this.disponibilidadeBicicletas = disponibilidadeBicicletas;
		disponibilidadeBicicletas = bicicleta.BikesSarahUrb.length;
		return disponibilidadeBicicletas;
	}
	
	public int getDisponibilidadeBicicletaEco() {
		return disponibilidadeBicicletasEco;
	}

	public int setDisponibilidadeBicicletasEco(int disponibilidadeBicicletasEco) {
		this.disponibilidadeBicicletasEco = disponibilidadeBicicletasEco;
		disponibilidadeBicicletasEco = bicicleta.BikesEcoUrb.length;
		return disponibilidadeBicicletas;
	}
	
	//Metodos
	public void listarBicicletario() {
		System.out.println("Localizacao: \n" + getLocalizacao());
	}
	
	public String buscarBicicletario(String loc) {
		loc = "Qual bicicletario deseja buscar bicicletas?";
		return loc;
	}
	
	public void BuscarBicicletario() {
		
		int opcaoBike = 0;
		int numBikes = 0;
		Scanner resposta = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Buscar Bicicletario: ");
		System.out.println("Digite 1 para ver o Parque da Cidade Dona Sarah Kubitschek");
		System.out.println("Digite 2 para ver o Parque Ecologico de Aguas Claras");
		opcaoBike = resposta.nextInt();
		
		do {
			switch(opcaoBike){
				case 1:
						System.out.println("------------------------------\n");
						System.out.println("Parque da Cidade Dona Sarah Kubitschek:");
						System.out.println("Endereco: Srps - Brasilia, DF, 70297-400\n"
								+ "Horarios: Atendimento 24 horas.\n"
						);
						numBikes = random.nextInt(20);
						setDisponibilidadeBicicletasSarah(numBikes);
						System.out.println("Numero de Bicicletas disponiveis: "+ getDisponibilidadeBicicletaSarah());
						System.out.println("Funcionamento: Das 6h as 21h");
						StatusFuncionamento();
						System.out.println("Status no horario escolhido: " + getFuncionamento());
						System.out.println("------------------------------");
					break;
				case 2:
					System.out.println("------------------------------\n");
					System.out.println("Parque Ecologico de Aguas Claras");
					System.out.println("Endereco: Avenida Castanheiras.\n"
							+ "Situado atras da Residencia Oficial de Aguas Claras,\n"
							+ "entre as quadras 301, 104, 105 e 106 da cidade.\n"
							+ "Horarios: Diariamente, das 06h as 22h\n"
					);
					numBikes = random.nextInt(20);
					setDisponibilidadeBicicletasEco(numBikes);
					System.out.println("Numero de Bicicletas disponiveis: "+ getDisponibilidadeBicicletaEco());
					System.out.println("Funcionamento: Das 6h as 21h");
					StatusFuncionamento();
					System.out.println("Status: " + getFuncionamento());
					System.out.println("------------------------------");
					break;
				default:
					System.out.println("Opcao invalida. Por favor, escolha uma\n"
							+ "opcao 1 ou 2, somente.\n");
			}
		}while (opcaoBike >= 3);
	}
	
	public String StatusFuncionamento() {
		Scanner resposta = new Scanner(System.in);
		int hora = 0;
		System.out.println("Qual horario voce deseja ir ao bicicletario?: ");
		hora = resposta.nextInt();
		
		if(hora>=6 || hora<=21){
			setFuncionamento("Ativo");
		}else if(hora<6 || hora>21){
			setFuncionamento("Inativo");
		}else{
			setFuncionamento("Invalido horario nao encontrado");
		}
		return funcionamento;
	}

}

