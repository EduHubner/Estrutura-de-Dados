package Exercicios;

public class MainExercicio1 {

	public static void main(String[] args) {

		Fila fila = new Fila(10);
		
		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		fila.inserir(5);
		fila.inserir(6);
		
		System.out.println(fila.toString());
		
		Fila filaPar = fila.Separar_Par(fila);
		
		System.out.println(filaPar.toString());
		
		//System.out.println(fila.toString());
		
		Fila filaImpar = fila.Separar_Impar(fila);
		
		System.out.println(filaImpar.toString());
		
		System.out.println("*********************************");
		
		Fila filaPar2 = new Fila(10);
		Fila filaImpar2 = new Fila(10);
		
		System.out.println(fila.toString());
		
		fila.Separar_Par_Impar(fila, filaPar2, filaImpar2);
		
		System.out.println(fila.toString());
		System.out.println(filaPar2.toString());
		System.out.println(filaImpar2.toString());
		
		
	}

}
