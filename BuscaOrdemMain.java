package projeto2;

import java.util.Scanner;

public class BuscaOrdemMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[][] dic = { { "�belha", "bee" }, { "abacaxi", "pineapple" }, { "grito", "scream" }, { "gostar", "like" },
				{ "receoso", "afraid" }, { "Inteligente", "smart" }, { "rainha", "queen" }, { "devaneio", "daydream" },
				{ "dado", "data" }, { "data", "date" } };

		System.out.print("0 - Sair \n1 - Portugu�s \n2 - Ingl�s \nTipo de ordena��o desejada (1/2): ");
		int opcao = in.nextInt();
		System.out.println();
		
		while(opcao!=0) {
			if ((opcao == 1) || (opcao == 2)) {
				BuscaOrdem.ordenar(dic, opcao);
				System.out.print("Digite a palavra que voc� deseja buscar: ");
				String palavra = in.next();
				String resp = BuscaOrdem.search(dic, opcao, palavra);
	
				if (resp != null) {
					System.out.println(resp);
				} else
					System.out.println("Palavra n�o encontrada");
			} 
			else
				System.out.println("Op��o inv�lida");
			System.out.println();
			System.out.print("Digite outra op��o de ordena��o(1/2): ");
			opcao = in.nextInt();
		}
	}
}
