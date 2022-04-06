package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Bicicletario {
	// Atributos
	public String localidade;
	public String funcionamento;
	public int horarioCliente;
	private int disponibilidadeBicicletas;
	private int disponibilidadeBicicletasEco;
	public ArrayList<Bicicleta> bicicletas = new ArrayList<>();
	Bicicleta bicicleta = new Bicicleta(null, disponibilidadeBicicletas);


	public Bicicletario(String loc, String func) {
		this.localidade = loc;
		this.funcionamento = func;
		this.setDisponibilidadeBicicletas();
	}

	// Gets and sets
	public String getLocalidade() {
		localidade = "1 - Brasilia - Asa Sul - Parque da Cidade Dona Sarah Kubitschek\n"
				+ "2 - Brasilia - Aguas Claras - Parque Ecologico de Aguas Claras\n";
		return this.localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getFuncionamento() {
		return funcionamento;
	}

	public void setFuncionamento(String funcionamento) {
		this.funcionamento = funcionamento;
	}

	public int getDisponibilidadeBicicletas() {
		int cont = 0;
		for (Bicicleta bicicleta : this.getBicicletas()) {
			cont++;
		}

		return cont;
	}

	public void setDisponibilidadeBicicletas() {
		int cont = 0;
		for (Bicicleta bicicleta : this.getBicicletas()) {
			cont++;
		}
		this.disponibilidadeBicicletas = cont;
	}

	public ArrayList<Bicicleta> getBicicletas() {
		return bicicletas;
	}

	public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}
	
	public int getDisponibilidadeBicicletaSarah() {
		return disponibilidadeBicicletas;
	}

	public int setDisponibilidadeBicicletasSarah(int disponibilidadeBicicletasEco) {
		this.disponibilidadeBicicletas = disponibilidadeBicicletas;
		disponibilidadeBicicletas = bicicleta.BikesSarahUrb.length;
		return disponibilidadeBicicletas;
	}
	
	public int getDisponibilidadeBicicletaEco() {
		return disponibilidadeBicicletasEco;
	}

	public int setDisponibilidadeBicicletasEco(int disponibilidadeBicicletasEco) {
		this.disponibilidadeBicicletasEco = disponibilidadeBicicletasEco;
		disponibilidadeBicicletasEco = bicicleta.BikesEcoUrb.length;
		return disponibilidadeBicicletas;
	}

	// Metodos
	public void listarBicicletario() {
		System.out.println("Localidade: \n" + getLocalidade());
	}

	public String buscarBicicletario(String loc) {
		loc = "Qual bicicletario deseja buscar bicicletas?";
		return loc;
	}
	
	public boolean StatusFuncionamento(String hora){
		boolean verificar = true;
		System.out.println("Qual horario voce deseja ir ao bicicletario?: ");
		switch(hora) {
				case "6":
				case "7":
				case "8":
				case "9":
				case "10":
				case "11":
				case "12":
				case "13":
				case "14":
				case "15":
				case "16":
				case "17":
				case "18":
				case "19":
				case "20":
					verificar = false;
					break;
				default: 
					System.out.println("Hora inválida.");
					break;
			}
		return verificar;
	}
}
