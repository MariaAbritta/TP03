package models;

import java.util.Scanner;

public class Usuario {
	private String nome = "";
	private String email = "";
	private int rg;
	private int cpf;
	private int senha;
	private int telefone;
	static Scanner ler = new Scanner(System.in);
	
	public Usuario() {
		super();	
	}
	
	public Usuario(String n, String e,int r, int c, int s, int t) {
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
	
	//metodos
	public void cadastrarUsuario() {
		System.out.println("Cadastrar usuarios: \n");
		
		System.out.println("Nome do usuarios: \n");
		setNome(ler.next());
		System.out.println("\nEmail do usuarios: \n");
		setEmail(ler.next());
		System.out.println("\nRG do usuarios: \n");
		setRg(ler.nextInt());
		System.out.println("\nCPF do usuarios, apenas numeros!: \n");
		setCpf(ler.nextInt());
		System.out.println("\nSenha do usuarios, apenas numero!: \n");
		setSenha(ler.nextInt());
		System.out.println("\nTelefone do usuarios, apenas numero!: \n");
		setTelefone(ler.nextInt());	
	}
	
	public void editarUsuario() {
		System.out.println("Editar usuario\n");
		
		System.out.println("Nome do usuarios: \n");
		setNome(ler.next());
		System.out.println("\nEmail do usuarios: \n");
		setEmail(ler.next());
		System.out.println("\nRG do usuarios: \n");
		setRg(ler.nextInt());
		System.out.println("\nCPF do usuarios, apenas numeros!: \n");
		setCpf(ler.nextInt());
		System.out.println("\nSenha do usuarios, apenas numero!: \n");
		setSenha(ler.nextInt());
		System.out.println("\nTelefone do usuarios, apenas numero!: \n");
		setTelefone(ler.nextInt());	
	}
	
	public void deletarUsuario() {
		System.out.println("Deletando usuario...\n");
		
		setNome("");
		setEmail("");
		setRg(0);
		setCpf(0);
		setSenha(0);
		setTelefone(0);	
	}
	
	public void listarUsuario() {
		System.out.println("Informações do usuario: \n");
		
		System.out.println("Nome: \n" + getNome());
		System.out.println("Email: \n" + getEmail());
		System.out.println("Rg: \n" + getRg());
		System.out.println("Cpf: \n" + getCpf());
		System.out.println("Senha: \n" + getSenha());
		System.out.println("Telefone: \n" + getTelefone());
	}
	
	
}
