package ejercicios.diapositiva120;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	
	public Persona(String nombre, int edad) {
		//restricciones
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void getNombre() {
		System.out.println(this.nombre);
	}
	
	public void setNombre(String nombre) {
		//restricciones
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
