package segundaUnd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Bem-vindo(a) ao sistema das árveres");
			System.out.println("Digite os elementos a serem inseridos seperados por vírgula. Exemplo: 7,3,4,8,10,25");
			String entrada = scanner.nextLine();
			
			No o = No.criarArvore(entrada);
			
			String preOrdem = No.exibirPreOrdem(o);
			String emOrdem = No.exibirEmOrdem(o);
			String posOrdem = No.exibirPosOrdem(o);
			
			System.out.println("Pré-ordem: " + preOrdem.substring(0, preOrdem.length() - 2));
			System.out.println("Em-ordem:  " + emOrdem.substring(0, emOrdem.length() - 2));
			System.out.println("Pos-ordem: " + posOrdem.substring(0, posOrdem.length() - 2));
			System.out.println("\n");
			
			}
			// 50,17,12,23,9,14,19,72,54,76,67
		}
}
