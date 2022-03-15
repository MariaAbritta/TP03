package models;

import java.util.Random;
import java.util.Scanner;

public class Bicicleta {
	//atributos
	private String localizacao;
	private long IdBicicleta;
	private String tipo;
	int[][] IdBikes = new int[1][6];
	Random random = new Random();
	
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

	public long getIdBicicleta() {
		IdBicicleta = estoque();
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
		System.out.println("Digite 2 para ver as Bicicletas Eletricas.");
		System.out.println("Digite 3 para ver as Bicicletas Mountain Bike.");
		
		opcaoBike = resposta.nextInt();
		
		do {
			switch(opcaoBike){
				case 1:
					System.out.println("------------------------------");
					System.out.println("Bicicletas Urbanas:");
					System.out.println("Se voce pretende andar de bike pelas ruas da cidade, \n"
							+ "seja para uso como transporte ao trabalho, \n"
							+ "faculdade ou simplesmente para aqueles passeios nos parques, \n"
							+ "jardins e ciclovias, a escolha e uma bicicleta urbana.\n");
					System.out.println("Ativas: 25");
					System.out.println("Deseja alugar alguma? sim // nao");
					Scanner resposta2 = new Scanner(System.in);
					String opAluguelUrbana = "";
					opAluguelUrbana = resposta2.next();
					switch(opAluguelUrbana) {
						case "sim":
							System.out.println("Qual localizacao voce se encontra? ");
							//System.out.println(Bicicletario.getLocalizacao()); Puxar as localizações que temos bicicletarios e entregar o id da bike que ele quer
							//Criar um array das bikes Urbanas
							//Repetir com os outros 2 tipos de bike
						break;
						case "nao":
							System.out.println("OK!\n");
						break;
					}
					resposta2.close();
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				case 2:
					System.out.println("------------------------------");
					System.out.println("Bicicletas Eletricas:");
					System.out.println("Uma bicicleta eletrica e uma bicicleta comum equipada com \n"
							+ "um motor eletrico numa das rodas e uma bateria lithium de ultima geracao, \n"
							+ "ajudando nas deslocacoes pela cidade ou zonas  rurais, podendo eliminar \n"
							+ "qualquer tipo de esforco. \n");
					System.out.println("Ativas: 15");
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				case 3:
					System.out.println("------------------------------");
					System.out.println("Bicicletas Mountain Bike");
					System.out.println("Mountain bike e o esporte que coloca o ciclista na montanha \n"
							+ "e em qualquer lugar fora dela. Ou seja, e a modalidade mais versatil, \n"
							+ "pois, a MTB tem pecas e um design que permite que voce pedale \n"
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
		
		resposta.close();
	}
	
	public void listarBicicleta() {

		System.out.println("Localizacao: " + getLocalizacao());
		System.out.println(getIdBicicleta());
		System.out.println("ID da Bicicleta: " + getIdBicicleta());
		System.out.println("Tipo de Bicicleta: \n"+ getTipo());
	}

	public int estoque() {
		
		int id = 0; //nao sei como declarar essa variave para levar todos os numeros, ele ta retornando so o ultimo por ser int.
		
		//Definindo id para uma bike do array de 50.
		for(int i = 0; i < IdBikes.length; i++) {
			 for( int j = 0; j < IdBikes[i].length; j++) {
				 IdBikes[i][j] = random.nextInt(9);
	            }
        }
        
		System.out.println("ID da Bicicleta: ");
        for (int[] linha : IdBikes  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
                id = coluna;
            }
            System.out.println();
        }
        return id;
	}
}

/*
 * Usar os gets e sets
 * Fazer os arryas de cada tipo de bike e quantas vão ter 
 * Fazer a ponte com o bicicletario
 * */
