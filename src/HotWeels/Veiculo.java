package HotWeels;

import java.util.List;

public class Veiculo {
	private String marca;
	private int anoModelo;

	// listas de carro
	private static final List<String> listaModelosCarros = List.of("Lamborghini", "Aston Martin", "Ferrari", "Bugatti",
			"Rolls Royce", "BMW", "Volvo", "Mercedes-Benz", "Porsche", "Land Rover", "Audi");

	public static void verListaModelosCarros() {
		for (String modeloCarro : listaModelosCarros) {
			System.out.println(modeloCarro);
		}
	}

	// listas de moto

	private static final List<String> listaModelosMotos = List.of("Ducati Diavel 1260 S",
			"Harley-Davidson American Touring Ultra Limited", "Honda GL 1800 Gold Wing Tour", "BMW K 1600 B",
			"MV Agusta Rush 1000");

	public static void verListaModelosMotos() {
		for (String modeloMoto : listaModelosMotos) {
			System.out.println(modeloMoto);
		}
	}

	public String getMarca() {

		return marca;
	}

	// Marca para carro e moto
	public void setMarca(String marca) {
		// carro
		if (listaModelosCarros.contains(marca)) {
			this.marca = marca;
		} else if (listaModelosMotos.contains(marca)) {
			this.marca = marca;
		} else {
			System.err.println("Marca inválida");
		}
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {

		if (anoModelo >= 2020) {
			this.anoModelo = anoModelo;
		} else {
			System.err.println("Ano inválido... Digite novamente.");
		}
	}
}
