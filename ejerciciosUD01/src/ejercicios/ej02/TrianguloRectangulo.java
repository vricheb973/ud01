package ejercicios.ej02;

public class TrianguloRectangulo {
	
	private double catetoA;
	private double catetoB;
	
	public TrianguloRectangulo(double catetoA, double catetoB) {
		this.catetoA = catetoA;
		this.catetoB = catetoB;
	}
	
	public void getCatetoA() {
		System.out.println(this.catetoA);
	}
	
	public void setCatetoA(double catetoA) {
		this.catetoA = catetoA;
	}

	public void getCatetoB() {
		System.out.println(this.catetoB);
	}
	
	public void setCatetoB(double catetoB) {
		this.catetoB = catetoB;
	}
	
	public void calcularHipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(this.catetoA, 2) + Math.pow(this.catetoB, 2));
		System.out.printf("La hipotenusa es %.2f \n", hipotenusa);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
