
public class Pagamento {
	
	private double pagamento;
	private double valorTotalPagamento;
	private int cadastroCartao;
	private String informacoesCartao = "";
	private double valoresPagos;
	
	public Pagamento(double p, double vTP, int cC, String iC, double vP) {
		pagamento = p;
		valorTotalPagamento = vTP;
		cadastroCartao = cC;
		informacoesCartao = iC;
		valoresPagos = vP;
	}
	
	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	public double getValorTotalPagamento() {
		return valorTotalPagamento;
	}

	public void setValorTotalPagamento(double valorTotalPagamento) {
		this.valorTotalPagamento = valorTotalPagamento;
	}

	public int getCadastroCartao() {
		return cadastroCartao;
	}

	public void setCadastroCartao(int cadastroCartao) {
		this.cadastroCartao = cadastroCartao;
	}

	public String getInformacoesCartao() {
		return informacoesCartao;
	}

	public void setInformacoesCartao(String informacoesCartao) {
		this.informacoesCartao = informacoesCartao;
	}

	public double getValoresPagos() {
		return valoresPagos;
	}

	public void setValoresPagos(double valoresPagos) {
		this.valoresPagos = valoresPagos;
	}

}
