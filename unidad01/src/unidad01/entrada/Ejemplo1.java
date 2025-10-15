package unidad01.entrada;

import java.util.Scanner;

public class Ejemplo1 {
	
	public static void main(String[] args) {	
		// tipo identificador = valor;		
		Scanner pepe = new Scanner(System.in);
		
		// Con el next() recogemos texto
		System.out.println("¿Cómo te llamas?");
		String nombre = pepe.next();

		System.out.printf("Hola %s \n", nombre);
		
		// Con el nextInt() recogemos números enteros
		System.out.println("¿Cuántos años tienes?");
		int edad = pepe.nextInt();

		System.out.printf("Tienes %d años \n", edad);
		
		// Con el nextDouble() recogemos números con decimales
		// Separar los decimales con punto (1.80) (en el código)
		// Importante separar los decimales con coma (1,80) (en la consola)
		System.out.println("¿Cuánto mides?");
		double estatura = pepe.nextDouble();

		System.out.printf("Mides %.2f cm \n", estatura);
		
		// Con el nextBoolean() recogemos un boolean (true o false)
		System.out.println("¿Vas al Betis?");
		boolean betis = pepe.nextBoolean();

		System.out.printf("Vas al Betis: %b \n", betis);
		
	}

}
