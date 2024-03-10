package HotWeels;

public class Carro extends Veiculo {

	int numPortas;
	String tipocombustivel;

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {

		if (numPortas >= 2 && numPortas <= 6) {
			this.numPortas = numPortas;
		} else {
			System.err.println("Numero de portas invalídas. Digite novamente.");
		}
	}

	public String getTipocombustivel() {
		return tipocombustivel;
	}

	public void setTipocombustivel(String tipocombustivel) {
		if (tipocombustivel.equals("Gasolina") || tipocombustivel.equals("Diesel")) {
			this.tipocombustivel = tipocombustivel;
		} else if (tipocombustivel.equals("gasolina") || tipocombustivel.equals("diesel")) {
			this.tipocombustivel = tipocombustivel;
		} else {
			System.out.println("Tipo de combustivel inválido.");
		}
	}

}
