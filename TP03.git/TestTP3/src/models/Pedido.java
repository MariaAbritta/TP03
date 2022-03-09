package models;

public abstract class Pedido {
	private Usuario usuario;
	private Viagem viagem;
	
	public Pedido(Usuario user, Viagem via) {
		usuario = user;
		viagem = via;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
}
