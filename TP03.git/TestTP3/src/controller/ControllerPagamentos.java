package controller;

import java.util.Scanner;

import models.*;
import view.TelaCadastroCartao;

public class ControllerPagamentos {
	private Pagamento p = new Pagamento();
	private Usuario user = new Usuario();
	public static int qtdCartao = 0;
	public static int ultPosi=0;
	
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
	public static void cadastrarCartao() {
		if(qtdCartao == 0) {
			Pagamento.DadosPagamento[ControllerUsuarios.indiceUser][1] = TelaCadastroCartao.textForma.getText();
			Pagamento.DadosPagamento[ControllerUsuarios.indiceUser][2] = TelaCadastroCartao.txtNumCartao.getText();
			Pagamento.DadosPagamento[ControllerUsuarios.indiceUser][3] = TelaCadastroCartao.txtNome.getText();
			Pagamento.DadosPagamento[ControllerUsuarios.indiceUser][4] = TelaCadastroCartao.textCVV.getText();
			ultPosi = 4;
			contaCartoes();
			return;
		}
		else if(qtdCartao >= 1) {
			Pagamento.DadosPagamento[ControllerUsuarios.indiceUser][ultPosi+1] = TelaCadastroCartao.textForma.getText();
			Pagamento.DadosPagamento[ControllerUsuarios.indiceUser][ultPosi+2] = TelaCadastroCartao.txtNumCartao.getText();
			Pagamento.DadosPagamento[ControllerUsuarios.indiceUser][ultPosi+3] = TelaCadastroCartao.txtNome.getText();
			Pagamento.DadosPagamento[ControllerUsuarios.indiceUser][ultPosi+4] = TelaCadastroCartao.textCVV.getText();
			ultPosi = ultPosi+4;
			contaCartoes();
			return;
		}
		
	}
	
	//validacoes
	public boolean validarFormaDePagamento(String respostaCartao) {
		boolean verificar = true;
		if (respostaCartao.substring(0).matches("[A-Z]*")) {
			verificar = true;
		}
		if (!respostaCartao.substring(0).matches("[A-Z]*")) {
			verificar = false;
		}
		return verificar;
	}
	
	public boolean validarNumCartao(String respostaNumCartao) {
		boolean validador = true;
		if(respostaNumCartao.length() != 16){
			validador = false;
		}
		if(!respostaNumCartao.substring(0).matches("[0-9]*")){
			validador = false;	
		}
		return validador;
	}
	
	public boolean validarNomeCartao(String nomeInput) {
		boolean verificar = true;
		if (nomeInput.substring(0).matches("[A-Z]*")) {
			verificar = true;
		}
		if (!nomeInput.substring(0).matches("[A-Z]*")) {
			verificar = false;
		}
		return verificar;
	}
	
	public boolean validarCvvCartao(String respostaCvv) {
		boolean verificador = true;
		if(respostaCvv.length() != 3){
			verificador = false;
		}
		if(!respostaCvv.substring(0).matches("[0-9]*")){
			verificador = false;
		}
		return verificador;
	}
}
