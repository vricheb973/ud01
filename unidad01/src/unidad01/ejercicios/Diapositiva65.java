package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva65 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime la primera nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Dime la segunda nota: ");
		int nota2 = sc.nextInt();
		
		double media = (nota1+nota2)/2.0;
		
		System.out.printf("La media aritmética es %.3f \n", media);

	}

}
