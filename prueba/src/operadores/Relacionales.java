package operadores;

import java.util.Scanner;

public class Relacionales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Dime otro número: ");
		int n2 = sc.nextInt();
		
		boolean esMayor = (n1>n2);
		
		System.out.printf("¿%d es mayor que %d?: %b \n", n1, n2, esMayor);
	}

}
