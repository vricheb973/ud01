package ejercicios.ej05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Preguntas correctas: ");
		int correctas = sc.nextInt();

		System.out.println("Preguntas incorrectas: ");
		int incorrectas = sc.nextInt();

		System.out.println("Preguntas en blanco: ");
		int blanco = sc.nextInt();
		
		EvaluacionTest ev1 = new EvaluacionTest(correctas, incorrectas, blanco);
		ev1.calcularNotaFinal();

	}

}
