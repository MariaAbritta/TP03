package view;
import models.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Instancia do objeto
//		Bicicletario bicicletario = new Bicicletario();
//		Bicicleta bicicleta = new Bicicleta();
//		Tempo tempo = new Tempo();
//		Pagamento pagamento = new Pagamento();
		Usuario user = new Usuario();
//		Viagem viagem = new Viagem();
		Scanner resposta = new Scanner(System.in);
		
		//variaveis locais
		int opcaoMenu = 0;
		int opcaoMenuCadastro = 0;
		int opcaoMenusInternos = 0;
		boolean cadastrado = false;
		
		//verificar se o cadastro do user ta ativo
		verificarCadastro(opcaoMenuCadastro, cadastrado);
						
		//depois de cadastrado ter acesso aos menus
		do {
			mainMenu();
			opcaoMenu = resposta.nextInt();
			
			switch(opcaoMenu){
				case 1:
					menuUsuario();
					opcaoMenusInternos = resposta.nextInt();
					execOpcaoUser(opcaoMenusInternos, cadastrado);
					break;
				case 2:
					break;
			}
		}while(cadastrado != false);
		
		//chamar o codigo do inicio
		main(args);
		
	
	}
	
	//menus
	public static void menuCadastro() {
		System.out.print("|-------- App BikeAqui! -------|\n");
		System.out.print("| Opcao 1 - Cadastrar Usuario  |\n");
		System.out.print("| Opcao 2 - Fechar             |\n");
		System.out.print("|------------------------------|\n");
	}
	
	
	public static void mainMenu() {
		System.out.print("|-------- App BikeAqui! -------|\n");
		System.out.print("|------------------------------|\n");
		System.out.print("| Opcao 1 - Usuario            |\n");
		System.out.print("| Opcao 2 - Bicicletarios      |\n");
		System.out.print("| Opcao 3 - Bicicletas         |\n");
		System.out.print("| Opcao 4 - Tempo              |\n");
		System.out.print("| Opcao 5 - Viagem             |\n");
		System.out.print("| Opcao 6 - Pedido             |\n");
		System.out.print("| Opcao 7 - Pagamento          |\n");
		System.out.print("| Opcao 8 - Sair               |\n");
		System.out.print("|------------------------------|\n");
		System.out.print("Digite uma opcao:\n");
	}
	
	public static void menuUsuario() {
		System.out.print("|-------- App BikeAqui! -------|\n");
		System.out.print("|------------------------------|\n");
		System.out.print("|           Usuario            |\n");
		System.out.print("| Opcao 1 - Listar dados       |\n");
		System.out.print("| Opcao 2 - Editar dados       |\n");
		System.out.print("| Opcao 3 - Deletar conta      |\n");
		System.out.print("|------------------------------|\n");
	}
	
	//funcoes de valencia
	public static boolean verificarCadastro(int opcaoMenuCadastro,boolean cadastrado) {
		Scanner resposta = new Scanner(System.in);
		do {
			if(!cadastrado) {
				menuCadastro();
				opcaoMenuCadastro = resposta.nextInt();
				switch(opcaoMenuCadastro){
					case 1:
						//user.cadastrarUsuario();
						cadastrado = true;
						break;
					case 2:
						System.out.print("| Obrigado volte sempre!   |\n");
						System.exit(0);
						break;
					default:
						System.out.print("| Opcao nao encontrada!    |\n");
						break;
				}
			}
		}while(cadastrado!=true);
		return cadastrado;
	}
	
	
	
	
	public static void execOpcaoUser(int opcaoMenusInternos, boolean cadastrado){
		Usuario user = new Usuario();
		
		switch(opcaoMenusInternos) {
			case 1:
				user.listarUsuario();
				break;
			case 2:
				user.editarUsuario();
				break;
			case 3:
				user.deletarUsuario();
				cadastrado = false;
				verificarCadastro(0, cadastrado);
				break;
			default:
				System.out.print("| Opcao nao encontrada   |\n");
				break;
		}
	}

}
