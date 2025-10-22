package ejercicios.ej14;

public class CruceVehiculos {
	
	private double distancia;
	private double velocidad1;
	private double velocidad2;
	
	public CruceVehiculos(double distancia, double velocidad1, double velocidad2) {
		this.distancia = distancia;
		this.velocidad1 = velocidad1;
		this.velocidad2 = velocidad2;
	}

	public void getDistancia() {
		System.out.println(this.distancia);
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public void getVelocidad1() {
		System.out.println(this.velocidad1);
	}

	public void setVelocidad1(double velocidad1) {
		this.velocidad1 = velocidad1;
	}

	public void getVelocidad2() {
		System.out.println(this.velocidad2);
	}

	public void setVelocidad2(double velocidad2) {
		this.velocidad2 = velocidad2;
	}
	
	public void calcularTiempoAlcance() {
		double tiempo = this.distancia / (this.velocidad2 - this.velocidad1);
		tiempo = tiempo * 60;
		System.out.println("Tardarán en encontrarse " + tiempo + " minutos. ");	
	}

}
