package unidad01.poo.personas2;

public class Persona {
	
	String nombre;
	int edad;
	double estatura;
	
	static String diaDeLaSemana = "Martes";
	
	Persona(String nombre, int edad, double estatura){
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	static void mostrarDiaSemana() {
		System.out.println("Hoy es " + diaDeLaSemana);
	}
	
	void saludar() {
		System.out.println("Hola, mi nombre es " + this.nombre);
		System.out.println("Y estamos a " + diaDeLaSemana);
	}
	
	void saludar(String nombre) {
		System.out.println("Hola "+ nombre + ", mi nombre es " + this.nombre);
	}

	void cumplirAnyos() {
		this.edad++;
	}
	
	void crecer(double incremento) {
		this.estatura = this.estatura + incremento;
	}

}
