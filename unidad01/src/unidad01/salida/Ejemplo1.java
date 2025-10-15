package unidad01.salida;

public class Ejemplo1 {
	
	public static void main(String[] args) {		
		
		System.out.println("Hola");

		System.out.print("H");
		System.out.print("o");
		System.out.print("l");
		System.out.print("a");
		System.out.print(" \n");
		
		
		/*
		 * PRINTF
		 * 
		 * %s -> Texto
		 * %d -> Número entero
		 * %f -> Número con decimales
		 * %b -> True o false
		 * 
		 */
		String nombre = "Vladi";
		String apellidos = "Rico";
		int edad = 32;
		
		System.out.printf("Hola, mi nombre es %s %s y tengo %d años \n", nombre, apellidos, edad);
		
//		System.out.println("Hola, mi nombre es" + nombre + "" + apellidos+ "y tengo " + edad + " años ");
		
		System.out.printf("El total de la cuenta es %.2f € \n", 32.56998989);
		
		
	}

}
