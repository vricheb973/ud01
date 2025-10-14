package ejercicios.ej04;

public class Temperatura {
	
	private double fahrenheit;
	
	public Temperatura(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public void getFahrenheit() {
		System.out.println(this.fahrenheit);
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public void mostrarCelsius() {
		double celsius = (this.fahrenheit - 32)/1.8;
		
		// 234ºF => 435ºC
		System.out.printf("%.2fºF => %.2fºC \n", this.fahrenheit, celsius);
	}
	
}
