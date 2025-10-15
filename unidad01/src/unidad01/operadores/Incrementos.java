package unidad01.operadores;

public class Incrementos {

	public static void main(String[] args) {

		int a = 1;
		int b = 3;
		
		int c = ++a * b--;
		
		// 1º ++a a vale 2
		// 2º guardo en c a*b, es decir, guardo en c 2*3, guardo 6
		// 3º b--, por lo tanto b vale 2

		System.out.println(a); //2
		System.out.println(b); //2 
		System.out.println(c); //6

	}

}

