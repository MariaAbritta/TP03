package models;

public class Usuario {
	private String nome = "";
	private String email = "";
	private int rg;
	private int cpf;
	private int senha;
	private int telefone;
	private String lugar = "";
	
	public Usuario() {
		super();	
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

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Usuario(String n, String e,int r, int c, int s, int t, String l) {
		nome = n;
		email = e;
		rg = r;
		cpf = c;
		senha = s;
		telefone = t;
		lugar = l;
		
	}
}
