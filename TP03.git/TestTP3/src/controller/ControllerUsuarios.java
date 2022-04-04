package controller;

import java.util.Scanner;

import models.*;

public class ControllerUsuarios {

	private Usuario user = new Usuario();
	public static int qtdUser = 0;
	static int i = 0, j = 0;
	static Scanner ler = new Scanner(System.in);

	public void editarUser() {
		editarUsuario();
	}

	public void listarUsuario() {
		for (int x = 0; x <= 6; x++) {
			if (Usuario.usuario[ControllerLoging.indiceUser][x] != null) {
				System.out.println(x + ". " + Usuario.usuario[ControllerLoging.indiceUser][x]);
			}
		}
	}

	public void deletarUsuario() {
		System.out.println("Deseja excluir usuario??");
		System.out.println("1.SIM \n 2.NAO");
		int confirmar = 0;
		confirmar = ler.nextInt();

		switch (confirmar) {
			case 1:
				for (int x = 0; x <= 6; x++) {
					if (Usuario.usuario[ControllerLoging.indiceUser][x] != null) {
						Usuario.usuario[ControllerLoging.indiceUser][x] = null;
						System.out.println(x + ". " + Usuario.usuario[ControllerLoging.indiceUser][x]);
					}
				}
				System.out.println("Deletado...	 ");
				break;
			case 2:
				System.out.println("OK");
				break;
			default:
				System.out.println("Nao tem essa op��o");
				break;
		}

	}


	public boolean validarNome(String nomeInput) {
		System.out.println(nomeInput);
		boolean verificar = true;
		System.out.println("Validando Nome");
		if (!nomeInput.substring(0).matches("[A-Z]*")) {
			verificar = false;
		}
		return verificar;
	}

	public boolean validarEmail(String emailValid) {
		System.out.println("Validando Email");
		boolean verificar = true;

		if (!emailValid.substring(0).matches("(.*)@(.*)")) {
			verificar = false;
		}
		return verificar;
	}

	public boolean validarRg(String rgValid) {
		System.out.println(rgValid.length());
		System.out.println("Validando RG");
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
		System.out.println("Validando CPF");
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
		System.out.println(senhaValid);
		System.out.println("Validando Senha");
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
		System.out.println("Validando Telefone");
		boolean verificar = true;
		if (telValid.length() != 9) {
			verificar = false;
		}
		if (!telValid.substring(0).matches("[0-9]*")) {
			verificar = false;
		}
		return verificar;
	}

	public void editarUsuario() {
		int opcao;
		System.out.println("O que deseja editar??\n");
		System.out.println("1.Nome");
		System.out.println("2.Email");
		System.out.println("3.RG");
		System.out.println("4.CPF");
		System.out.println("5.Senha");
		System.out.println("6.Telefone");
		opcao = ler.nextInt();

	}
}