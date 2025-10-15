package unidad01.ejercicios.diapositiva105;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Manuel", 26);
		Persona p2 = new Persona("Pepe", 25);
		Persona p3 = new Persona("Bakambu", 31);
		Persona p4 = new Persona("Marc", 34);

		Persona.mostrarTotalPersonas();
		Persona.mostrarultimoNombre();
		Persona.mostrarUltimaPersona();
		
		System.out.println(Persona.ultimaPersona);

	}

}
