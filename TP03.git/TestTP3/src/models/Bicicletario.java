package models;

import java.util.Scanner;
import java.util.Random;

public class Bicicletario {
	//Atributos
	private String localizacao;
	private String funcionamento;
	private int horarioCliente;
	private int disponibilidadeBicicletas;
	
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
		localizacao = "Brasilia - Asa Sul - Parque da Cidade Dona Sarah Kubitschek\n"
				+ "Brasilia - Aguas Claras - Parque Ecologico\n";
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
	
	//Metodos
	public void listarBicicletario() {
		System.out.println("LocalizaÃ§Ã£o: \n" + getLocalizacao());
	}
	
	public void buscarBicicletario() {
		
		int opcaoBike = 0;
		int numBikes = 0;
		Scanner resposta = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Buscar Bicicletario: ");
		System.out.println("Digite 1 para ver o Parque da Cidade Dona Sarah Kubitschek");
		System.out.println("Digite 2 para ver o Parque Ecologico");
		opcaoBike = resposta.nextInt();
		
		do {
			switch(opcaoBike){
				case 1:
						System.out.println("------------------------------\n");
						System.out.println("Parque da Cidade Dona Sarah Kubitschek:");
						System.out.println("EndereÃ§o: Srps - Brasilia, DF, 70297-400\n"
								+ "Coordenadas: 15Â° 48' 1.236\" S 47Â° 54' 28.081\" O\n"
								+ "Horarios: Atendimento 24 horas.\n"
						);
						numBikes = random.nextInt(20);
						setDisponibilidadeBicicletas(numBikes);
						System.out.println("Numero de Bicicletas disponiveis: "+ getDisponibilidadeBicicletas());
						System.out.println("Funcionamento: Das 6h as 21h");
						StatusFuncionamento();
						System.out.println("Status: " + getFuncionamento());
						System.out.println("------------------------------");
					break;
				case 2:
					System.out.println("------------------------------\n");
					System.out.println("Parque Ecologico");
					System.out.println("EndereÃ§o: Avenida Castanheiras â€“ Centro.\n"
							+ "Situado atras da Residencia Oficial de Aguas Claras,\n"
							+ "entre as quadras 301, 104, 105 e 106 da cidade.\n"
							+ "Coordenadas:	15Â° 49' 58.36\" S 48Â° 1' 49.21\" O\n"
							+ "Horarios: Diariamente, das 06h as 22h\n"
					);
					numBikes = random.nextInt(20);
					setDisponibilidadeBicicletas(numBikes);
					System.out.println("Numero de Bicicletas disponiveis: "+ getDisponibilidadeBicicletas());
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
		
		if(hora>=6 || hora<21){
			setFuncionamento("Ativo");
		}else if(hora<6 || hora>21){
			setFuncionamento("Inativo");
		}else{
			setFuncionamento("Invalido horario nao encontrado");
		}
		return funcionamento;
	}

}

