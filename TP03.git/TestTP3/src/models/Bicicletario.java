package models;

import java.util.Scanner;

public class Bicicletario {
	//Atributos
	private String localizacao;
	private int funcionamento;
	private int disponibilidadeBicicletas;
	
	public Bicicletario() {
		super();
	}
	
	public Bicicletario(String loc, int func, int dispoBikes) {
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

	public int getFuncionamento() {
		return funcionamento;
	}

	public void setFuncionamento(int funcionamento) {
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
	}
	
	public void buscarBicicletario() {
		
		int opcaoBike = 0;
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Buscar Bicicletario: ");
		System.out.println("Digite 1 para ver o Parque da Cidade Dona Sarah Kubitschek");
		System.out.println("Digite 2 para ver o Parque Ecologico");
		opcaoBike = resposta.nextInt();
		
		do {
			switch(opcaoBike){
				case 1:
						System.out.println("------------------------------\n");
						System.out.println("Parque da Cidade Dona Sarah Kubitschek:");
						System.out.println("Endereço: Srps - Brasilia, DF, 70297-400\n"
								+ "Coordenadas: 15° 48' 1.236\" S 47° 54' 28.081\" O\n"
								+ "Horarios: Atendimento 24 horas.\n");
						System.out.println("Numero de Bicicletas disponiveis: "+ getDisponibilidadeBicicletas()); //Temos que dividir entre 25 pro parque arah e 25 pro parque aguas
						System.out.println("Funcionamento:"); HoraFuncionamento(); //Usar o get
						System.out.println("------------------------------");
					break;
				case 2:
					System.out.println("------------------------------\n");
					System.out.println("Parque Ecologico");
					System.out.println("Endereço: Avenida Castanheiras – Centro.\n"
							+ "Situado atras da Residencia Oficial de Aguas Claras,\n"
							+ "entre as quadras 301, 104, 105 e 106 da cidade.\n"
							+ "Coordenadas:	15° 49' 58.36\" S 48° 1' 49.21\" O\n"
							+ "Horarios: Diariamente, das 06h as 22h\n");
					System.out.println("Numero de Bicicletas disponiveis: "+ getDisponibilidadeBicicletas());
					System.out.println("Funcionamento:"); HoraFuncionamento(); //Usar o get
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				default:
					System.out.println("Opcao invalida. Por favor, escolha uma\n"
							+ "opcao 1 ou 2, somente.\n");
			}
		}while (opcaoBike >= 3);
	}
	
	public void HoraFuncionamento() {
		Scanner resposta = new Scanner(System.in);
		int hora = 0;
		System.out.println("Qual horario voce deseja ir ao bicicletario?: ");
		hora = resposta.nextInt();
		switch(hora) {
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				System.out.println("Nesse horario estamos ativos! Fechamos as 21h.\n");
				break;
			case 21:
			case 22:
			case 23:
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Nesse horario estamos inativos! Abrimos as 6h.\n");
				break;
			default: 
				System.out.println("Hora inválida.");
				break;
		}
		this.funcionamento = hora;
	}

}

/*
 * Falta a gente fazer um array para mostrar quantas estão disponíveis
 * Utilizar os gets e sets
 * */
