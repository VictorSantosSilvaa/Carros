package HotWeels;

import java.util.ArrayList;
import java.util.Scanner;

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

	public static void carro() {
		ArrayList<Carro> car = new ArrayList<Carro>();
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();

		System.out.println("Digite o a marca do carro: ");
		carro.setMarca(sc.next());

		System.out.println("Digite o ano do carro: ");
		carro.setAnoModelo(sc.nextInt());

		System.out.println("Digite o numero de portas do carro: ");
		carro.setNumPortas(sc.nextInt());

		System.out.println("Digite o tipo de combustivel do carro: ");
		carro.setTipocombustivel(sc.next());

		car.add(carro);
		System.out.println("Carro Adicionado.");

	}

	public static void verCarro() {

		Carro carro = new Carro();

		System.out.println("Carro: " + carro.getMarca());

	}

}
