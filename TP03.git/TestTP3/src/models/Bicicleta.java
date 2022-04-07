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

	public long getIdBicicletaSarah() {
		IdBicicleta = estoque();
		return IdBicicleta;
	}
	
	public long getIdBicicletaEco() {
		IdBicicleta = estoque();
		return IdBicicleta;
	}

	public void setIdBicicletaSarah(int idBicicleta) {
		IdBicicleta = idBicicleta;
	}
	
	public void setIdBicicletaEco(int idBicicleta) {
		IdBicicleta = idBicicleta;
	}

	public boolean StatusFuncionamento(String text) {
		
		return false;
	}


	// Metodos
	/*public String alugarBikessarah(String resposta) {
		boolean verificado = true;
		int alugado = 0;
		verificandoSarah(verificado, alugado, BikesSarahUrb, "alugada!");
		if (verificandoSarah(verificado, alugado, BikesSarahUrb, "alugada!")) {
			verificado = false;
		}
		resposta = listarBicicleta(resposta);
		return resposta;
	}*/

	public String listarBicicletasSarah(String resposta) {
		resposta = "Você alugou uma bicicleta no Parque da Cidade Dona Sarah Kubitschek"+ "\nID da Bicicleta: " + getIdBicicletaSarah();
		return resposta;
	}
	
	public String listarBicicletasEco(String resposta) {
		resposta = "Você alugou uma bicicleta no Parque Ecologico de Aguas Claras"+ "\nID da Bicicleta: " + getIdBicicletaSarah();
		return resposta;
	}

	public int estoque() {
		int id = 0; //nao sei como declarar essa variave para levar todos os numeros, ele ta retornando so o ultimo por ser int.
		int id2 = 0; 
		int id3 = 0; 
		int id4 = 0; 
		int id5 = 0; 
		int id6 = 0; 
		id = random.nextInt(10000);
		id2 = random.nextInt(10000);
		id3 = random.nextInt(10000);
		id4 = random.nextInt(10000);
		id5 = random.nextInt(10000);
		id6 = random.nextInt(10000);
		
		int idtotal = (id + id2 + id3 + id4 + id5 + id6);
        return idtotal;
	}
	
	/*public static boolean verificandoSarah (boolean verificado, int quantasQuer, String[] BikesSarahUrb, String verificando) {
	    if(!verificaNuloSarah(BikesSarahUrb)) {
	        verificado = true;
	    }
	    int j = 1;
	    if(BikesSarahUrb.length >= quantasQuer){
	        for (int i = 0; i < BikesSarahUrb.length; i++){
	            if(BikesSarahUrb[i] == null){
	                if(j > quantasQuer){
	                    break;
	                }
	                BikesSarahUrb[i] = verificando;
	                j++;
	            }
	        }
	        verificado = false;
	    }
	    System.out.println(Arrays.toString(BikesSarahUrb));
	    return verificado;
	}
	
	public static boolean verificaNuloSarah(String[] BikesSarahUrb){
    boolean nulo = false;
	    for (String s: BikesSarahUrb) {
	        if (s == null) {
	            nulo = true;
	            break;
	        }
	    }
	    return nulo;
	}*/
	
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

