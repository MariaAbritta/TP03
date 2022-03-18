package models;

import java.util.Scanner;

public class Pagamento {
	private String formaDePagamento;
	private double valorTotalPagamento;
	private float finalTotalViagem;
	private double numeroDoCartao;
	private String nomeNoCartao;
	private int codigoDeSeguranca;
	static Scanner ler = new Scanner(System.in);
	
	public Pagamento() {
		super();
	}
	
	public Pagamento(String fPagamento, double vTotal, float fTempo, double numCartao, String nomeCartao, int cvc) {
		this.formaDePagamento = fPagamento;
		this.valorTotalPagamento = vTotal;
		this.finalTotalViagem = fTempo;
		this.numeroDoCartao = numCartao;
		this.nomeNoCartao = nomeCartao;
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
		//Tempo tempo = new Tempo();
		//valorTotalPagamento = tempo.getMinutosViagem();
		
		valorTotalPagamento = valorTotalPagamento * 0.5; 
		this.valorTotalPagamento = valorTotalPagamento;
	}

	public float getFinalTotalViagem() {
		
		return finalTotalViagem;
	}

	public void setFinalTotalViagem(float finalTotalViagem) {
		//Tempo tempo = new Tempo();
		//finalTotalViagem = tempo.getMinutosViagem();
		this.finalTotalViagem = finalTotalViagem;
	}

	public double getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(double numeroDoCartao) {
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
	
	//metodos
	public void cadastrarPagamento() {
		System.out.println("--------------------");
		System.out.println("\nCadastrar Pagamento: \n");
		
		System.out.println("Forma de Pagamento(debito, credito):\n");
		setFormaDePagamento(ler.next());
		
		System.out.println("Valor a ser pago: " + getValorTotalPagamento());
		System.out.println("Tempo total da viagem: " + getFinalTotalViagem());
		
		System.out.println("Cadastrar numero do cartao para pagamento: \n");
		setNumeroDoCartao(ler.nextDouble());
		
		System.out.println("Cadastrar nome no cartao: \n");
		setNomeNoCartao(ler.next());
		
		System.out.println("Cadastrar codigo de seguranca do cartao: \n");
		setCodigoDeSeguranca(ler.nextInt());
		System.out.println("--------------------");
		
	}
	
	public void editarPagamento() {
		System.out.println("--------------------");
		System.out.println("Editar Pagamento: \n");
		
		//nao editaveis
		System.out.println("Valor a ser pago: " + getValorTotalPagamento());
		System.out.println("Tempo total da viagem: " + getFinalTotalViagem());
		
		//editaveis
		System.out.println("Forma de Pagamento (debito, credito):\n");
		setFormaDePagamento(ler.next());
		
		System.out.println("Cadastrar numero do cartao para pagamento: \n");
		setNumeroDoCartao(ler.nextDouble());
		
		System.out.println("Cadastrar nome no cartao: \n");
		setNomeNoCartao(ler.next());
		
		System.out.println("Cadastrar codigo de seguranca do cartao: \n");
		setCodigoDeSeguranca(ler.nextInt());
		System.out.println("--------------------");
	}
	
	public void deletarPagamento() {
		System.out.println("\nDeletando Pagamento....\n");
		setValorTotalPagamento(0);
		setFormaDePagamento("");
		setNumeroDoCartao(0);
		setNomeNoCartao("");
		setCodigoDeSeguranca(0);
		setFinalTotalViagem(0);
	}
	
	public void listarPagamento() {
		System.out.println("\nListar Pagamento: \n");
		System.out.println("\nValor a ser pago: " + getValorTotalPagamento());
		System.out.println("\nTempo de utilizacao: " + getFinalTotalViagem());
		System.out.println("\nForma de pagamento: " + getFormaDePagamento());
		System.out.println("\nNumero do cartao: " + getNumeroDoCartao());
		System.out.println("\nNome no cartao: " + getNomeNoCartao());
		System.out.println("\nCodigo de seguranca: " + getCodigoDeSeguranca());
		
	}
	
}
