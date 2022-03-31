package controler;

import java.util.Scanner;

import models.Usuario;

public class ControlerLoging {
	static Scanner ler = new Scanner(System.in);
	private Usuario u = new Usuario();
	public static int indiceUser;
	private ControlerUsuarios controlerU = new ControlerUsuarios(); 
	private String userLogin;
	private String userPassword;
	private boolean verificador;
	
	public void loging() {
		System.out.println("Login\n");
		System.out.println(Usuario.usuario[0][0]);
		System.out.println("Nome: \n");
		userLogin = ler.next();
		System.out.println("Senha: \n");
		userPassword = ler.next();
		verificador = validarLogin();
	}
	
	public boolean validarLogin() {
		
		verificador = validarNome();
		if(verificador) {
			verificador = validarSenha();
			if(verificador) {
				System.out.println("Sucesso no login\n");
				return true;
			}
			else {
				System.out.println("Senha invalida\n");
				return false;
			}
		}
		else {
			System.out.println("Nome invalido\n");
			return false;
		}
		
	}
	
	public boolean validarNome() {
		
		for(int i = 0; i <= ControlerUsuarios.qtdUser; i++) {
			if(Usuario.usuario[i][0].equals(userLogin)) {
				indiceUser = i;
				return true;
			}
		}
		return verificador;
	}
	
	public boolean validarSenha() {
		for(int i = 0; i < 50; i++) {
			if(Usuario.usuario[indiceUser][i] != null && Usuario.usuario[indiceUser][i].equals(userPassword)) {
				return true;
			}
		}
		return false;
	}
}
