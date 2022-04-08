package controller;

import models.Dados;
import models.Usuario;

/**
 * Equipara se os dados fornecidos estão nos dados cadastrados de loging
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */



public class ControllerLoging {

	public void loging() {

	}
	
	/**
	 * Verifica se o nome e senha colocados no loging foram cadastrados
	 * @param nome e senha 
	 * @return nada, mas dentro o if ele "retorna" a liberação do usuario para o Usuario
	 */
	public static Usuario validarLogin(String login, String senha) {
		for (Usuario usr : Dados.getUsuarios()) {
			if (usr.getNome().equals(login) && usr.getSenha().equals(senha)) {
				return usr;
			}
		}
		return null;

	}
	
	/**
	 * Verifica se o nome colocado no loging foi cadastrado
	 * @param nome 
	 * @return retorna as informações do usuário encontrado caso ele for encontrado
	 */
	public static Usuario validarBusca(String login) {
		
		for (Usuario usr : Dados.getUsuarios()) {
			if (usr.getNome().equals(login)) {
				return usr;
			}
		}
		return null;

	}
}
