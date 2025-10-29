package ejercicios.examen.monedero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime los billetes de 5€: ");
		int cincoEuros = sc.nextInt();

		System.out.println("Dime las monedas de 2€: ");
		int dosEuros = sc.nextInt();

		System.out.println("Dime las monedas de 1€: ");
		int unEuro = sc.nextInt();
		
		System.out.println("Dime las monedas de 0,50€: ");
		int cent50 = sc.nextInt();
		
		System.out.println("Dime las monedas de 0,20€: ");
		int cent20 = sc.nextInt();
		
		Monedero mon1 = new Monedero(cincoEuros, dosEuros, unEuro, cent50, cent20);
		mon1.calcularTotalEuros();
		
	}

}
