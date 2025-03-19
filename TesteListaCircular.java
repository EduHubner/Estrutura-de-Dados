package listasLineares;

public class TesteListaCircular {

	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		
		
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
		
		
		//Mostrar listaS
		System.out.println(lista.mostrarLista());
		
		//Mostrar quantidade de Nodos
		System.out.println(lista.quantNodo());
		System.out.println(lista.getFim().getDado());
		
		lista.ordenarLista();
		
		//System.out.println(lista.mostrarLista());
	}


}
