package models;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bicicleta {
	// atributos
	private Bicicletario localizacao;
	private long IdBicicleta;
	String[] BikesSarahUrb = new String [15];
	String[] BikesEcoUrb = new String [15];
	int[][] IdBikes = new int[1][6];

	Random random = new Random();
	Scanner resposta = new Scanner(System.in);

	public Bicicleta(Bicicletario loc, int ID) {
		this.localizacao = loc;
		this.IdBicicleta = ID;
	}

	public Bicicletario getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(Bicicletario localizacao) {
		this.localizacao = localizacao;
	}

	public long getIdBicicleta() {
		IdBicicleta = 10; 
		//= estoque();
		return IdBicicleta;
	}

	public void setIdBicicleta(int idBicicleta) {
		IdBicicleta = idBicicleta;
	}

	public boolean StatusFuncionamento(String text) {
		
		return false;
	}

	public boolean alugarBikessarah(String text) {
		// TODO Auto-generated method stub
		return false;
	}

	// Metodos
//	public String buscarBikeSarah(String buscado) {
//		buscado = "Ativas : " + BikesSarahUrb.length + "\nDeseja alugar alguma?\n";
//		return buscado;
//	}
//	
//	public boolean alugarBikessarah(boolean verificado) {
//		verificado = true;
//		int alugado = 0;
//		verificandoSarah(verificado, alugado, BikesSarahUrb, "alugada!");
//		if (verificandoSarah(verificado, alugado, BikesSarahUrb, "alugada!")) {
//			verificado = false;
//		}
//		return verificado;
//	}
//
//	public void listarBicicleta() {
//
//		System.out.println("Localizacao: " + getLocalizacao());
//		System.out.println("ID da Bicicleta: " + getIdBicicleta());
//	}
//
//	public int estoque() {
//		int id = 0; //nao sei como declarar essa variave para levar todos os numeros, ele ta retornando so o ultimo por ser int.
//		
//		//Definindo id para uma bike do array de 50.
//		for(int i = 0; i < IdBikes.length; i++) {
//			 for( int j = 0; j < IdBikes[i].length; j++) {
//				 IdBikes[i][j] = random.nextInt(9);
//	            }
//        }
//        
//		System.out.println("ID da Bicicleta: ");
//        for (int[] linha : IdBikes  ) {
//            for (int coluna : linha ) {
//                System.out.print(coluna + " ");
//                id = coluna;
//            }
//            System.out.println();
//        }
//        return id;
//	}
//	
//	public static boolean verificandoSarah (boolean verificado, int quantasQuer, String[] BikesSarahUrb, String verificando) {
//	    if(!verificaNuloSarah(BikesSarahUrb)) {
//	        System.out.println("Não existe mais bicicletas urbanas disponiveis.");
//	        System.out.println("Não existe mais bicicletas urbanas disponiveis.");
//	        verificado = true;
//	    }
//	    int j = 1;
//	    if(BikesSarahUrb.length >= quantasQuer){
//	        for (int i = 0; i < BikesSarahUrb.length; i++){
//	            if(BikesSarahUrb[i] == null){
//	                if(j > quantasQuer){
//	                    break;
//	                }
//	                BikesSarahUrb[i] = verificando;
//	                j++;
//	            }
//	        }
//	        verificado = false;
//	    }
//	    System.out.println(Arrays.toString(BikesSarahUrb));
//	    return verificado;
//	}
//	
//	public static boolean verificaNuloSarah(String[] BikesSarahUrb){
//    boolean nulo = false;
//	    for (String s: BikesSarahUrb) {
//	        if (s == null) {
//	            nulo = true;
//	            break;
//	        }
//	    }
//	    return nulo;
//	}
//	
//	public static void verificandoEco (int quantasQuer, String[] BikesEcoUrb, String verificando) {
//	    if(!verificaNuloEco(BikesEcoUrb)) {
//	        System.out.println("Não existe mais bicicletas urbanas disponiveis.");
//	        System.out.println("Não existe mais bicicletas urbanas disponiveis.");
//	        return;
//	    }
//	    int j = 1;
//	    if(BikesEcoUrb.length >= quantasQuer){
//	        for (int i = 0; i < BikesEcoUrb.length; i++){
//	            if(BikesEcoUrb[i] == null){
//	                if(j > quantasQuer){
//	                    break;
//	                }
//	                BikesEcoUrb[i] = verificando;
//	                j++;
//	            }
//	        }
//	    }
//	    System.out.println(Arrays.toString(BikesEcoUrb));
//	}
//	
//	public static boolean verificaNuloEco(String[] BikesEcoUrb){
//    boolean nulo = false;
//	    for (String s: BikesEcoUrb) {
//	        if (s == null) {
//	            nulo = true;
//	            break;
//	        }
//	    }
//	    return nulo;
//	}

}

