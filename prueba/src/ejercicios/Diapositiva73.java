package ejercicios;

import java.util.Scanner;

public class Diapositiva73 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos años tienes?");
		int edad = sc.nextInt();
		
		boolean edadLaboral = (edad >= 16) && (edad < 67);
		
		System.out.printf("Está en edad laboral: %b \n", edadLaboral);

	}

}
