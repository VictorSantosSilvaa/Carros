package HotWeels;

import java.util.ArrayList;
import java.util.Scanner;

public class funcaoMoto {
	public static void moto(ArrayList<Moto> motos) {

		Scanner sc = new Scanner(System.in);
		Moto moto = new Moto();

		do {
			System.out.println("");
			System.out.println("Digite o a marca da moto.");
			System.out.println("");
			Veiculo.verListaModelosMotos();
			System.out.println("");
			System.out.print("Digite: ");
			moto.setMarca(sc.nextLine());
		} while (moto.getMarca() == null);

		do {
			System.out.println("");
			System.out.println("Ano da moto: ");
			System.out.println("Digite: ");
			moto.setAnoModelo(sc.nextInt());
		} while (moto.getAnoModelo() == 0);

		do {
			System.out.println("");
			System.out.println("Tem partida elétrica na moto? ");
			moto.setPossuiPartidaEletrica(sc.nextBoolean());
		} while (moto.isPossuiPartidaEletrica() == false);
		motos.add(moto);

		System.out.println("Moto Adicionado.");
	}

	public static void verMoto(ArrayList<Moto> motos) {

		for (Moto moto : motos) {
			System.out.println("Moto: " + moto.getMarca());
			System.out.println("Tem elétrica? " + moto.isPossuiPartidaEletrica());
		}
	}
}
