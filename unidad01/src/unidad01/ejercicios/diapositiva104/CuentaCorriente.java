package unidad01.ejercicios.diapositiva104;

public class CuentaCorriente {
	
	//Atributos
	String dni;
	String nombreTitular;
	double saldo;	
	
	//Constructores
	CuentaCorriente(String dni, String nombreTitular) {
		this.dni = dni;
		this.nombreTitular = nombreTitular;
		this.saldo = 0.0;
	}
	
	//Métodos
	void ingresar(double cantidad) {
		this.saldo += cantidad;
	}
	
	void retirar(double cantidad) {
		this.saldo -= cantidad;
	}
	
	void mostrarInformación() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Titular: " + this.nombreTitular);
		System.out.printf("Saldo: %.2f € \n", this.saldo);
	}
}
