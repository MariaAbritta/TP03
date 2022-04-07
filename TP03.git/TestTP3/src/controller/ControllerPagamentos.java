package controller;

import models.Cartao;
import models.Dados;
import models.Pagamento;
import models.Usuario;

public class ControllerPagamentos {

	public static void cadastrarCartao(Usuario usr, String numero, String cvv, String nome) {
		usr.getCartoes().add(new Cartao(numero, cvv, nome));
	}

	// validacoes
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
		if (respostaNumCartao.length() != 16) {
			validador = false;
		}
		if (!respostaNumCartao.substring(0).matches("[0-9]*")) {
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
		if (respostaCvv.length() != 3) {
			verificador = false;
		}
		if (!respostaCvv.substring(0).matches("[0-9]*")) {
			verificador = false;
		}
		return verificador;
	}
	
	public static Pagamento validarBusca(String login) {

		for (Pagamento usr : Dados.getPagamentos()) {
			if (usr.getCodigoDeSeguranca().equals(login)) {
				return usr;
			}
		}
		return null;

	}
}
