package controller;

import java.util.Scanner;

import models.*;
import view.TelaCadastroUsuario;

public class ControllerUsuarios {

	private Usuario user = new Usuario();
	public static int qtdUser = 0;
	static int i = 0, j = 0;
	static Scanner ler = new Scanner(System.in);
	public static int indiceUser=0;
	
	public static void contaUser() {
		qtdUser++;
	}

	public static void cadastroUser() {
		Usuario.usuario[ControllerUsuarios.qtdUser][0] = TelaCadastroUsuario.txtNome.getText();
		Usuario.usuario[ControllerUsuarios.qtdUser][1] = TelaCadastroUsuario.txtEmail.getText();
		Usuario.usuario[ControllerUsuarios.qtdUser][2] = TelaCadastroUsuario.txtRG.getText();
		Usuario.usuario[ControllerUsuarios.qtdUser][3] = TelaCadastroUsuario.txtCPF.getText();
		Usuario.usuario[ControllerUsuarios.qtdUser][4] = TelaCadastroUsuario.senha.getText();
		Usuario.usuario[ControllerUsuarios.qtdUser][5] = TelaCadastroUsuario.txtTel.getText();
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
}