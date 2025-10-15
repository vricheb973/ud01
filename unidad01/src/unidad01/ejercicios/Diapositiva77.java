package unidad01.ejercicios;

import java.util.Scanner;

public class Diapositiva77 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime las peras que vendiste el primer semestre: ");
		double peras1 = sc.nextDouble();
		
		System.out.println("\nDime las peras que vendiste el segundo semestre: ");
		double peras2 = sc.nextDouble();
		
		System.out.println("\nDime las manzanas que vendiste el primer semestre: ");
		double manzanas1 = sc.nextDouble();
		
		System.out.println("\nDime las manzanas que vendiste el segundo semestre: ");
		double manzanas2 = sc.nextDouble();
		
		double total = (peras1+peras2)*1.95 + (manzanas1+manzanas2)*2.35;
		
		System.out.printf("\nEl importe total es %.2f € \n", total);

	}

}
