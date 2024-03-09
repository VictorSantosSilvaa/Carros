package HotWeels;

import java.util.Scanner;

public class Menu {

	public static void menu() {
		do {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("");
				System.out.println("------------------------------------");
				System.out.println("Olá, seja Bem-Vindo ao Sistema de Veiculos.");
				System.out.println("------------------------------------");
				System.out.println("------------------------------------");
				System.out.println("Selecione o numero que deseja:");
				System.out.println("------------------------------------");
				System.out.println("------------------------------------");
				System.out.println("1 - Carro.");
				System.out.println("2 - Moto.");
				System.out.println("3 - Ver Lista de Carro.");
				System.out.println("4 - Ver Lista de Moto.");
				System.out.println("9 - Sair do sistema.");
				System.out.println("------------------------------------");
				System.out.println("");
				System.out.print("Digite um numero: ");

				int opcao = sc.nextInt();

				switch (opcao) {
				case 1: {
					Carro.carro();
					continue;
				}
				case 2: {
					Moto.moto();
					continue;
				}
				case 3: {
					Carro.verCarro();
					continue;
				}
				case 4: {
					Moto.verMoto(null);

				}
				case 9: {
					System.out.println("Você saiu do sistema.");
					return;
				}
				default:
					System.out.println("Algo deu errado.");

				}
			} catch (Exception e) {
				System.out.println("Algo deu errado mais uma vez.");

			}

		} while (true);

	}

}
