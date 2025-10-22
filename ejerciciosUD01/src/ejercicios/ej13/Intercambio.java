package ejercicios.ej13;

public class Intercambio {
	
	private int a;
	private int b;
	
	public Intercambio(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void getA() {
		System.out.println(this.a);
	}

	public void setA(int a) {
		this.a = a;
	}

	public void getB() {
		System.out.println(this.b);
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void intercambiar() {
		int aux = this.a;
		this.a = this.b;
		this.b = aux;
		
		System.out.printf("a=%d y b=%d \n", this.a, this.b);
	}
	
	
	
	
	
	
	
	
	

}
