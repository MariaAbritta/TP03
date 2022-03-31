package controler;
import java.util.Scanner;

import models.*;

public class ControlerUsuarios {

		private Usuario user = new Usuario();
//		private ControlerLoging controlLog = new ControlerLoging();
		public static int qtdUser=0;
		static 	int i = 0, j=0;
		static Scanner ler = new Scanner(System.in);
		
		public void CadastroUser() {
			cadastroUsuario();
		}
		
		public void cadastroUsuario() {
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
			boolean verificar = true;
			System.out.println("Validando Nome");
			String nomeValid = user.getNome();
			if(!nomeValid.substring(0).matches("[A-Z]*")) {
				verificar=false;
				do {
					System.out.println("Erro! Um nome precisa ter letras maiusculas. \n"
							+ "Insira um nome valido: ");
					user.setNome(ler.next());
					nomeValid = user.getNome();
					if(!nomeValid.substring(0).matches("[A-Z]*")){
						verificar = false;
					}else {
						verificar = true;
					}
				}while(verificar == false);
			}
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
			boolean verificar = true;
			String emailValid = user.getEmail();
			if(!emailValid.substring(0).matches("(.*)@(.*)")){
				verificar = false;
				do {
					System.out.println("Erro! Um e-mail precisa ter @. \n"
							+ "Insira um e-mail valido: ");
					user.setEmail(ler.next());
					emailValid = user.getEmail();
					if(!emailValid.substring(0).matches("(.*)@(.*)")){
						verificar = false;
					}
					else {
						verificar=true;
					}
				}while(verificar == false);
			}
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
			boolean verificar = true;
			String rgValid = user.getRg();
			if(rgValid.length() != 7){
				verificar = false;
				do {
					System.out.println("Erro! Um RG possui 7 numeros. Insira um RG valido:");
					user.setRg(ler.next());
					rgValid = user.getRg();
					if(rgValid.length() != 7){
						verificar = false;
					}
					else {
						verificar = true;
					}
				}while(verificar == false);
			}
			if(!rgValid.substring(0).matches("[0-9]*")){
				verificar = false;
				do {
					System.out.println("Erro! Um RG possui apenas numeros. Insira um RG valido:");
					user.setRg(ler.next());
					rgValid = user.getRg();
					if(!rgValid.substring(0).matches("[0-9]*")){
						verificar = false;
					}
				}while(verificar == false);
			}
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
			boolean verificar= true;
			String cpfValid = user.getCpf();
			if(cpfValid.length() != 11){
				verificar = false;
				do {
					System.out.println("Erro! Um CPF possui 11 numeros. Insira um CPF valido: ");
					user.setCpf(ler.next());
					cpfValid = user.getCpf();
					if(cpfValid.length() != 11){
						verificar = false;
					}
					else {
						verificar = true;
					}
				}while(verificar == false);
			}
			if(!cpfValid.substring(0).matches("[0-9]*")){
				verificar = false;
				do {
					System.out.println("Erro! Um CPF possui apenas numeros. Insira um CPF valido: ");
					user.setCpf(ler.next());
					cpfValid = user.getCpf();
					if(!cpfValid.substring(0).matches("[0-9]*")){
						verificar = false;
					}
					else {
						verificar = true;
					}
				}while(verificar == false);
			}
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
			boolean verificar = true;
			String senhaValid = user.getSenha();
			if(senhaValid.length() != 7){
				verificar = false;
				do {
					System.out.println("Erro! Uma senha deve ter tamanho de 7 caracteres. \n"
							+ "Insira uma senha valida:");
					user.setSenha(ler.next());
					senhaValid = user.getSenha();
					if(senhaValid.length() != 7){
						verificar = false;
					}
					else {
						verificar = true;
					}
				}while(verificar == false);
			}
			if(!senhaValid.substring(0, 3).matches("[A-Z]*")){
				verificar = false;
				do {
					System.out.println("Erro! Uma senha precisa inicialmente ter 3 letras maiusculas. \n"
							+ "Insira uma senha valida: ");
					user.setSenha(ler.next());
					senhaValid = user.getSenha();
					if(!senhaValid.substring(0, 3).matches("[A-Z]*")){
						verificar = false;
					}
					else {
						verificar = true;
					}
				}while(verificar == false);
			}
			if(!senhaValid.substring(3).matches("[0-9]*")){
				verificar = false;
				do {
					System.out.println("Erro! Uma senha precisa ter 4 numeros em seu final. \n"
							+ "Insira uma senha valida:");
					user.setSenha(ler.next());
					senhaValid = user.getSenha();
					if(!senhaValid.substring(3).matches("[0-9]*")){
						verificar = false;
					}
					else {
						verificar = true;
					}
				}while(verificar == false);
			}
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
			boolean verificar = true;
			String telValid = user.getTelefone();
			if(telValid.length() != 9){
				verificar = false;
				do {
					System.out.println("Erro! Um telefone possui 9 numeros. \n"
							+ "Insira um telefone valido: ");
					user.setTelefone(ler.next());
					telValid = user.getTelefone();
					if(telValid.length() != 9){ 
						verificar = false;
					}
					else {
						verificar = true;
					}
				}while(verificar == false);
			}
			if(!telValid.substring(0).matches("[0-9]*")){
				verificar = false;
				do {
					System.out.println("Erro! Um telefone possui apenas numeros.\n "
							+ "Insira um telefone valido:");
					user.setTelefone(ler.next());
					telValid = user.getTelefone();
					if(!telValid.substring(0).matches("[0-9]*")){
						verificar = false;
					}
					else {
						verificar = true;
					}
				}while(verificar == false);
			}
		}
		
		public void listarUsuario() {
			for(int x = 0; x <= 6 ; x++) {
				if(Usuario.usuario[ControlerLoging.indiceUser][x] != null) {
					System.out.println(x + ". " + Usuario.usuario[ControlerLoging.indiceUser][x]);
				}
			}
		}
		
		public void deletarUsuario() {
			System.out.println("Deseja excluir usuario??");
			System.out.println("1.SIM \n 2.NAO");
			int confirmar =0;
			confirmar = ler.nextInt();
			
			switch(confirmar){
				case 1:
					for(int x = 0; x <= 6 ; x++) {
						if(Usuario.usuario[ControlerLoging.indiceUser][x] != null) {
							Usuario.usuario[ControlerLoging.indiceUser][x] = null;
							System.out.println(x + ". " + Usuario.usuario[ControlerLoging.indiceUser][x]);
						}
					}
					System.out.println("Deletado...	 ");
					break;
				case 2:
					System.out.println("Ta baum");
					break;
				default:
					System.out.println("Nao tem essa opção");
					break;
			}
			
		}
		
}
