package HotWeels;

import java.util.ArrayList;
import java.util.Scanner;

//Funções de Moto
public class funcaoCarro {

	// Funções de carro
	public static void carro(ArrayList<Carro> carros) {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();

		System.out.println("Digite a marca do carro: ");
		carro.setMarca(sc.next());

		System.out.println("Digite o ano do carro: ");
		carro.setAnoModelo(sc.nextInt());

		System.out.println("Digite o numero de portas do carro: ");
		carro.setNumPortas(sc.nextInt());

		System.out.println("Digite o tipo de combustivel do carro: ");
		carro.setTipocombustivel(sc.next());

		carros.add(carro);
		System.out.println("Carro Adicionado.");
	}

	public static void verCarro(ArrayList<Carro> carros) {
		for (Carro carro : carros) {
			System.out.println("Carro: " + carro.getMarca());
		}
	}
}
