package HotWeels;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ArrayList<Principal> fun = new ArrayList<Principal>();
		do {
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
				Moto.verMoto();

			}
			case 9: {
				System.out.println("Você saiu do sistema.");
				return;
			}
			default:
				System.out.println("Algo deu errado.");

			}
		} while (true);

	}

}
