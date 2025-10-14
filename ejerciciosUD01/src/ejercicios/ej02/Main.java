package ejercicios.ej02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el cateto A: ");
		double catetoA = sc.nextDouble();
		
		System.out.println("Dime el cateto B: ");
		double catetoB = sc.nextDouble();
		
		TrianguloRectangulo tr1 = new TrianguloRectangulo(catetoA, catetoB);
		tr1.calcularHipotenusa();

	}

}
