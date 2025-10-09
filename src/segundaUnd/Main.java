package segundaUnd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("-- Bem-vindo(a) ao sistema das árveres");
			System.out.println("SELECIONE UMA OPÇÃO: ");
			System.out.println("1 - Criar arvore");
			System.out.println("2 - Percurso Em-ordem");
			System.out.println("3 - Percurso Pré-ordem");
			System.out.println("4 - Percurso Pós-ordem");
			int op = Integer.parseInt(scanner.nextLine());
			
			switch(op) {
				case 1:
					System.out.println("Digite os elementos a serem inseridos seperados por vírgula. Exemplo: 7,3,4,8,10,25");
					String entrada = scanner.nextLine();
					No o = No.criarArvore(entrada);
					No.exibirEmOrdem(o);
					System.out.println("\n");
				break;
			}
			
		}
		

	}

}
