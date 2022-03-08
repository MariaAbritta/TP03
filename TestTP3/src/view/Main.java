package view;
import models.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("!!!!!!!!!!!");
		
		//Instancia do objeto
		Bicicletario bicicletario = new Bicicletario();
		Bicicleta bicicleta = new Bicicleta();
		Tempo tempo = new Tempo();
		Pagamento pagamento = new Pagamento();
		
		//Metodos 
		System.out.println("\nBicicletarios: \n");
		bicicletario.listarBicicletario();
		bicicletario.buscarBicicletario();
		
		System.out.println("\nBicicletas: \n");
		bicicleta.listarBicicleta();
		bicicleta.buscarBicicleta();
		
		System.out.println("\nTempo: \n");
		tempo.cadastroTempoDeViagem();
		tempo.editarTempoDeViagem();
		tempo.deletarTempoDeViagem();
		tempo.listarTempoDeViagem();
		
		System.out.println("\nPagamento: \n");
		pagamento.cadastrarPagamento();
		pagamento.editarPagamento();
		pagamento.deletarPagamento();
		pagamento.listarPagamento();
	}
	
}
