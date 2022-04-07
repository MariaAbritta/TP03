package models;

import java.util.Scanner;

public class Pagamento {
	private String formaDePagamento;
	private double valorTotalPagamento;
	private String numeroDoCartao;
	private static String nomeNoCartao;
	private String codigoDeSeguranca;
	private Usuario pagador;
	static int i = 0, j = 1;
	static Scanner ler = new Scanner(System.in);

	public Pagamento(Usuario pagador, String fPagamento, double vTotal, String numCartao, String nomeCartao,
			String cvv) {
		this.pagador = pagador;
		this.formaDePagamento = fPagamento;
		this.valorTotalPagamento = vTotal;
		this.numeroDoCartao = numCartao;
		Pagamento.nomeNoCartao = nomeCartao;
		this.codigoDeSeguranca = cvv;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
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

	public String getNomeNoCartao(String pagamento) {
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
