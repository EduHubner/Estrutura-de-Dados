package listasLineares;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		
		//Inserir no inicio
		lista.inserirInicio(10);
		lista.inserirInicio(20);
		lista.inserirInicio(30);
		lista.inserirInicio(40);
		lista.inserirInicio(50);
		
		//inserir no final
		lista.inserirFinal(90);
		lista.inserirFinal(100);
		//Remover com valor
		lista.removerComValor(20);
		
		
		//Mostrar lista
		lista.mostrarLista();
		System.out.println("\n" + lista.toString());
	}

}
