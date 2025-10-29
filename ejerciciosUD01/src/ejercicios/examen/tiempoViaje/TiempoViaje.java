package ejercicios.examen.tiempoViaje;

/*
 * Cruce de vehículos
 * 	Clase: TiempoViaje
 * 	Atributos: distancia (int) en kilómetros, velocidadMedia (int) en km/h
 * 	Método: calcularTiempo(): Calcula y muestra el tiempo que tarda en llegar 
 * 	en minutos usando las fórmulas:
 * 	Tiempo en horas = distancia / velocidadMedia
 * 	OJO, el tiempo resultante está en horas y tendremos que pasarlo a minutos.
 * 	Clase Main: Solicita distancia y velocidad, crea el objeto y muestra el tiempo calculado.
 */

public class TiempoViaje {
	
	private int distancia;
	private int velocidadMedia;
	
	public TiempoViaje(int distancia, int velocidadMedia) {
		this.distancia = distancia;
		this.velocidadMedia = velocidadMedia;
	}
	
	public void getDistancia() {
		System.out.println(this.distancia);
	}
	
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	
	public void getVelocidadMedia() {
		System.out.println(this.velocidadMedia);
	}
	
	public void setVelocidadMedia(int velocidadMedia) {
		this.velocidadMedia = velocidadMedia;
	}
	
	public void calcularTiempo() {
		double horas = (this.distancia* 1.0 / this.velocidadMedia);
		double minutos = horas * 60;
		System.out.printf("Tardas %.2f minutos. \n", minutos);
	}
	

}
