package models;

import java.util.Scanner;

public class Bicicletario {
	//Atributos
	private String localizacao;
	private String funcionamento;
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
				+ "Brasilia - Aguas Claras - Parque Ecologico";
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
		
		int opcaoBike = 0;
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Buscar Bicicletario: ");
		System.out.println("Digite 1 para ver o Parque da Cidade Dona Sarah Kubitschek");
		System.out.println("Digite 2 para ver o Parque Ecologico");
		opcaoBike = resposta.nextInt();
		
		do {
			switch(opcaoBike){
				case 1:
						System.out.println("------------------------------");
						System.out.println("Parque da Cidade Dona Sarah Kubitschek:");
						System.out.println("Endereço: Srps - Brasilia, DF, 70297-400\n"
								+ "Coordenadas: 15° 48' 1.236\" S 47° 54' 28.081\" O\n"
								+ "Horarios: Atendimento 24 horas.\n");
						System.out.println("------------------------------");
					break;
				case 2:
					System.out.println("------------------------------");
					System.out.println("Parque Ecologico");
					System.out.println("Endereço: Avenida Castanheiras – Centro.\n"
							+ "Situado atras da Residencia Oficial de Aguas Claras,\n"
							+ "entre as quadras 301, 104, 105 e 106 da cidade.\n"
							+ "Coordenadas:	15° 49' 58.36\" S 48° 1' 49.21\" O\n"
							+ "Horarios: Diariamente, das 06h as 22h\n");
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				default:
					System.out.println("Opcao invalida. Por favor, escolha uma\n"
							+ "opcao 1 ou 2, somente.\n");
			}
		}while (opcaoBike >= 3);
	}

}
