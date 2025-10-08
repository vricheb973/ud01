package ejercicios.ej01;

public class Rectangulo {
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void getBase() {
		System.out.println(this.base);
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void getAltura() {
		System.out.println(this.altura);
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void calculaPerimetroArea() {
		double perimetro = (base+altura)*2;
		double area = base * altura;

		System.out.printf("Perímetro: %.2f \n", perimetro);
		System.out.printf("Área: %.2f \n", area);
	}
	
	
	
	
	
	
	
	
	
	
}
