package unidad01.ejercicios.diapositiva105;

public class Persona {
	
	String nombre;
	int edad;
	
	static int contadorPersonas = 0;
	static String ultimoNombre = "";
	static Persona ultimaPersona = null;
	
	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contadorPersonas++;
		ultimoNombre = nombre;
		ultimaPersona = this;
	}
	
	static void mostrarTotalPersonas() {
		System.out.println("Se han creado " + contadorPersonas + " personas. ");
	}
	
	static void mostrarultimoNombre() {
		System.out.println("Último nombre: " + ultimoNombre);
	}
	
	static void mostrarUltimaPersona() {
		System.out.println("Última persona creada:");
		System.out.println("Nombre: " + ultimaPersona.nombre);
		System.out.println("Edad: " + ultimaPersona.edad);
	}
}
