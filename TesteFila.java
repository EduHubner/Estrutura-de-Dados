package listasLineares;

public class TesteFila {

	public static void main(String[] args) {
		Fila fila = new Fila(5);
		
		
		//Inserir
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.inserir(40);
		fila.inserir(50);
		fila.inserir(60); //passou do limite
		
		//Remover 
		fila.remover();
		fila.remover();
		
		
		//Mostrar fila

		System.out.println(fila.toString());

	}

}
