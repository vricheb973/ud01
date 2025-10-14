package ejercicios.ej08;

public class DistanciaAbsoluta {
	
	private double num1;
	private double num2;
	
	public DistanciaAbsoluta(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void getNum1() {
		System.out.println(num1);
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public void getNum2() {
		System.out.println(num2);
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public void mostrarDistancia() {
		double distanciaAbsoluta = Math.abs(num1 - num2);
		System.out.printf("La distancia absoluta es %.2f \n", distanciaAbsoluta);
	}

}
