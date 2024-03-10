package HotWeels;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void menu() {
		ArrayList<Carro> listaCarros = new ArrayList<Carro>();
		ArrayList<Moto> listaMotos = new ArrayList<Moto>();
		Scanner sc = new Scanner(System.in);

		do {

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
				case 1: {
					funcaoCarro.carro(listaCarros);
					break;
				}
				case 2: {
					funcaoMoto.moto(listaMotos);
					break;
				}
				case 3: {
					funcaoCarro.verCarro(listaCarros);
					break;
				}
				case 4: {
					funcaoMoto.verMoto(listaMotos);
					break;
				}
				case 9: {
					System.out.println("Você saiu do sistema.");
					return;
				}
				default:
					System.out.println("Opção inválida.");
				}

			} catch (Exception e) {
				System.out.println("Algo deu errado.");
			}

		} while (true);
	}
}
