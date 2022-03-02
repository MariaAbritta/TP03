
public class Bicicletario {
	
	private String loc = "";
	private String funcionamento = "";
	private Bicicleta[] bike = new Bicicleta[100];
	private int numBicicleta = 0;
	
	public Bicicletario(String l, String f, int nB) {
		loc = l;
		funcionamento = f;
		numBicicleta = nB;
		//Falta bike
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getFuncionamento() {
		return funcionamento;
	}

	public void setFuncionamento(String funcionamento) {
		this.funcionamento = funcionamento;
	}

	public Bicicleta[] getBike() {
		return bike;
	}

	public void setBike(Bicicleta[] bike) {
		this.bike = bike;
	}
			
}
