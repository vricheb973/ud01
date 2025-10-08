package ejercicios.ej01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime la base: ");
		double base = sc.nextDouble();
		
		System.out.println("Dime la altura: ");
		double altura = sc.nextDouble();
		
		Rectangulo r1 = new Rectangulo(base, altura);
		r1.calculaPerimetroArea();
		

	}

}
