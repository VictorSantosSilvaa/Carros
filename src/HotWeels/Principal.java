package HotWeels;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sistema de Veiculo: ");
		System.out.println("1 - Carro");
		System.out.println("2 - Moto");
		System.out.println("Qual seu tipo de carro?");
		System.out.println("Qual seu tipo de carro?");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1: {
			System.out.println("Carro selecionado.");
			System.out.println("");
			System.err.println("Digite a Marca: ");
		}
		case 2: {
			System.out.println("Moto selecionada.");

		}
		
		default:
			System.out.println("Tente novamente.");
		}
		
		
		
	}

}
