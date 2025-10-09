package segundaUnd;

import java.util.Objects;

public class No {
	private int valor;
	private No filhoEsq;
	private No filhoDir;
	
	public No(int valor) {
		this.valor = valor;
	}
	
	public static No criarArvore(String entrada) {
		String[] elementos = entrada.split(",");
		
		int valorRaiz = Integer.parseInt(elementos[0]);
		
		No raiz = new No(valorRaiz);
		
		for(int i = 1; i < elementos.length; i++) {
			No noNovo = new No(Integer.parseInt(elementos[i]));
			inserir(raiz, noNovo);
		}
		
		return raiz;
	}
	
	public static void inserir(No existente, No novo) {
		if(existente.getValor() < novo.getValor()) {
			if(Objects.nonNull(existente.getFilhoDir())) {
				inserir(existente.getFilhoDir(), novo);
				return;
			}
			existente.setFilhoDir(novo);
		} else if(existente.getValor() > novo.getValor()) {
			if(Objects.nonNull(existente.getFilhoEsq())) {
				inserir(existente.getFilhoEsq(), novo);
				return;
			}
			existente.setFilhoEsq(novo);
		}
	}
	
	public static void exibir(No no) {
		System.out.print(no.getValor() + " | ");
		
		if(Objects.nonNull(no.getFilhoEsq())) {
			System.out.print(no.getFilhoEsq().getValor());
		}
	}
		
	public static void exibirEmOrdem(No no) {
		if(Objects.nonNull(no.getFilhoEsq())) {
			exibirEmOrdem(no.getFilhoEsq());
			System.out.println(no.getValor());
			if(Objects.nonNull(no.getFilhoDir())) {
				exibirEmOrdem(no.getFilhoDir());
			}
		} else {
			System.out.println(no.getValor());
		}
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getFilhoEsq() {
		return filhoEsq;
	}
	public void setFilhoEsq(No filhoEsq) {
		this.filhoEsq = filhoEsq;
	}
	public No getFilhoDir() {
		return filhoDir;
	}
	public void setFilhoDir(No filhoDir) {
		this.filhoDir = filhoDir;
	}

	
	
}
