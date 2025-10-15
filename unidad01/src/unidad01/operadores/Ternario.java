package unidad01.operadores;

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
		
		//Ternario
		int opcion = (edad>=18)?1:2;
		String opcion2 = (edad>=18)?"Mayor de edad":"Menor de edad";
		double opcion3 = (edad>=18)?0.0:10.0;
		
	}

}
