package models;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {
	private String nome = "";
	private String email = "";
	private String rg;
	private String cpf;
	private String senha;
	private String telefone;
	static public String[][] usuario = new String[50][50];
	static Scanner ler = new Scanner(System.in);
	
	public Usuario() {
		super();	
	}
	
	public Usuario(String n, String e,String r, String c, String s, String t) {
		nome = n;
		email = e;
		rg = r;
		cpf = c;
		senha = s;
		telefone = t;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}