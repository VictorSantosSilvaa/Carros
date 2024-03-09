package HotWeels;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void menu() {
		ArrayList<Carro> listaCarros = new ArrayList<Carro>();
		ArrayList<Moto> listaMotos = new ArrayList<Moto>();

		do {
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("-------------------------------");
				System.out.println("1 - Adicionar Carro");
				System.out.println("2 - Adicionar Moto");
				System.out.println("3 - Ver Lista de Carros");
				System.out.println("4 - Ver Lista de Motos");
				System.out.println("9 - Sair do Sistema");
				System.out.println("-------------------------------");
				System.out.print("Digite um número: ");

				int opcao = sc.nextInt();

				switch (opcao) {
				case 1:
					Carro.carro(listaCarros);
					break;
				case 2:
					Moto.moto(listaMotos);
					break;
				case 3:
					Carro.verCarro(listaCarros);
					break;
				case 4:
					Moto.verMoto(listaMotos);
					break;
				case 9:
					System.out.println("Você saiu do sistema.");
					return;
				default:
					System.out.println("Opção inválida.");
				}
			} catch (Exception e) {
				System.out.println("Algo deu errado.");
			}
		} while (true);
	}
}
