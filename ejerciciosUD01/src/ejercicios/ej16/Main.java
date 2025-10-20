package ejercicios.ej16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una cantidad de segundos: ");
		int segundos = sc.nextInt();

		TiempoCompleto t1 = new TiempoCompleto(segundos);
		t1.mostrarHorasMinutosSegundos();

	}

}
