package unidad01.ejercicios;

import java.math.BigInteger;
import java.util.Scanner;

public class Diapositiva72 {
	
	public static void main(String[] args) {
		
		// si dividimos un número entre 2
		/*
		 *  el resto puede ser:
		 *  	- 0 (indica que la división es exacta)
		 *  	- 1 (indica que queda un resto)
		 *  
		 *  Para estos casos tenemos el operador % (modulo)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		
		boolean esPar = (numero % 2 == 0);
		
		System.out.printf("El número %d es par: %b \n", numero, esPar);
		
	}

}
