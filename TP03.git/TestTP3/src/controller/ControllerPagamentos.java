package controller;

import java.util.Scanner;

import models.*;

public class ControllerPagamentos {
	private Pagamento p = new Pagamento();
	private Usuario user = new Usuario();
	public static int qtdCartao = 0;
	static Scanner ler = new Scanner(System.in);
	
	//relacao de usuarios com seus pagamentos
	public static void dadosPagamento() {
		for(int i = 0; i <= ControllerUsuarios.qtdUser; i++ ) {
			if(Usuario.usuario[i][0] != null) {
				Pagamento.DadosPagamento[i][0] = Usuario.usuario[i][0];
			}
		}
	}	
	
	//contar cartoes
	public static void contaCartoes() {
		qtdCartao++;
	}
	
	//validacoes
	public boolean validarFormaDePagamento(String respostaCartao, boolean verificador) {
		if ((respostaCartao.contains("debito")) || (respostaCartao.contains("credito"))){ 
			verificador = true;
		}
		else {
			verificador = false;
		}
		return verificador;
	}
	
	public boolean validarNumCartao(boolean validador,String respostaNumCartao) {
		if(respostaNumCartao.length() != 16){
			validador = false;
		}
		else {
			validador = true;
		}
		if(!respostaNumCartao.substring(0).matches("[0-9]*")){
			validador = false;
			
		}
		else {
			validador = true;
		}
		return validador;
	}
	
	public boolean validarNomeCartao(String respostaNome, boolean verificador) {
		if(!respostaNome.substring(0).matches("[A-Z]*")){
			verificador = false;
		}
		else {
			verificador = true;
		}
		return verificador;
	}
	
	public boolean validarCvvCartao(String respostaCvv, boolean verificador) {
		if(respostaCvv.length() != 3){
			verificador = false;
		}
		else {
			verificador = true;
		}
		if(!respostaCvv.substring(0).matches("[0-9]*")){
			verificador = false;
		}
		else {
			verificador = true;
		}
		return verificador;
	}
}
