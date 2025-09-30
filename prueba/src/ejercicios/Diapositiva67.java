package ejercicios;

import java.util.Scanner;

public class Diapositiva67 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos años tienes?");
		int edad = sc.nextInt();
		
		boolean mayorEdad = (edad >= 18);

		System.out.printf("Es mayor de edad: %b \n", mayorEdad);
		
		// Otra manera y así nos ahorramos la variable mayorEdad
		System.out.printf("Es mayor de edad: %b \n", edad >= 18);
		
		//Se puede poner de esta manera también
		System.out.println("Es mayor de edad: " + (edad >= 18));
		
		// O de esta otra
		System.out.println("Es mayor de edad: " + mayorEdad);
		
	}

}
