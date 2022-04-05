package models;

import java.util.Scanner;

public class Pagamento {
	private String formaDePagamento;
	private double valorTotalPagamento;
	private String numeroDoCartao;
	private static String nomeNoCartao;
	private String codigoDeSeguranca;
	static public String[][] DadosPagamento = new String[50][50];
	static  int i = 0, j = 1;
	static Scanner ler = new Scanner(System.in);
	
	public Pagamento() {
		super();
	}
	
	public Pagamento(String fPagamento, double vTotal, String numCartao, String nomeCartao, String cvc) {
		this.formaDePagamento = fPagamento;
		this.valorTotalPagamento = vTotal;
		this.numeroDoCartao = numCartao;
		Pagamento.nomeNoCartao = nomeCartao;
		this.codigoDeSeguranca = cvc;
	}
	
	public String getFormaDePagamento(){
		return formaDePagamento;
	}

	public void setFormaDePagamento (String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	public double getValorTotalPagamento() {
		return valorTotalPagamento;
	}

	public void setValorTotalPagamento(double valorTotalPagamento) {
		
		valorTotalPagamento = valorTotalPagamento * 0.5; 
		this.valorTotalPagamento = valorTotalPagamento;
	}

	public String getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}

	public static String getNomeNoCartao() {
		return nomeNoCartao;
	}

	public static void setNomeNoCartao(String nomeNoCartao) {
		Pagamento.nomeNoCartao = nomeNoCartao;
	}

	public String getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}

	public void setCodigoDeSeguranca(String codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}
}
