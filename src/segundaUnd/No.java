package segundaUnd;

import java.util.Objects;

public class No {
	private int valor;
	private No filhoEsq;
	private No filhoDir;
	private static String respPre = "";
	private static String respEm = "";
	private static String respPos = "";
	
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

	public static String exibirPreOrdem(No no) {
		respPre += no.getValor() + ", ";
		if(Objects.nonNull(no.getFilhoEsq())) {
			exibirPreOrdem(no.getFilhoEsq());
		}
		if(Objects.nonNull(no.getFilhoDir())) {
			respPre += no.getFilhoDir().getValor() + ", ";
			if(Objects.nonNull(no.getFilhoDir().getFilhoEsq())) {
				exibirPreOrdem(no.getFilhoDir().getFilhoEsq());
			} 
			if(Objects.nonNull(no.getFilhoDir().getFilhoDir())) {
				exibirPreOrdem(no.getFilhoDir().getFilhoDir());
			}
		}
		return respPre;
	}
	
	public static String exibirEmOrdem(No no) {
		if(Objects.nonNull(no.getFilhoEsq())) {
			exibirEmOrdem(no.getFilhoEsq());
			respEm += no.getValor() + ", ";
			if(Objects.nonNull(no.getFilhoDir())) {
				exibirEmOrdem(no.getFilhoDir());
			}
		} else {
			if(Objects.nonNull(no.getFilhoDir())) {
				exibirEmOrdem(no.getFilhoDir());
			}
			respEm += no.getValor() + ", ";
		}
		return respEm;
	}
	
	public static String exibirPosOrdem(No no) {
		if(Objects.nonNull(no.getFilhoEsq())) {
			exibirPosOrdem(no.getFilhoEsq());
		}
		if(Objects.nonNull(no.getFilhoDir())) {
			exibirPosOrdem(no.getFilhoDir());
		}
		respPos += no.getValor() + ", ";
		return respPos;
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
