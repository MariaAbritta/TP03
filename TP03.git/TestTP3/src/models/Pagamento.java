package models;

import java.util.Scanner;

public class Pagamento {
	private String formaDePagamento;
	private double valorTotalPagamento;
	private String numeroDoCartao;
	private String nomeNoCartao;
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
		
		valorTotalPagamento = valorTotalPagamento * 0.5; 
		this.valorTotalPagamento = valorTotalPagamento;
	}

	public String getNumeroDoCartao() {
		return numeroDoCartao;
	}

	public void setNumeroDoCartao(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}

	public String getNomeNoCartao() {
		return nomeNoCartao;
	}

	public void setNomeNoCartao(String nomeNoCartao) {
		this.nomeNoCartao = nomeNoCartao;
	}

	public String getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}

	public void setCodigoDeSeguranca(String codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}
	
	//metodos
	public void cadastrarPagamento() {
		System.out.println("------------------------------");
		System.out.println("Pagamento: ");
		System.out.println("Forma de Pagamento(debito, credito):\n");
		// Validacao do Pagamento:
		setFormaDePagamento(ler.next());
		boolean validarCartao = true;
		String respostaCartao;
		respostaCartao = getFormaDePagamento();
		if ((respostaCartao.contains("debito")) || (respostaCartao.contains("credito"))){ 
			validarCartao = false;
		}else{  
			do {
				System.out.println("Erro! Escolha apenas debito ou credito: \n");
				setFormaDePagamento(ler.next());
				respostaCartao = getFormaDePagamento();
				if ((respostaCartao.contains("debito")) || (respostaCartao.contains("credito"))){ 
					validarCartao = false;
				}
			}while(validarCartao == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("Valor a ser pago: " + getValorTotalPagamento()); //Como linkar com o pedido da pessoa?
		
		System.out.println("Cadastrar numero do cartao para pagamento: \n");
		// Validacao do numero de pagamento
		setNumeroDoCartao(ler.next());
		boolean validarNumCartao = true;
		String respostaNumCartao;
		respostaNumCartao = getNumeroDoCartao();
		if(respostaNumCartao.length() != 16){
			validarNumCartao = false;
			do {
				System.out.println("Erro! Um cartao possui 16 digitos de identificacao. Insira os numeros validos:");
				setNumeroDoCartao(ler.next());
				respostaNumCartao = getNumeroDoCartao();
				if(respostaNumCartao.length() != 16){
					validarNumCartao = false;
				}
			}while(validarNumCartao == false);
		}
		if(!respostaNumCartao.substring(0).matches("[0-9]*")){
			validarNumCartao = false;
			do {
				System.out.println("Erro! Digitos de identificacao possui apenas numeros. Insira os numeros validos:");
				setNumeroDoCartao(ler.next());
				respostaNumCartao = getNumeroDoCartao();
				if(!respostaNumCartao.substring(0).matches("[0-9]*")){
					validarNumCartao = false;
				}
			}while(validarNumCartao == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("Cadastrar nome do cartao: \n");
		// Validacao do NOME de apenas letras:
		setNomeNoCartao(ler.next());
		boolean validarNome = true;
		String respostaNome;
		respostaNome = getNomeNoCartao();
		if(!respostaNome.substring(0).matches("[A-Z]*")){
			validarNome = false;
			do {
				System.out.println("Erro! Um nome precisa ter letras maiusculas. \n"
						+ "Insira um nome valido: ");
				setNomeNoCartao(ler.next());
				respostaNome = getNomeNoCartao();
				if(!respostaNome.substring(0).matches("[A-Z]*")){
					validarNome = false;
				}
			}while(validarNome == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("Cadastrar codigo de seguranca do cartao: \n");
		// Validacao do CVV:
		setCodigoDeSeguranca(ler.next());
		boolean validarCVV = true;
		String respostaCVV;
		respostaCVV = getCodigoDeSeguranca();
		if(respostaCVV.length() != 3){
			validarCVV = false;
			do {
				System.out.println("Erro! Um CVV possui 3 digitos. Insira um CVV valido:");
				setCodigoDeSeguranca(ler.next());
				respostaCVV = getCodigoDeSeguranca();
				if(respostaCVV.length() != 3){
					validarCVV = false;
				}
			}while(validarCVV == false);
		}
		if(!respostaCVV.substring(0).matches("[0-9]*")){
			validarCVV = false;
			do {
				System.out.println("Erro! Um CVV possui apenas numeros. Insira um CVV valido:");
				setCodigoDeSeguranca(ler.next());
				respostaCVV = getCodigoDeSeguranca();
				if(!respostaCVV.substring(0).matches("[0-9]*")){
					validarCVV = false;
				}
			}while(validarCVV == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("------------------------------");
	}
//	
//	public void editarPagamento() {
//		System.out.println("--------------------");
//		System.out.println("Editar Pagamento: \n");
//		
//		//nao editaveis
//		System.out.println("Valor a ser pago: " + getValorTotalPagamento());
//		
//		//editaveis
//		System.out.println("Forma de Pagamento (debito, credito):\n");
//		setFormaDePagamento(ler.next());
//		
//		System.out.println("Cadastrar numero do cartao para pagamento: \n");
//		setNumeroDoCartao(ler.next());
//		
//		System.out.println("Cadastrar nome no cartao: \n");
//		setNomeNoCartao(ler.next());
//		
//		System.out.println("Cadastrar codigo de seguranca do cartao: \n");
//		setCodigoDeSeguranca(ler.next());
//		System.out.println("--------------------");
//	}
//	
//	public void deletarPagamento() {
//		System.out.println("\nDeletando Pagamento....\n");
//		setValorTotalPagamento(0);
//		setFormaDePagamento("");
//		setNumeroDoCartao("");
//		setNomeNoCartao("");
//		setCodigoDeSeguranca("");
//	}
//	
//	public void listarPagamento() {
//		System.out.println("------------------------------");
//		System.out.println("Listar Pagamento:");
//		System.out.println("Valor a ser pago: " + getValorTotalPagamento());
//		System.out.println("Forma de pagamento: " + getFormaDePagamento());
//		System.out.println("Numero do cartao: " + getNumeroDoCartao());
//		System.out.println("Nome no cartao: " + getNomeNoCartao());
//		System.out.println("Codigo de seguranca: " + getCodigoDeSeguranca());
//		System.out.println("PAGAMENTO SENDO PROCESSADO...");
//		System.out.println("...");
//		System.out.println("PAGAMENTO REALIZADO!");
//	}
	
}
