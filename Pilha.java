package listasLineares;

public class Pilha {

	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0;
	
	public Pilha (int limite) {
		this.limite = limite;
	}

	public Nodo getTopo() {
		return topo;
	}

	public void setTopo(Nodo topo) {
		this.topo = topo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public boolean Vazia() {
		return tamanho == 0;
	}
	
	public boolean temEspaco() {
		return limite > tamanho;
	}
	
	//iserção
	public void push(int dado) {
		if (temEspaco()) {
			Nodo novoItem = new Nodo(dado);
			novoItem.setProx(topo);
			topo = novoItem;
			tamanho++;
		} else {
			System.out.println("Pilha cheia!");
		}
	}
	
	//Remoção
	public void pop() {
		if(!Vazia()) {
			System.out.println(topo.getDado() + " foi removido da pilha");
			topo = topo.getProx();
			tamanho--;
		} else {
			System.out.println("Pilha está vazia!");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pilha [topo=");
		builder.append(topo);
		builder.append(", tamanho=");
		builder.append(tamanho);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
