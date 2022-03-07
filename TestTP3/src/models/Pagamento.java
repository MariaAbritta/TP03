package models;

public class Pagamento {
	private double valorTotalPagamento;
	private Tempo finalTotalViagem;
	private int numeroDoCartao;
	private String nomeNoCartao;
	private int codigoDeSeguranca;
	
	public Pagamento() {
		super();
	}
	
	public Pagamento(double vTotal, Tempo fTempo, int numCartao, String nomeCartao, int cvc) {
		valorTotalPagamento = vTotal;
		finalTotalViagem = fTempo;
		numeroDoCartao = numCartao;
		nomeNoCartao = nomeCartao;
		codigoDeSeguranca = cvc;
	}

	public double getValorTotalPagamento() {
		return valorTotalPagamento;
	}

	public void setValorTotalPagamento(double valorTotalPagamento) {
		this.valorTotalPagamento = valorTotalPagamento;
	}

	public Tempo getFinalTotalViagem() {
		return finalTotalViagem;
	}

	public void setFinalTotalViagem(Tempo finalTotalViagem) {
		this.finalTotalViagem = finalTotalViagem;
	}

	public int getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(int numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}

	public String getNomeNoCartao() {
		return nomeNoCartao;
	}

	public void setNomeNoCartao(String nomeNoCartao) {
		this.nomeNoCartao = nomeNoCartao;
	}

	public int getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}

	public void setCodigoDeSeguranca(int codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}
}
