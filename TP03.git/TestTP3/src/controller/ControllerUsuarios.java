package controller;

import models.Dados;
import models.Usuario;

/**
 * Equipara se os dados fornecidos estão nos dados cadastrados de usuário
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */



public class ControllerUsuarios {
	/**
	 * Verifica o cadastro inteiro de usuário, se está de acordo com as verificações específicas, não manda mensagem de erro
	 * @param nome, emial, rg, cpf, tel e senha.
	 * @return mensagem de erro se não passar nas verificações.
	 */
	public String verificaCadastro(String nome, String email, String rg, String cpf, String tel, String senha) {
		String msgErro = "";
		if (nome.length() == 0 || email.length() == 0 || rg.length() == 0
				|| cpf.length() == 0 || tel.length() == 0
				|| senha.length() == 0) {
			return null;
		}
		if (!validarNome(nome)) {
			msgErro += "Nome invalido\n";
		}
		if (!validarEmail(email)) {
			msgErro += "Email invalido\n";
		}
		if (!validarRg(rg)) {
			msgErro += "Rg invalido\n";
		}
		if (!validarCpf(cpf)) {
			msgErro += "Cpf invalido\n";
		}
		if (!validarTelefone(tel)) {
			msgErro += "Telefone invalido\n";
		}
		if (!validarSenha(senha)) {
			msgErro += "Senha invalida\n";
		}
		return msgErro;
	}

	/**
	 * Verifica a respota do nome do usuário. Faz as verificações:
	 * (1) Se a resposta contém apenas letras.
	 * @param nomeInput
	 * @return booleano verdadeiro ou falso.
	 */
	public boolean validarNome(String nomeInput) {
		boolean verificar = true;
		if (!nomeInput.substring(0).matches("[A-Z]*")) {
			verificar = false;
		}
		return verificar;
	}

	/**
	 * Verifica a respota do e-mail do usuário. Faz as verificações:
	 * (1) Se a resposta contém o @ do e-mail.
	 * @param emailValid
	 * @return booleano verdadeiro ou falso.
	 */
	public boolean validarEmail(String emailValid) {
		boolean verificar = true;

		if (!emailValid.substring(0).matches("(.*)@(.*)")) {
			verificar = false;
		}
		return verificar;
	}

	/**
	 * Verifica a respota do rg do usuário. Faz as verificações:
	 * (1) Se a resposta contém necessariamente 7 caracteres.
	 * (2) Se a resposta contém apenas números.
	 * @param rgValid
	 * @return booleano verdadeiro ou falso.
	 */
	public boolean validarRg(String rgValid) {
		boolean verificar = true;
		if (rgValid.length() != 7) {
			verificar = false;
		}
		if (!rgValid.substring(0).matches("[0-9]*")) {
			verificar = false;
		}

		return verificar;
	}

	/**
	 * Verifica a respota do cpf do usuário. Faz as verificações:
	 * (1) Se a resposta contém necessariamente 11 caracteres.
	 * (2) Se a resposta contém apenas números.
	 * @param cpfValid
	 * @return booleano verdadeiro ou falso.
	 */
	public boolean validarCpf(String cpfValid) {
		boolean verificar = true;
		if (cpfValid.length() != 11) {
			verificar = false;
		}
		if (!cpfValid.substring(0).matches("[0-9]*")) {
			verificar = false;
		}
		return verificar;
	}

	/**
	 * Verifica a respota da senha do usuário. Faz as verificações:
	 * (1) Se a resposta contém necessariamente 7 caracteres.
	 * (2) Se a resposta contém 3 letras maiúsculas e 4 números.
	 * @param senhaValid
	 * @return booleano verdadeiro ou falso.
	 */
	public boolean validarSenha(String senhaValid) {
		boolean verificar = true;
		if (senhaValid.length() != 7) {
			verificar = false;
		}
		if (!senhaValid.substring(0, 3).matches("[A-Z]*")) {
			verificar = false;
		}
		if (!senhaValid.substring(3).matches("[0-9]*")) {
			verificar = false;
		}
		return verificar;
	}

	/**
	 * Verifica a respota do telefone do usuário. Faz as verificações:
	 * (1) Se a resposta contém necessariamente 9 caracteres.
	 * (2) Se a resposta contém apenas números.
	 * @param telValid
	 * @return booleano verdadeiro ou falso.
	 */
	public boolean validarTelefone(String telValid) {
		boolean verificar = true;
		if (telValid.length() != 9) {
			verificar = false;
		}
		if (!telValid.substring(0).matches("[0-9]*")) {
			verificar = false;
		}
		return verificar;
	}

	/**
	 * Deleta todas as informações dos usuários.
	 * @param usr
	 */
	public void deletarUsuario(Usuario usr) {
		Dados.getUsuarios().remove(usr);
	}
}