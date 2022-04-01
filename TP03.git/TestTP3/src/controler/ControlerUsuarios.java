package controler;

import java.util.Scanner;

import models.*;

public class ControlerUsuarios {

	private Usuario user = new Usuario();
	public static int qtdUser = 0;
	static int i = 0, j = 0;
	static Scanner ler = new Scanner(System.in);

	public void CadastroUser() {
		cadastroUsuario();
	}

	public void editarUser() {
		editarUsuario();
	}

	public void listarUsuario() {
		for (int x = 0; x <= 6; x++) {
			if (Usuario.usuario[ControlerLoging.indiceUser][x] != null) {
				System.out.println(x + ". " + Usuario.usuario[ControlerLoging.indiceUser][x]);
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
					if (Usuario.usuario[ControlerLoging.indiceUser][x] != null) {
						Usuario.usuario[ControlerLoging.indiceUser][x] = null;
						System.out.println(x + ". " + Usuario.usuario[ControlerLoging.indiceUser][x]);
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

	public void cadastroUsuario() {
		// cadastrar nome
		cadastrarNome();
		Usuario.usuario[qtdUser][i] = user.getNome();
		i++;
		// cadastrar email
		cadastrarEmail();
		Usuario.usuario[qtdUser][i] = user.getEmail();
		i++;
		// cadastrar rg
		cadastrarRg();
		Usuario.usuario[qtdUser][i] = user.getRg();
		i++;
		// cadastrar cpf
		cadastrarCpf();
		Usuario.usuario[qtdUser][i] = user.getCpf();
		i++;
		// cadastrar senha
		cadastrarSenha();
		Usuario.usuario[qtdUser][i] = user.getSenha();
		i++;
		// cadastrar telefone
		cadastrarTelefone();
		Usuario.usuario[qtdUser][i] = user.getTelefone();
		qtdUser++;
		i = 0;
	}

	public void cadastrarNome() {
		System.out.println("------------------------------");
		System.out.println("Cadastrar usuarios: ");
		System.out.println("Nome do usuario. Apenas letras maiusculas: ");
		user.setNome(ler.next());
		// validarNome();
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

	public void cadastrarEmail() {
		System.out.println("------------------------------");
		System.out.println("Cadastrar usuarios: ");
		System.out.println("Email do usuario. Apenas letras maiusculas: ");
		user.setEmail(ler.next());
		// validarEmail();
	}

	public boolean validarEmail(String emailValid) {
		System.out.println("Validando Email");
		boolean verificar = true;

		if (!emailValid.substring(0).matches("(.*)@(.*)")) {
			verificar = false;
		}
		return verificar;
	}

	public void cadastrarRg() {
		System.out.println("------------------------------");
		System.out.println("Cadastrar usuarios: ");
		System.out.println("Rg do usuario. Apenas letras maiusculas: ");
		user.setRg(ler.next());
		// validarRg();
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

	public void cadastrarCpf() {
		System.out.println("------------------------------");
		System.out.println("Cadastrar usuarios: ");
		System.out.println("CPF do usuario. Apenas letras maiusculas: ");
		user.setCpf(ler.next());
		// validarCpf();
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

	public void cadastrarSenha() {
		System.out.println("------------------------------");
		System.out.println("Cadastrar usuarios: ");
		System.out.println("Senha do usuario. Apenas letras maiusculas: ");
		user.setSenha(ler.next());
		// validarSenha();
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

	public void cadastrarTelefone() {
		System.out.println("------------------------------");
		System.out.println("Cadastrar usuarios: ");
		System.out.println("Telefone do usuario. Apenas letras maiusculas: ");
		user.setTelefone(ler.next());
		// validarTelefone();
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

		switch (opcao) {
			case 1:
				cadastrarNome();
				Usuario.usuario[ControlerLoging.indiceUser][0] = user.getNome();
				break;
			case 2:
				cadastrarEmail();
				Usuario.usuario[ControlerLoging.indiceUser][1] = user.getEmail();
				break;
			case 3:
				cadastrarRg();
				Usuario.usuario[ControlerLoging.indiceUser][2] = user.getRg();
				break;
			case 4:
				cadastrarCpf();
				Usuario.usuario[ControlerLoging.indiceUser][3] = user.getCpf();
				break;
			case 5:
				cadastrarSenha();
				Usuario.usuario[ControlerLoging.indiceUser][4] = user.getSenha();
				break;
			case 6:
				cadastrarTelefone();
				Usuario.usuario[ControlerLoging.indiceUser][5] = user.getTelefone();
				break;
			default:
				System.out.println("Opcao nao encontrada");
				break;
		}
	}
}