package models;

import java.util.Scanner;

public class Usuario {
	private String nome = "";
	private String email = "";
	private String rg;
	private String cpf;
	private String senha;
	private String telefone;
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
	
	//metodos
	public void cadastrarUsuario() {
		System.out.println("------------------------------");
		System.out.println("Cadastrar usuarios: ");
		System.out.println("Nome do usuario. Apenas letras maiusculas: ");
		setNome(ler.next());
		// Validacao do NOME de apenas letras:
		boolean validarNome = true;
		String respostaNome;
		respostaNome = getNome();
		if(!respostaNome.substring(0).matches("[A-Z]*")){
			validarNome = false;
			do {
				System.out.println("Erro! Um nome precisa ter letras maiusculas. \n"
						+ "Insira um nome valido: ");
				setNome(ler.next());
				respostaNome = getNome();
				if(!respostaNome.substring(0).matches("[A-Z]*")){
					validarNome = false;
				}
			}while(validarNome == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("E-mail do usuario: ");
		setEmail(ler.next());
		// Validacao do EMAIL de apenas letras:
		boolean validarEmail = true;
		String respostaEmail;
		respostaEmail = getEmail();
		if(!respostaEmail.substring(0).matches("[@]*")){
			validarEmail = false;
			do {
				System.out.println("Erro! Um e-mail precisa ter @. \n"
						+ "Insira um e-mail valido: ");
				setEmail(ler.next());
				respostaEmail = getEmail();
				if(!respostaEmail.substring(0).matches("[@]*")){
					validarEmail = false;
				}
			}while(validarEmail == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("RG do usuario, apenas numeros!: ");
		setRg(ler.next());
		// Validacao do RG de quantidade certa de numeros e apenas numeros:
		boolean validarRG = true;
		String respostaRG;
		respostaRG = getRg();
		if(respostaRG.length() != 7){
			validarRG = false;
			do {
				System.out.println("Erro! Um RG possui 7 numeros. Insira um RG valido:");
				setRg(ler.next());
				respostaRG = getRg();
				if(respostaRG.length() != 7){
					validarRG = false;
				}
			}while(validarRG == false);
		}
		if(!respostaRG.substring(0).matches("[0-9]*")){
			validarRG = false;
			do {
				System.out.println("Erro! Um RG possui apenas numeros. Insira um RG valido:");
				setRg(ler.next());
				respostaRG = getRg();
				if(!respostaRG.substring(0).matches("[0-9]*")){
					validarRG = false;
				}
			}while(validarRG == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("CPF do usuario, apenas numeros!:");
		setCpf(ler.next());
		// Validacao do CPF de quantidade certa de numeros e apenas numeros:
		boolean validarCPF = true;
		String respostaCPF;
		respostaCPF = getCpf();
		if(respostaCPF.length() != 11){
			validarCPF = false;
			do {
				System.out.println("Erro! Um CPF possui 11 numeros. Insira um CPF valido: ");
				setCpf(ler.next());
				respostaCPF = getCpf();
				if(respostaCPF.length() != 11){
					validarCPF = false;
				}
			}while(validarCPF = false);
		}
		if(!respostaCPF.substring(0).matches("[0-9]*")){
			validarCPF = false;
			do {
				System.out.println("Erro! Um CPF possui apenas numeros. Insira um CPF valido: ");
				setCpf(ler.next());
				respostaCPF = getCpf();
				if(!respostaCPF.substring(0).matches("[0-9]*")){
					validarCPF = false;
				}
			}while(validarCPF == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("Senha do usuario. A senha deve conter inicialmente \n"
				+ "3 letras maiusculas e no final 4 numeros:");
		setSenha(ler.next());
		// Validacao da SENHA de quantidade certa de letras e numeros:
		boolean validarSenha = true;
		String respostaSenha;
		respostaSenha = getSenha();
		if(respostaSenha.length() != 7){
			validarSenha = false;
			do {
				System.out.println("Erro! Uma senha deve ter tamanho de 7 caracteres. \n"
						+ "Insira uma senha valida:");
				setSenha(ler.next());
				respostaSenha = getSenha();
				if(respostaSenha.length() != 11){
					validarSenha = false;
				}
			}while(validarSenha = false);
		}
		if(!respostaSenha.substring(0, 3).matches("[A-Z]*")){
			validarSenha = false;
			do {
				System.out.println("Erro! Uma senha precisa inicialmente ter 3 letras maiusculas. \n"
						+ "Insira uma senha valida: ");
				setSenha(ler.next());
				respostaSenha = getSenha();
				if(!respostaSenha.substring(0, 3).matches("[A-Z]*")){
					validarSenha = false;
				}
			}while(validarSenha = false);
		}
		if(!respostaSenha.substring(3).matches("[0-9]*")){
			validarSenha = false;
			do {
				System.out.println("Erro! Uma senha precisa ter 4 numeros em seu final. \n"
						+ "Insira uma senha valida:");
				setSenha(ler.next());
				respostaSenha = getSenha();
				if(!respostaSenha.substring(3).matches("[0-9]*")){
					validarSenha = false;
				}
			}while(validarSenha == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("Telefone do usuarios, apenas numero!: ");
		setTelefone(ler.next());	
		// Validacao do TELEFONE de quantidade certa de numeros e apenas numeros:
		boolean validarTel = true;
		String respostaTel;
		respostaTel = getTelefone();
		if(respostaTel.length() != 9){
			validarTel = false;
			do {
				System.out.println("Erro! Um telefone possui 9 numeros. \n"
						+ "Insira um telefone valido: ");
				setTelefone(ler.next());
				respostaTel = getTelefone();
				if(respostaTel.length() != 9){ //ERRO: Ta indo com 8 
					validarTel = false;
				}
			}while(validarTel = false);
		}
		if(!respostaTel.substring(0).matches("[0-9]*")){
			validarTel = false;
			do {
				System.out.println("Erro! Um telefone possui apenas numeros.\n "
						+ "Insira um telefone valido:");
				setTelefone(ler.next());
				respostaTel = getTelefone();
				if(!respostaTel.substring(0).matches("[0-9]*")){
					validarTel = false;
				}
			}while(validarTel == false);
		}
		/////////////////////////////////////////////////////////////
		System.out.println("------------------------------");
	}
	
	public void editarUsuario() {
		System.out.println("Editar usuario\n");
		
		System.out.println("Nome do usuarios: \n");
		setNome(ler.next());
		System.out.println("\nEmail do usuarios: \n");
		setEmail(ler.next());
		System.out.println("\nRG do usuarios: \n");
		setRg(ler.next());
		System.out.println("\nCPF do usuarios, apenas numeros!: \n");
		setCpf(ler.next());
		System.out.println("\nSenha do usuarios, apenas numero!: \n");
		setSenha(ler.next());
		System.out.println("\nTelefone do usuarios, apenas numero!: \n");
		setTelefone(ler.next());	
	}
	
	public void deletarUsuario() {
		System.out.println("Deletando usuario...\n");
		
		setNome("");
		setEmail("");
		setRg("");
		setCpf("");
		setSenha("");
		setTelefone("");	
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
