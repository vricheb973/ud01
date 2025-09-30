package operadores;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos años tienes?");
		int edad = sc.nextInt();

		boolean mayorEdad = (edad >= 18);
		
		// expresiónCondicional ? valorT : valorF
		
		String resultado = mayorEdad ? "Eres mayor de edad" : "No eres mayor de edad"; 
		
		System.out.println(resultado);
				
				
				
				
				
				
				
				
				

	}

}
