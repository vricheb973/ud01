package ejercicios.ej16;

public class TiempoCompleto {
	
	private int segundos;
	
	public TiempoCompleto(int minutos) {
		this.segundos = minutos;
	}
	
	public void getSegundos() {
		System.out.println(this.segundos);
	}
	
	public void setSegundos(int minutos) {
		this.segundos = minutos;
	}
	
	public void mostrarHorasMinutosSegundos() {
		int segundos = this.segundos % 60; 
		int minutos = (this.segundos / 60) % 60;
		int horas = this.segundos / 3600;
		
		
		System.out.println("Son " + horas + "h, " + minutos + " minutos y " + segundos + " segundos. ");
	}

}
