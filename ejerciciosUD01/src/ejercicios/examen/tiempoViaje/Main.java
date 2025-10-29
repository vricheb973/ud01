package ejercicios.examen.tiempoViaje;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime la distancia: ");
		int distancia = scanner.nextInt();
		
		System.out.println("Dime la velocidad media: ");
		int velocidadMedia = scanner.nextInt();
		
		TiempoViaje tv1 = new TiempoViaje(distancia, velocidadMedia);
		tv1.calcularTiempo();
		
	}

}
