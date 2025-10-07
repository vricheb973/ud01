package ejercicios.diapositiva104;

import java.util.Scanner;

public class MainConScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu DNI: ");
		String dni = sc.next();

		System.out.println("Dime tu nombre: ");
		String nombre = sc.next();
		
		CuentaCorriente cc1 = new CuentaCorriente(dni, nombre);
		cc1.mostrarInformación();
		
		System.out.println("¿Cuanto quieres ingresar? (Si no quieres ingresar, pon un 0)");
		double cantidad = sc.nextDouble();
		cc1.ingresar(cantidad);
		cc1.mostrarInformación();
		
		System.out.println("¿Cuanto quieres retirar? (Si no quieres retirar, pon un 0)");
		cantidad = sc.nextDouble();
		cc1.retirar(cantidad);
		cc1.mostrarInformación();
		
		

	}

}
