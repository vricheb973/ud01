package ejercicios.diapositiva119.cuenta;

public class CuentaCorriente {
	
	//Atributos
	public String dni;
	public String nombreTitular;
	double saldo;	
	
	//Constructores
	public CuentaCorriente(String dni, String nombreTitular) {
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
