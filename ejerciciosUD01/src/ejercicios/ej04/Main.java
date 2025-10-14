package ejercicios.ej04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime los grados celsius");
		double fahrenheit = sc.nextDouble();
		
		Temperatura t1 = new Temperatura(fahrenheit);
		t1.mostrarCelsius();
	}

}
