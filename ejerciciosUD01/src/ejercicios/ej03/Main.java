package ejercicios.ej03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer número: ");
		double numero1 = sc.nextDouble();

		System.out.println("Dime el segundo número: ");
		double numero2 = sc.nextDouble();
		
		Calculadora cal1 = new Calculadora(numero1, numero2);
		cal1.mostrarOperaciones();

	}

}
