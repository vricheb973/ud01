package ejercicios.ej09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la nota del primer examen: ");
		double nota1 = sc.nextDouble();

		System.out.println("Dime la media deseada: ");
		double mediaDeseada = sc.nextDouble();
		
		NotaExamenes nEx = new NotaExamenes(nota1, mediaDeseada);
		nEx.calcularNotaNecesaria();
		
	}

}
