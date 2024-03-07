package HotWeels;

import java.util.Scanner;

public class Veiculo {
	private String marca;
	private int anoModelo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int modelo) {
		this.anoModelo = modelo;
	}

	public void exibirInfo(String marca, int anoModelo) {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + anoModelo);
	}

	public void carro() {

	}

	public void moto() {

	}

	static Scanner sc = new Scanner(System.in);

	public static void sistema() {

	}

}
