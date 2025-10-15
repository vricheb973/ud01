package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva64 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos años tienes?");
		int edad = sc.nextInt();
		
		System.out.println("El año que viene tendrás " + ++edad + " años");		
		
	}

}
