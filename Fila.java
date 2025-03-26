package listasLineares;

public class Fila {

	private Nodo inicio;
	private Nodo fim;
	private int limite = 0;
	private int tamanho = 0;
	
	public Fila (int limite) {
		this.limite = limite;
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Nodo getFim() {
		return fim;
	}

	public void setFim(Nodo fim) {
		this.fim = fim;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean Vazia() {
		return tamanho == 0;
	}
	
	public boolean temEspaco() {
		return limite > tamanho;
	}
	
	public void inserir(int dado) {
		if (temEspaco()) {
			Nodo novoNodo = new Nodo(dado);
			if (Vazia()) {
				inicio = novoNodo;
				fim = novoNodo;
			} else {
				fim.setProx(novoNodo);
				fim = novoNodo;
			}
			tamanho++;
		} else
			System.out.println("Sem espaço");
		
	}
	
	public void remover() {
		if (!Vazia()) {
			System.out.println(inicio.getDado() + " foi removido");
			inicio = inicio.getProx();
			tamanho--;
			if (Vazia()) fim = null;
		} else 
			System.out.println("Fila vazia!");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fila [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", tamanho=");
		builder.append(tamanho);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
