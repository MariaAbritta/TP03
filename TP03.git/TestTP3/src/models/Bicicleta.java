package models;

import java.util.Random;
import java.util.Scanner;

public class Bicicleta {
	//atributos
	private String localizacao;
	private long IdBicicleta;
	private String tipo;
	int[][] IdBikes = new int[6][0];
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
		System.out.println("Digite 2 para ver as Bicicletas El�tricas.");
		System.out.println("Digite 3 para ver as Bicicletas Mountain Bike.");
		
		opcaoBike = resposta.nextInt();
		
		do {
			switch(opcaoBike){
				case 1:
					System.out.println("------------------------------");
					System.out.println("Bicicletas Urbanas:");
					System.out.println("Se voc� pretende andar de bike pelas ruas da cidade, \n"
							+ "seja para uso como transporte ao trabalho, \n"
							+ "faculdade ou simplesmente para aqueles passeios nos parques, \n"
							+ "jardins e ciclovias, a escolha � uma bicicleta urbana.\n");
					System.out.println("Ativas: 25");
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				case 2:
					System.out.println("------------------------------");
					System.out.println("Bicicletas El�tricas:");
					System.out.println("Uma bicicleta el�trica � uma bicicleta comum equipada com \n"
							+ "um motor el�trico numa das rodas e uma bateria lithium de �ltima gera��o, \n"
							+ "ajudando nas desloca��es pela cidade ou zonas  rurais, podendo eliminar \n"
							+ "qualquer tipo de esfor�o. \n");
					System.out.println("Ativas: 15");
					//Fazer as ativas e inativas
					System.out.println("------------------------------");
					break;
				case 3:
					System.out.println("------------------------------");
					System.out.println("Bicicletas Mountain Bike");
					System.out.println("Mountain bike � o esporte que coloca o ciclista na montanha \n"
							+ "e em qualquer lugar fora dela. Ou seja, � a modalidade mais vers�til, \n"
							+ "pois, a MTB tem pe�as e um design que permite que voc� pedale \n"
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
		System.out.println("Localiza��o: " + getLocalizacao());
		System.out.println("ID da Bicicleta: " + getIdBicicleta());
		System.out.println("Tipo de Bicicleta: \n"+ getTipo());
	}
	
	public void estoque(String[] args) {
		
		int identificador = 0;
		//Definindo id para uma bike do array de 50.
		
		for(int i = 0; i < IdBikes.length; i++) {
			 for( int j = 0; j < IdBikes[i].length; j++) {
				 IdBikes[i][j] = random.nextInt(9);
	            }
        }
        
		System.out.println("Matriz: ");
        for (int[] linha : IdBikes  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
	}

}
