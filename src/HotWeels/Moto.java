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

	public static void moto(ArrayList<Moto> motos) {

		Scanner sc = new Scanner(System.in);
		Moto moto = new Moto();

		System.out.println("Digite o a marca da moto: ");
		moto.setMarca(sc.next());

		System.out.println("Digite o ano da moto: ");
		moto.setAnoModelo(sc.nextInt());

		System.out.println("Tem partida elétrica na moto? ");
		moto.setPossuiPartidaEletrica(sc.nextBoolean());
		motos.add(moto);
		
		System.out.println("Moto Adicionado.");
	}

	public static void verMoto(ArrayList<Moto> motos) {

		for (Moto moto : motos) {
			System.out.println("Moto: " + moto.getMarca());
		}
	}

}
