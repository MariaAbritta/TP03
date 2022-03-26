package view;
import models.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Instancia do objeto
//		Tempo tempo = new Tempo();

		Scanner resposta = new Scanner(System.in);
		
		//variaveis locais
		int opcaoMenu = 0;
		int opcaoMenuCadastro = 0;
		int opcaoMenusInternos = 0;
		boolean cadastrado = true;
		
		//Pagamento pagamento = new Pagamento();
		//pagamento.cadastrarPagamento();
		
		Usuario user = new Usuario();
		user.cadastrarUsuario();
		user.listarUsuario();
		
		/*//verificar se o cadastro do user ta ativo
		verificarCadastro(opcaoMenuCadastro, cadastrado);
						
		//depois de cadastrado ter acesso aos menus
		do {
			mainMenu();
			opcaoMenu = resposta.nextInt();
			resposta.nextLine();
			switch(opcaoMenu){
				case 1:
					menuUsuario();
					opcaoMenusInternos = resposta.nextInt();
					execUsuario(opcaoMenusInternos, cadastrado);
					break;
				case 2:
					menuBicicletario();
					opcaoMenusInternos = resposta.nextInt();
					execBicicletario(opcaoMenusInternos);
					break;
				case 3:
					menuBicicletas();
					opcaoMenusInternos = resposta.nextInt();
					clearBuffer(resposta);
					resposta.nextLine();
					execBicicletas(opcaoMenusInternos);
					break;
				case 4:
					menuViagem();
					opcaoMenusInternos = resposta.nextInt();
					execViagem(opcaoMenusInternos);
					break;
				case 6:
					menuPagamento();
					opcaoMenusInternos = resposta.nextInt();
					execPagamento(opcaoMenusInternos);
					break;
				case 7:
					System.out.println("Obrigado por usar o nosso App!\n"
							+ "- Maria Abritta\n"
							+ "- Thyago Moura\n");
					System.exit(0);
					cadastrado = false;
					break;
				default:
					System.out.println("Opcao invalida. Por favor, escolha uma\n"
							+ "opcaoo de 1 a 7, somente.\n");
			}
		}while(cadastrado != false);
		
		//chamar o codigo do inicio
		main(args);*/
		
	
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
		System.out.print("| Opcao 4 - Viagem             |\n");
		System.out.print("| Opcao 5 - Pedido             |\n");
		System.out.print("| Opcao 6 - Pagamento          |\n");
		System.out.print("| Opcao 7 - Sair               |\n");
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
	
	public static void menuBicicletario() {
		System.out.print("|-------- App BikeAqui! -------|\n");
		System.out.print("|------------------------------|\n");
		System.out.print("|          Bicicletario        |\n");
		System.out.print("| Opcao 1 - Listar Bicicletario|\n");
		System.out.print("| Opcao 2 - Buscar Bicicletario|\n");
		System.out.print("|------------------------------|\n");
	}
	
	public static void menuBicicletas() {
		System.out.print("|-------- App BikeAqui! -------|\n");
		System.out.print("|------------------------------|\n");
		System.out.print("|         Bicicletas           |\n");
		System.out.print("| Opcao 1 - Buscar Bicicletas  |\n");
		System.out.print("| Opcao 2 - Listar Bicicletas  |\n");
		System.out.print("|------------------------------|\n");
	}
	
	public static void menuViagem(){
		System.out.print("|-------- App BikeAqui! -------|\n");
		System.out.print("|------------------------------|\n");
		System.out.print("|           Viagem             |\n");
		System.out.print("| Opcao 1 - Cadastrar dados    |\n");
		System.out.print("| Opcao 2 - Listar dados       |\n");
		System.out.print("| Opcao 3 - Editar dados       |\n");
		System.out.print("| Opcao 4 - Deletar viagem     |\n");
		System.out.print("| Opcao 5 - Buscar viagem      |\n");
		System.out.print("|------------------------------|\n");
	}
	
	public static void menuPagamento(){
		System.out.print("|-------- App BikeAqui! -------|\n");
		System.out.print("|------------------------------|\n");
		System.out.print("|           Pagamento          |\n");
		System.out.print("| Opcao 1 - Cartao             |\n");
		System.out.print("| Opcao 2 - Listar dados       |\n");
		System.out.print("| Opcao 3 - Editar dados       |\n");
		System.out.print("| Opcao 4 - Deletar pagamento  |\n");
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
	
	
	//executar as opcoes do usuario
	public static void execUsuario(int opcaoMenusInternos, boolean cadastrado){
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
	
	public static void execBicicletario(int opcaoMenusInternos) {
		Bicicletario bicicletario = new Bicicletario();
		switch(opcaoMenusInternos) {
			case 1:
				bicicletario.listarBicicletario();
				break;
			case 2:
				bicicletario.buscarBicicletario();
				break;
			default:
				System.out.print("| Opcao nao encontrada   |\n");
				break;
		}
	}
	
	public static void execBicicletas(int opcaoMenusInternos) {
		Bicicleta bicicletas = new Bicicleta();
		switch(opcaoMenusInternos) {
			case 1:
				bicicletas.buscarBicicleta();
				break;
			case 2:
				bicicletas.listarBicicleta(); 
				break;
			default:
				System.out.print("| Opcao nao encontrada   |\n");
				break;
		}
	}
	
	public static void execViagem(int opcaoMenusInternos) {
		Viagem viagem = new Viagem();
		switch(opcaoMenusInternos) {
			case 1:
				viagem.cadastarViagem();
				break;
			case 2:
				viagem.listarViagem();
				break;
			case 3:
				viagem.editarViagem();
				break;
			case 4:
				viagem.deletarViagem();
				break;
			case 5:
				viagem.buscarViagem();
				break;
			default:
				System.out.print("| Opcao nao encontrada   |\n");
				break;
		}
	}
	
	public static void execPagamento(int opcaoMenusInternos) {
		Pagamento pagamento = new Pagamento();
		switch(opcaoMenusInternos) {
			case 1:
				pagamento.cadastrarPagamento();
				break;
			case 2:
				pagamento.listarPagamento();
				break;
			case 3:
				pagamento.editarPagamento();
				break;
			case 4:
				pagamento.deletarPagamento();
				break;
			default:
				System.out.print("| Opcao nao encontrada   |\n");
				break;
		}
	}
	
	 private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	 }

}
