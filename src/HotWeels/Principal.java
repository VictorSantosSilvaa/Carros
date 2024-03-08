package HotWeels;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Moto moto = new Moto();
		do {
			try {

				Menu.menu();
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
