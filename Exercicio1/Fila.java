package Exercicios;

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

	//****************************METODO UM****************************
	public Fila Separar_Par(Fila fila) {
		Fila fila_par = new Fila(10);
		
		Nodo aux = fila.inicio;
		if (!fila.Vazia())
			while (aux != fila.fim.getProx()) {
				
				
				if (aux.getDado()%2 == 0) {
					fila_par.inserir(aux.getDado());
					//fila.remover();
				} 
				
				aux = aux.getProx();
			}
		else 
			System.out.println("Fila vazia");
		return fila_par;
		
	}
	
	public Fila Separar_Impar(Fila fila) {
		Fila fila_Impar = new Fila(10);
		
		Nodo aux = fila.inicio;
		if (!fila.Vazia())
			while (aux != fila.fim.getProx()) {
				
				
				if (aux.getDado()%2 != 0) {
					fila_Impar.inserir(aux.getDado());
					//fila.remover();
				}
				
				aux = aux.getProx();
			}
		else 
			System.out.println("Fila vazia");
		return fila_Impar;
		
	}
	//**************************FIM METODO UM*******************************
	
	//**************************************METODO 2************************
	public void Separar_Par_Impar(Fila fila, Fila filaPar, Fila filaImpar) {
		Nodo aux = fila.inicio;
		
		if (!fila.Vazia())
			while (aux != fila.fim) {
				
				if (aux.getDado()%2 == 0) 
					filaPar.inserir(aux.getDado());
				else
					filaImpar.inserir(aux.getDado());
							
				fila.remover();
						
				aux = aux.getProx();
			}
		else 
			System.out.println("Fila vazia");
		return;
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
