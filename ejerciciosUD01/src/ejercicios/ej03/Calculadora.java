package ejercicios.ej03;

public class Calculadora {
	
	private double numero1;
	private double numero2;
	
	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public void getNumero1() {
		System.out.println(numero1);
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public void getNumero2() {
		System.out.println(numero2);
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public void mostrarOperaciones() {
		double suma = this.numero1 + this.numero2;
		double resta = this.numero1 - this.numero2;
		double multiplicacion = this.numero1 * this.numero2;
		double division = this.numero1 / this.numero2;

		System.out.printf("Suma = %.2f \n", suma);
		System.out.printf("Resta = %.2f \n", resta);
		System.out.printf("Multiplicación = %.2f \n", multiplicacion);
		System.out.printf("División = %.2f \n", division);
	}
		
}
