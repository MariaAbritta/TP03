package models; 

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Recebe os dados das bicicletas, além de listar e exibir o ID de cada uma.
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */


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
	
	/**
	 * Lista o ID da bicicleta alugada no parque Sarah.
	 * @param resposta
	 * @return resposta
	 */
	public String listarBicicletasSarah(String resposta) {
		resposta = "Você alugou uma bicicleta no Parque da Cidade Dona Sarah Kubitschek"+ "\nID da Bicicleta: " + getIdBicicletaSarah();
		return resposta;
	}
	
	/**
	 * Lista o ID da bicicleta alugada no parque Ecológico.
	 * @param resposta
	 * @return resposta
	 */
	public String listarBicicletasEco(String resposta) {
		resposta = "Você alugou uma bicicleta no Parque Ecologico de Aguas Claras"+ "\nID da Bicicleta: " + getIdBicicletaSarah();
		return resposta;
	}

	/**
	 * Cria aleatoriamente um ID para as bikes.
	 * @return idtotal
	 */
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

}

