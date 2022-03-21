package view;
import models.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Instancia do objeto
		Bicicletario bicicletario = new Bicicletario();
		Bicicleta bicicleta = new Bicicleta();
		Pagamento pagamento = new Pagamento();
		Usuario user = new Usuario();
		Viagem viagem = new Viagem();
		int opcaoMenuInicial = 0;
		Scanner resposta = new Scanner(System.in);
		
		
		bicicleta.buscarBicicleta();
		
		/*do {
			opcaoMenuInicial = Menu(opcaoMenuInicial, resposta);
			switch(opcaoMenuInicial){
				case 1:
					System.out.println("Usuario: \n");
					user.cadastrarUsuario();
					user.editarUsuario();
					user.deletarUsuario();
					user.listarUsuario();
					break;
				case 2:
					System.out.println("Bicicletarios: \n");
					bicicletario.listarBicicletario();
					bicicletario.buscarBicicletario();
					break;
				case 3: 
					System.out.println("Bicicletas: \n");
					bicicleta.buscarBicicleta();
					bicicleta.listarBicicleta();
					break;
				case 4:
					System.out.println("Viagem: \n");
					viagem.cadastarViagem();
					viagem.buscarViagem();
					viagem.deletarViagem();
					viagem.editarViagem();
					viagem.listarViagem();
					break;
				case 5:
					System.out.println("Pedido\n");
					break;
				case 6:
					System.out.println("Pagamento: \n");
					pagamento.cadastrarPagamento();
					pagamento.editarPagamento();
					pagamento.deletarPagamento();
					pagamento.listarPagamento();
					break;
				case 7:
					System.out.println("Obrigado por usar o nosso App!\n"
							+ "- Maria Abritta\n"
							+ "- Thyago Moura\n");
					break;
				default:
					System.out.println("Opcao invalida. Por favor, escolha uma\n"
							+ "opcaoo de 1 a 7, somente.\n");
				
			}
		}while (opcaoMenuInicial != 8);
	}
	
	public static int Menu(int opcaoMenuInicial, Scanner resposta) {
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
		opcaoMenuInicial = resposta.nextInt();
		return opcaoMenuInicial;*/
	}
	
}
