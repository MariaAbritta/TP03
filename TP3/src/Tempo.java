
public class Tempo {
	
	private int inicioViagem;
	private int finalViagem;
	private int finalTotalViagem;
	
	public Tempo(int iV, int fV, int fTV) {
		inicioViagem = iV;
		finalViagem = fV;
		finalTotalViagem = fTV;
	}
	
	public int getInicioViagem() {
		return inicioViagem;
	}

	public void setInicioViagem(int inicioViagem) {
		this.inicioViagem = inicioViagem;
	}

	public int getFinalViagem() {
		return finalViagem;
	}

	public void setFinalViagem(int finalViagem) {
		this.finalViagem = finalViagem;
	}

	public int getFinalTotalViagem() {
		return finalTotalViagem;
	}

	public void setFinalTotalViagem(int finalTotalViagem) {
		this.finalTotalViagem = finalTotalViagem;
	}
	
}
