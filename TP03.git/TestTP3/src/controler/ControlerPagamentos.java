package controler;

import java.util.Scanner;

import models.*;

public class ControlerPagamentos {
	private Pagamento p = new Pagamento();
	private Usuario user = new Usuario();
	static Scanner ler = new Scanner(System.in);
	
	public void dadosPagamento() {
		for(int i = 0; i <= ControlerUsuarios.qtdUser; i++ ) {
			if(Usuario.usuario[i][0] != null) {
				Pagamento.DadosPagamento[i][0] = Usuario.usuario[1][0];
			}
		}
	}	
	
	public void cadastroPagamento() {
		cadastrarFormaDePagamento();
		cadastrarNumCartao();
		cadastrarNomeCaartao();
		cadastrarCvvCartao();
	}
	
	public void cadastrarFormaDePagamento(){
		System.out.println("------------------------------");
		System.out.println("Pagamento: ");
		System.out.println("Forma de Pagamento(debito, credito):\n");
		p.setFormaDePagamento(ler.next());
		String respostaCartao = p.getFormaDePagamento();
		boolean verificador = false;
		validarFormaDePagamento(respostaCartao, verificador);
	}
	public void validarFormaDePagamento(String respostaCartao, boolean verificador) {
		if ((respostaCartao.contains("debito")) || (respostaCartao.contains("credito"))){ 
			verificador = true;
		}else{  
			do {
				System.out.println("Erro! Escolha apenas debito ou credito: \n");
				p.setFormaDePagamento(ler.next());
				respostaCartao = p.getFormaDePagamento();
				if ((respostaCartao.contains("debito")) || (respostaCartao.contains("credito"))){ 
					verificador = true;
				}
			}while(verificador != true );
		}
	}
	
	public void cadastrarNumCartao(){
		System.out.println("Cadastrar numero do cartao para pagamento: \n");
		p.setNumeroDoCartao(ler.next());
		boolean validador = true;
		String respostaNumCartao = p.getNumeroDoCartao();
		validarNumCartao(validador,respostaNumCartao);
	}
	public void validarNumCartao(boolean validador,String respostaNumCartao) {
		if(respostaNumCartao.length() != 16){
			validador = false;
			do {
				System.out.println("Erro! Um cartao possui 16 digitos de identificacao. Insira os numeros validos:");
				p.setNumeroDoCartao(ler.next());
				respostaNumCartao = p.getNumeroDoCartao();
				if(respostaNumCartao.length() != 16){
					validador = false;
				}
			}while(validador == false);
		}
		if(!respostaNumCartao.substring(0).matches("[0-9]*")){
			validador = false;
			do {
				System.out.println("Erro! Digitos de identificacao possui apenas numeros. Insira os numeros validos:");
				p.setNumeroDoCartao(ler.next());
				respostaNumCartao = p.getNumeroDoCartao();
				if(!respostaNumCartao.substring(0).matches("[0-9]*")){
					validador = false;
				}
			}while(validador == false);
		}
	}
	
	public void cadastrarNomeCaartao() {
		validarNomeCartao();
	}
	public void validarNomeCartao() {
		
	}
	
	public void cadastrarCvvCartao() {
		validarCvvCartao();
	}
	public void validarCvvCartao() {
		
	}
	
	//resto
	public void editarPagamento() {
		
	}
	public void deletarPagamento() {
		
	}
	public void listarPagamento() {
		
	}
}
