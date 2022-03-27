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
	static Scanner ler = new Scanner(System.in);
	static String[][] usuario = new String[50][50]; 
	static 	int i = 0, j = 1;
	
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
				}else {
					validarNome = true;
				}
			}while(validarNome == false);
		}
		usuario[i][0] = respostaNome;
		i++;
		System.out.println("Na posicao " + i + " foi armazenado " + usuario[i][0]);
		
		/////////////////////////////////////////////////////////////
		System.out.println("E-mail do usuario: ");
		setEmail(ler.next());
		// Validacao do EMAIL de apenas letras:
		boolean validarEmail = true;
		String respostaEmail;
		respostaEmail = getEmail();
		if(!respostaEmail.substring(0).matches("(.*)@(.*)")){
			validarEmail = false;
			do {
				System.out.println("Erro! Um e-mail precisa ter @. \n"
						+ "Insira um e-mail valido: ");
				setEmail(ler.next());
				respostaEmail = getEmail();
				if(!respostaEmail.substring(0).matches("(.*)@(.*)")){
					validarEmail = false;
				}
				else {
					validarEmail=true;
				}
			}while(validarEmail == false);
		}
		int b = 0;
		String valorBuscado = respostaEmail;
		String Total = " ";
		Boolean palavraIgual;
		int contador = 0;
		
		for (int a = 0; a < usuario.length; a++) {		
			if (valorBuscado.equals(usuario[a][0])) {
				b = a;
			}
		}
		
		if(JaExiste(usuario, respostaEmail, j)) {
			System.out.println("Essa e-mail j� existe.\n");
		}else {
			if (respostaEmail.equals(Total)) {
				palavraIgual = true; //Nome repetido
			}else {
				int indice = BuscarIndiceUltima(b);
				if(indice > 51) {
					System.out.println("lotado.");
				}else {
					usuario[b][indice] = respostaEmail; // Se nao for repetido irei armazenar
					System.out.println("Na posicao " + indice + " foi armazenado " + usuario[b][indice]);
					contador++;
					j++;
				}
			}
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
				else {
					validarRG = true;
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
		for (int a = 0; a < usuario.length; a++) {		
			if (valorBuscado.equals(usuario[a][0])) {
				b = a;
			}
		}
		if(JaExiste(usuario, respostaRG, j)) {
			System.out.println("Essa RG j� existe.\n");
		}else {
			if (respostaRG.equals(Total)) {
				palavraIgual = true; //Nome repetido
			}else {
				int indice = BuscarIndiceUltima(b);
				if(indice > 51) {
					System.out.println("lotado.");
				}else {
					usuario[b][indice] = respostaRG; // Se nao for repetido irei armazenar
					System.out.println("Na posicao " + indice + " foi armazenado " + usuario[b][indice]);
					contador++;
					j++;
				}
			}
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
				else {
					validarCPF = true;
				}
			}while(validarCPF == false);
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
				else {
					validarCPF = true;
				}
			}while(validarCPF == false);
		}
		for (int a = 0; a < usuario.length; a++) {		
			if (valorBuscado.equals(usuario[a][0])) {
				b = a;
			}
		}
		if(JaExiste(usuario, respostaCPF, j)) {
			System.out.println("Essa CPF j� existe.\n");
		}else {
			if (respostaCPF.equals(Total)) {
				palavraIgual = true; //Nome repetido
			}else {
				int indice = BuscarIndiceUltima(b);
				if(indice > 51) {
					System.out.println("lotado.");
				}else {
					usuario[b][indice] = respostaCPF; // Se nao for repetido irei armazenar
					System.out.println("Na posicao " + indice + " foi armazenado " + usuario[b][indice]);
					contador++;
					j++;
				}
			}
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
				if(respostaSenha.length() != 7){
					validarSenha = false;
				}
				else {
					validarSenha = true;
				}
			}while(validarSenha == false);
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
				else {
					validarSenha = true;
				}
			}while(validarSenha == false);
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
				else {
					validarSenha = true;
				}
			}while(validarSenha == false);
		}
		for (int a = 0; a < usuario.length; a++) {		
			if (valorBuscado.equals(usuario[a][0])) {
				b = a;
			}
		}
		if(JaExiste(usuario, respostaSenha, j)) {
			System.out.println("Essa senha esta muito fraca.\n");
		}else {
			if (respostaSenha.equals(Total)) {
				palavraIgual = true; //Nome repetido
			}else {
				int indice = BuscarIndiceUltima(b);
				if(indice > 51) {
					System.out.println("lotado.");
				}else {
					usuario[b][indice] = respostaSenha; // Se nao for repetido irei armazenar
					System.out.println("Na posicao " + indice + " foi armazenado " + usuario[b][indice]);
					contador++;
					j++;
				}
			}
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
				else {
					validarTel = true;
				}
			}while(validarTel == false);
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
				else {
					validarTel = true;
				}
			}while(validarTel == false);
		}
		for (int a = 0; a < usuario.length; a++) {		
			if (valorBuscado.equals(usuario[a][0])) {
				b = a;
			}
		}
		if(JaExiste(usuario, respostaTel, j)) {
			System.out.println("Esse telefone ja existe.\n");
		}else {
			if (respostaTel.equals(Total)) {
				palavraIgual = true; //Nome repetido
			}else {
				int indice = BuscarIndiceUltima(b);
				if(indice > 51) {
					System.out.println("lotado.");
				}else {
					usuario[b][indice] = respostaTel; // Se nao for repetido irei armazenar
					System.out.println("Na posicao " + indice + " foi armazenado " + usuario[b][indice]);
					contador++;
					j++;
				}
			}
		}
		/////////////////////////////////////////////////////////////
		i++;
		System.out.println("------------------------------");
	}
	
	public void editarUsuario() {
		System.out.println("Editar Usuario\n");
		System.out.println("Qual Usuario deseja editar\n");
		String editar;
		boolean encontrado = false;
		int f;
		int opcaoEditar=0;
		editar = ler.next();
		for (f = 0; f < (i-1); f++){
            if(usuario[f][0].equals(editar)) {
            	encontrado = true;
            	break;
            }
		}
		if(encontrado) {
			System.out.println("O que deseja editar? \n");
			System.out.println("1.Nome \n");
			System.out.println("2.Email \n");
			System.out.println("3.Rg \n");
			System.out.println("4.CPF \n");
			System.out.println("5.Senha\n");
			System.out.println("6.Telefone \n");
			opcaoEditar = ler.nextInt();
			switch(opcaoEditar) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
									
			}
		}else {
			System.out.println("Usuario nao encontrado!\n");
			encontrado = false;
		}
	}
	
	public void deletarUsuario() {
		System.out.println("Deletar Usuario\n");
		System.out.println("Qual Usuario deseja deletar\n");
		String deletar;
		boolean encontrado = false;
		int f;
		deletar = ler.next();
		for (f = 0; f < (i-1); f++){
            if(usuario[f][0].equals(deletar)) {
            	encontrado = true;
            	break;
            }
		}
		if(encontrado) {
			for(int g = 0; g < j; g++){
				usuario[f][g] = null;
				System.out.println("DELETANDO...\n");
			}
		}else {
			System.out.println("Usuario nao encontrado!\n");
			encontrado = false;
		}
	}
	
	public void listarUsuario() {
		System.out.println("------------------------------");
		System.out.println("Informa��es do usuario: ");
		System.out.println("Digite o nome do usuario que procura: ");
		Boolean nomeExiste = false;	
		String buscar;
		int unir = 0;
		buscar = ler.next();
		
		for (int f = 0; f < (i-1); f++){
            if(usuario[f][0].equals(buscar)) {
            	System.out.print("Esse nome foi cadastrado.\n");
              	nomeExiste = true;
              	unir = f;
              	break;	
            }
		}
		if(!nomeExiste){
            System.out.print("Esse nome ainda n�o foi cadastrado.\n");
        }
		else if(nomeExiste){
            System.out.println("Tema: "+ usuario[unir][0]+"\n"); //ERRO NA LISTAGEM DO PRIMEIRO TEMA!!!!!!!!!
            for(int a = 1; a < 50; a++){
                if(usuario[unir][a] != null){
                    System.out.println("- " + usuario[unir][a]);
                    System.out.println(" ");
                }
            }
        }
		System.out.println("------------------------------");
	}
	
	public static Boolean NomeJaExiste(String nomes[][], String pesquisa, int i) {
		for (int c = 0; c < i; c++) { // Vetor que passa por todos os temas cadastrados ate o momento
			if (nomes[c][0].equals(pesquisa)) { // Verifico se o tema ja foi registrado antes
				return true;
			}
		}
		return false;
	}
	
	public static Boolean JaExiste(String temas[][], String pesquisa, int j) {
		for(int i = 0; i < temas.length ; i++) {
            for(int a = 0; a < temas[i].length ; a++) {
                if(temas[i][a] != null && temas[i][a].equals(pesquisa)) {
                   return true;
                }
            }
        }
		return false;
	}
	
	public static int BuscarIndiceUltima(int i) {
		int retorno = 99;
		for(int a = 0; a < usuario[i].length; a++) {
			if(usuario[i][a] == null) {
				retorno = a;
				break;
			}
		}
		return retorno;
	}
	
	
}
