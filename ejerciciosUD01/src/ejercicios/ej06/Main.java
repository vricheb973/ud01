package ejercicios.ej06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el total de la compra: ");
		double total = sc.nextDouble();
		
		Compra c1 = new Compra(total);
		c1.mostrarTotalConDescuento();

	}

}
