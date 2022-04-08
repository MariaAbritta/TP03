package models;

import java.util.ArrayList;
/**
 * Recebe os dados gerais do usuário, além de editar esses dados.
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */
public class Usuario {
	private String nome;
	private String email;
	private String rg;
	private String cpf;
	private String senha;
	private String telefone;

	private static ArrayList<Cartao> cartoes = new ArrayList<>();

	public Usuario(String n, String e, String r, String c, String s, String t) {
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

	public String setNome(String nome) {
		return this.nome = nome;
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

	public static ArrayList<Cartao> getCartoes() {
		return cartoes;
	}

	/**
	 * Atualiza os dados existentes para os dados editados.
	 * @param nome, email, rg, cpf, senha, telefone
	 */
	public void editarDados(String nome, String email, String rg, String cpf, String senha, String telefone) {
		this.setNome(nome);
		this.setEmail(email);
		this.setRg(rg);
		this.setCpf(cpf);
		this.setSenha(senha);
		this.setTelefone(telefone);
	}

}