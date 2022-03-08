package models;
import java.util.Scanner;

public class Tempo {
	private int minutosViagem;
	static Scanner ler = new Scanner(System.in);
	
	public Tempo() {
		super();
	}
	
	//sobrecarga
	public Tempo(int mV) {
		this.minutosViagem = mV;
	}
	
	//Gets and sets
	public float getMinutosViagem() {
		return minutosViagem;
	}

	public void setMinutosViagem(int minutosViagem) {
		this.minutosViagem = minutosViagem;
	}

	//metodos
	public void cadastroTempoDeViagem() {
		System.out.println("\nTempo em minutos que ira utilizar a bicicleta: ");
		setMinutosViagem(ler.nextInt());
	}
	public void editarTempoDeViagem() {
		System.out.println("\nEditar Tempo em minutos: ");
		setMinutosViagem(ler.nextInt());
	}
	
	public void deletarTempoDeViagem() {
		System.out.println("\nDeletar Tempo em minutos: ");
		setMinutosViagem(0);
		
	}
	
	public void listarTempoDeViagem() {
		System.out.println("\nListar Tempo em minutos: \n" + getMinutosViagem());
	}
	
}
