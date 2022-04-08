package controller;

import models.Cartao;
import models.Dados;
import models.Pagamento;
import models.Usuario;


/**
 * Equipara se os dados fornecidos estão nos dados cadastrados de pagamento
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */ 


public class ControllerPagamentos {
	/**
	 * Faz a junção de todas a informações do crtão que são cadastradas.
	 * @param liga ao usuário, colea o numero do cartão, o cvv, e nome cadastrado.
	 * @return nada, mas junta todas as informações no get de cartões.
	 */
	public static void cadastrarCartao(Usuario usr, String numero, String cvv, String nome) {
		usr.getCartoes().add(new Cartao(numero, cvv, nome));
	}

	// validacoes
	
	/**
	 * Verifica a respota da forma de pagamento. Faz as verificações:
	 * (1) Se a resposta contém apenas letras.
	 * @param resposta do tipo de cartão.
	 * @return booleano verdadeiro ou falo.
	 */
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

	/**
	 * Verifica a respota do número do cartão. Faz as verificações:
	 * (1) Se possui necessariamente 16 caracteres.
	 * (2) Se só possui números.
	 * @param resposta do tipo de cartão.
	 * @return booleano verdadeiro ou falo.
	 */
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

	/**
	 * Verifica a respota do nome no cartão. Faz as verificações:
	 * (1) Se a resposta contém apenas letras.
	 * @param resposta do nome no cartão.
	 * @return booleano verdadeiro ou falo.
	 */
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

	/**
	 * Verifica a respota do CVV do cartão. Faz as verificações:
	 * (1) Se possui necessariamente 3 caracteres.
	 * (2) Se só possui números.
	 * @param resposta do tipo CVV do cartão.
	 * @return booleano verdadeiro ou falo.
	 */
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
	
	/**
	 * Verifica se o CVV buscado foi cadastrado
	 * @param nome 
	 * @return retorna as informações do usuário encontrado caso ele for encontrado
	 */
	public static Pagamento validarBusca(String resposta) {
		for (Pagamento pgmnt : Dados.getPagamentos()) {
			if (pgmnt.getCodigoDeSeguranca().equals(resposta)) {
				return pgmnt;
			}
		}
		return null;

	}
}
