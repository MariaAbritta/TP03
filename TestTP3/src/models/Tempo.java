package models;
import java.util.Scanner;

public class Tempo {
	private float minutosViagem;
	static Scanner ler = new Scanner(System.in);
	
	public Tempo() {
		super();
	}
	
	//sobrecarga
	public Tempo(float mV) {
		this.minutosViagem = mV;
	}
	
	//Gets and sets
	public float getMinutosViagem() {
		return minutosViagem;
	}

	public void setMinutosViagem(float minutosViagem) {
		this.minutosViagem = minutosViagem;
	}

	//metodos
	public void cadastroTempoDeViagem() {
		System.out.println("\nTempo em minutos que ira utilizar a bicicleta: ");
		setMinutosViagem(ler.nextFloat());
	}

	
	
}
