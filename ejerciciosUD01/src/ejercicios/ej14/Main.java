package ejercicios.ej14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la distancia en km: ");
		double distancia = sc.nextDouble();
		
		System.out.println("Dime la velocidad del coche que va delante: ");
		double velocidad1 = sc.nextDouble();
		
		System.out.println("Dime la velocidad del coche que va detrás (más rápido): ");
		double velocidad2 = sc.nextDouble();
		
		CruceVehiculos cv1 = new CruceVehiculos(distancia, velocidad1, velocidad2);
		cv1.calcularTiempoAlcance();

	}

}
