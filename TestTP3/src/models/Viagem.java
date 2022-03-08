package models;

import java.util.Scanner;

public class Viagem {
	private double pagamento;
	private int bicicleta;
	private String avaliacao;
	private String lugarSaida;
	private String lugarChegada;
	static Scanner ler = new Scanner(System.in);
	
	public Viagem() {
		super();
	}
	
	public Viagem(double p, int b, String a, String lS, String lC) {
		bicicleta = b;
		avaliacao = a;
		lugarSaida = lS;
		lugarChegada = lC;
	}
	
	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		Pagamento p = new Pagamento();
		pagamento = p.getValorTotalPagamento();
		this.pagamento = pagamento;
	}

	public int getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(int bicicleta) {
		Bicicleta b= new Bicicleta();
		bicicleta = b.getIdBicicleta();
		this.bicicleta = bicicleta;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getLugarSaida() {
		return lugarSaida;
	}

	public void setLugarSaida(String lugarSaida) {
		this.lugarSaida = lugarSaida;
	}

	public String getLugarChegada() {
		return lugarChegada;
	}

	public void setLugarChegada(String lugarChegada) {
		this.lugarChegada = lugarChegada;
	}
	
	//metodos
	public void cadastarViagem() {
		System.out.println("\nCadastrar informacoes adicionais da viagem: \n");
		
		System.out.println("\nCadastrar avaliacao(bom, medio, ruim): \n");
		setAvaliacao(ler.next());
		
		System.out.println("\nCadastrar lugar de saida: \n");
		setLugarSaida(ler.next());
		
		System.out.println("\nCadastrar lugar de chegada: \n");
		setLugarChegada(ler.next());
	}
	
	public void editarViagem() {
		System.out.println("\nEditar informacoes adicionais de viagem: \n");
		
		System.out.println("\nCadastrar avaliacao(bom, medio, ruim): \n");
		setAvaliacao(ler.next());
		
		System.out.println("\nCadastrar lugar de saida: \n");
		setLugarSaida(ler.next());
		
		System.out.println("\nCadastrar lugar de chegada: \n");
		setLugarChegada(ler.next());
	}
	
	public void listarViagem() {
		System.out.println("Informacoes da viagem: \n");
		System.out.println("\nValor: \n"+getPagamento());
		System.out.println("\nId da bicicleta: \n"+getBicicleta());
		System.out.println("\nAvalicao da viagem: \n"+getAvaliacao());
		System.out.println("\nLugar de saida: \n"+getLugarSaida());
		System.out.println("\nLugar de chegada: \n"+getLugarChegada());	
	}
	
	public void deletarViagem() {
		System.out.println("\nDeletando viagem...\n");
		setPagamento(0);
		setBicicleta(0);
		setAvaliacao("");
		setLugarSaida("");
		setLugarChegada("");
	}
	
	public void buscarViagem() {
		System.out.println("\nBuscar Viagem\n");
	}
	
}
