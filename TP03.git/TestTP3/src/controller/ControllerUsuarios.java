package controller;

import models.Dados;
import models.Usuario;

public class ControllerUsuarios {

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

	public boolean validarNome(String nomeInput) {
		boolean verificar = true;
		if (!nomeInput.substring(0).matches("[A-Z]*")) {
			verificar = false;
		}
		return verificar;
	}

	public boolean validarEmail(String emailValid) {
		boolean verificar = true;

		if (!emailValid.substring(0).matches("(.*)@(.*)")) {
			verificar = false;
		}
		return verificar;
	}

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

	public void deletarUsuario(Usuario usr) {
		Dados.getUsuarios().remove(usr);
	}
}