package controller;

import models.Dados;
import models.Usuario;

public class ControllerLoging {

	public void loging() {

	}

	public static Usuario validarLogin(String login, String senha) {

		for (Usuario usr : Dados.getUsuarios()) {
			if (usr.getNome().equals(login) && usr.getSenha().equals(senha)) {
				return usr;
			}
		}
		return null;

	}
	
	public static Usuario validarBusca(String login) {

		for (Usuario usr : Dados.getUsuarios()) {
			if (usr.getNome().equals(login)) {
				return usr;
			}
		}
		return null;

	}
}
