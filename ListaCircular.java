package listasLineares;

public class ListaCircular {
	private Nodo inicio;
	private Nodo fim;
	
	public ListaCircular() {
		
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
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		
		if (inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		} else {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}		
		
	}

	
	public String mostrarLista() {
		String lista = "";
		if (inicio == null) return lista;
		
		Nodo aux = inicio;
		
		do {
			lista += aux.getDado() + ", ";
			aux = aux.getProx();
			
		} while (aux != inicio);
		
		return lista;
	}
	
	public void removerComValor(int dado) {
		if (inicio == null) return;
		
		if (inicio.getDado() == dado) {
			if (inicio == fim) { //lista apenas com 1 elemento
				inicio = null;
				return;
			}
			
			inicio = inicio.getProx(); //elemento a ser eliminado foi o primeiro, mas a lista tem mais elementos
			fim.setProx(inicio);
			
			return;
		}
		
		Nodo aux = new Nodo(dado);
		
		aux = inicio;
		
		do {
			if (aux.getProx().getDado() == dado) {
				if (aux.getProx() == fim) {
					fim = aux;
				}
				
				aux.setProx(aux.getProx().getProx());
				return;
			}
			
			aux = aux.getProx();
		} while (aux != inicio);
	}
	
	public int quantNodo() {
		
		if (inicio == null) return 0;
		int cont = 0;
		Nodo aux = inicio;
		
		do {
			cont++;
			aux = aux.getProx();
		} while (aux != inicio);
		
		return cont;
	}
	
	public void inserirFinal(int dado) {
		Nodo novoNodo = new Nodo(dado);
		
		if (inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio); //inserirInicio(dado)
			fim = inicio;
		} else {
			fim.setProx(novoNodo);
			novoNodo.setProx(inicio);
			fim = novoNodo;
		}
	}
	
	public void ordenarLista() {
		Nodo aux = inicio;
		int troca;

		if (inicio == null) return;
		
		do {
			if (aux.getDado() > aux.getProx().getDado()) {
				if (aux == inicio) {
					inicio = aux.getProx();
					fim.setProx(inicio);
				}
				
				troca = aux.getDado();
				aux.setDado(aux.getProx().getDado());
				aux.getProx().setDado(troca);
				
			} else {
				aux = aux.getProx();
			}
			
			System.out.println(aux.getDado());
			
		} while (aux.getDado() > aux.getProx().getDado());
		
		return;

		

		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
