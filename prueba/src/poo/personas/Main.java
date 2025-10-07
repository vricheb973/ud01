package poo.personas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// tipo nombre = valor;
		Persona p1 = new Persona();
		p1.nombre = "Pepe";
		p1.edad = 28;
		p1.estatura = 1.89;
		
		p1.saludar();
		Persona.mostrarDiaSemana();


		Persona p2 = new Persona();
		p2.nombre = "Paco";
		p2.edad = 38;
		p2.estatura = 1.70;
		
		
		
		
		
		
		
		
//		p1.saludar("Manolo");
//		
//		System.out.println("Edad:");
//		System.out.println(p1.edad);
//		p1.cumplirAnyos();
//		System.out.println(p1.edad);
//		
//
//		System.out.println("Estatura:");
//		System.out.println(p1.estatura);
//		p1.crecer(0.02);
//		System.out.println(p1.estatura);
		
	}

}
