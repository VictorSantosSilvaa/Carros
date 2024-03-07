package HotWeels;

public class Carro extends Veiculo {

	int numPortas;
	String tipocombustivel;
	
	

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public String getTipocombustivel() {
		return tipocombustivel;
	}

	public void setTipocombustivel(String tipocombustivel) {
		this.tipocombustivel = tipocombustivel;
	}

	@Override
	public void carro() {
		System.out.println("Numero de Portas: " + getNumPortas());
		System.out.println("Tipo de Combustivel: " + getTipocombustivel());
	}

}
