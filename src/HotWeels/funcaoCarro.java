package HotWeels;

import java.util.ArrayList;
import java.util.Scanner;

public class funcaoCarro {

	// Funções de carro
	public static void carro(ArrayList<Carro> carros) {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();

		do {
			System.out.println("");
			System.out.println("Escolha a marca do carro");
			System.out.println("");
			Veiculo.verListaModelosCarros();
			System.out.println("");
			System.out.print("Digite:");
			System.out.println("");
			carro.setMarca(sc.next());
		} while (carro.getMarca() == null);

		do {
			System.out.println("");
			System.out.println("Ano do carro");
			System.out.print("Digite:");
			System.out.println("");
			carro.setAnoModelo(sc.nextInt());
		} while (carro.getAnoModelo() == 0);

		do {
			System.out.println("");
			System.out.println("Numero de portas do carro");
			System.out.print("Digite:");
			System.out.println("");
			carro.setNumPortas(sc.nextInt());
		} while (carro.getNumPortas() == 0);

		do {
			System.out.println("");
			System.out.println("Tipo de combustivel do carro: ");
			System.out.println("");
			System.out.println("Gasolina");
			System.out.println("Diesel");
			System.out.println("");
			System.out.print("Digite: ");
			System.out.println("");
			carro.setTipocombustivel(sc.next());
		} while (carro.getTipocombustivel() == null);

		carros.add(carro);
		System.out.println("Carro Adicionado.");
	}

	public static void verCarro(ArrayList<Carro> carros) {
		for (Carro carro : carros) {
			System.out.println("Carro: " + carro.getMarca());
		}
	}
}
