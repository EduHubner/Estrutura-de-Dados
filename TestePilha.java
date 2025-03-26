package listasLineares;

public class TestePilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(5);
		
		
		//Inserir
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);
		pilha.push(60); //passou do limite
		
		//Remover 
		pilha.pop();
		pilha.pop();
		
		
		//Mostrar pilha

		System.out.println(pilha.toString());
	}

}
