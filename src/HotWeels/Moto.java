package HotWeels;

import java.util.ArrayList;
import java.util.Scanner;

public class Moto extends Veiculo {
	boolean possuiPartidaEletrica;

	public boolean isPossuiPartidaEletrica() {
		return possuiPartidaEletrica;
	}

	public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
		this.possuiPartidaEletrica = possuiPartidaEletrica;
	}

	public static void moto() {
		ArrayList<Moto> mot = new ArrayList<Moto>();
		Scanner sc = new Scanner(System.in);
		Moto moto = new Moto();

		System.out.println("Digite o a marca do carro: ");
		moto.setMarca(sc.next());

		System.out.println("Digite o ano do carro: ");
		moto.setAnoModelo(sc.nextInt());

		System.out.println("Digite o numero de portas do carro: ");
		moto.setPossuiPartidaEletrica(sc.nextBoolean());

		mot.add(moto);
		System.out.println("Carro Adicionado.");
	}

	public static void verMoto() {
		Moto moto = new Moto();

		System.out.println("Moto: " + moto.getMarca());
	}
}
