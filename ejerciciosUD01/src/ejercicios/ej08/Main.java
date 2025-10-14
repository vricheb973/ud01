package ejercicios.ej08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el primer número: ");
		double n1 = sc.nextDouble();

		System.out.println("Dime el segundo número: ");
		double n2 = sc.nextDouble();
		
		DistanciaAbsoluta distancia1 = new DistanciaAbsoluta(n1, n2);
		distancia1.mostrarDistancia();
		
	}

}
