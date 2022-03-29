package controler;
import java.util.Scanner;

import models.*;

public class ControlerUsuarios {

		private Usuario user = new Usuario();
		private Pagamento p = new Pagamento();
		private int qtdUser=0;
		static 	int i = 0, j=0;
		static Scanner ler = new Scanner(System.in);
		
		public void CadastroUser() {
			//cadastrar nome
			cadastrarNome();
			Usuario.usuario[qtdUser][i] = user.getNome();
			i++;
			//cadastrar email
			cadastrarEmail();
			Usuario.usuario[qtdUser][i] = user.getEmail();
			i++;
			//cadastrar rg
			cadastrarRg();
			Usuario.usuario[qtdUser][i] = user.getRg();
			i++;
			//cadastrar cpf
			cadastrarCpf();
			Usuario.usuario[qtdUser][i] = user.getCpf();
			i++;
			//cadastrar senha
			cadastrarSenha();
			Usuario.usuario[qtdUser][i] = user.getSenha();
			i++;
			//cadastrar telefone
			cadastrarTelefone();
			Usuario.usuario[qtdUser][i] = user.getTelefone();
			qtdUser++;
			//Criar controler para os cruds, depois trazer os valores para
			//dentro do usuario, deixando codigo clean.
			i=0;
		}
		
		public void cadastrarNome() {
			System.out.println("------------------------------");
			System.out.println("Cadastrar usuarios: ");
			System.out.println("Nome do usuario. Apenas letras maiusculas: ");
			user.setNome(ler.next());
			validarNome();
		}
		
		public void validarNome() {
			System.out.println("Validando Nome");
		}
		
		public void cadastrarEmail() {
			System.out.println("------------------------------");
			System.out.println("Cadastrar usuarios: ");
			System.out.println("Email do usuario. Apenas letras maiusculas: ");
			user.setEmail(ler.next());
			validarEmail();
		}
		public void validarEmail() {
			System.out.println("Validando Email");
		}
		
		public void cadastrarRg() {
			System.out.println("------------------------------");
			System.out.println("Cadastrar usuarios: ");
			System.out.println("Rg do usuario. Apenas letras maiusculas: ");
			user.setRg(ler.next());
			validarRg();
		}
		public void validarRg() {
			System.out.println("Validando RG");
		}
		
		public void cadastrarCpf() {
			System.out.println("------------------------------");
			System.out.println("Cadastrar usuarios: ");
			System.out.println("CPF do usuario. Apenas letras maiusculas: ");
			user.setCpf(ler.next());
			validarCpf();
		}
		public void validarCpf() {
			System.out.println("Validando CPF");
		}
		
		public void cadastrarSenha() {
			System.out.println("------------------------------");
			System.out.println("Cadastrar usuarios: ");
			System.out.println("Senha do usuario. Apenas letras maiusculas: ");
			user.setSenha(ler.next());
			validarSenha();
		}
		public void validarSenha() {
			System.out.println("Validando Senha");
		}
		
		public void cadastrarTelefone() {
			System.out.println("------------------------------");
			System.out.println("Cadastrar usuarios: ");
			System.out.println("Telefone do usuario. Apenas letras maiusculas: ");
			user.setTelefone(ler.next());
			validarTelefone();
		}
		public void validarTelefone() {
			System.out.println("Validando Telefone");
		}
		
		
}
