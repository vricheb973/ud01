package ejercicios.ej17;

import ejercicios.ej16.TiempoCompleto;

public class ViajeCiclista {
	
	/*
	 *  horaSalida (int), minutoSalida (int), 
	 *  segundoSalida (int), tiempoTotalSegundos (int)
	 */
	
	private int horaSalida;
	private int minutoSalida;
	private int segundoSalida;
	private int tiempoTotalSegundos;
	
	public ViajeCiclista(int horaSalida, int minutoSalida, int segundoSalida, int tiempoTotalSegundos) {
		this.horaSalida=horaSalida;
		this.minutoSalida=minutoSalida;
		this.segundoSalida=segundoSalida;
		this.tiempoTotalSegundos=tiempoTotalSegundos;
	}
	
	public void getHoraSalida() {
		System.out.println(this.horaSalida);
	}
	
	public void setHoraSalida(int horaSalida) {
		this.horaSalida=horaSalida;
	}
	
	public void getMinutoSalida() {
		System.out.println(this.minutoSalida);
	}
	
	public void setMinutoSalida(int minutoSalida) {
		this.minutoSalida=minutoSalida;
	}
	
	public void getSegundoSalida() {
		System.out.println(this.segundoSalida);
	}
	
	public void setSegundoSalida(int segundoSalida) {
		this.segundoSalida=segundoSalida;
	}
	
	public void getTiempoTotalSegundos() {
		System.out.println(this.tiempoTotalSegundos);
	}
	
	public void setTiempoTotalSegundos(int tiempoTotalSegundos) {
		this.tiempoTotalSegundos=tiempoTotalSegundos;
	}
	
	//Aquí lo hacemos desde cero
	public void mostrarHoraLlegada() {
		// HH:mm:ss    tS
		int segundosLlegada = this.horaSalida * 3600 + this.minutoSalida * 60 + this.segundoSalida + this.tiempoTotalSegundos;

		int segundos = segundosLlegada % 60; 
		int minutos = (segundosLlegada / 60) % 60;
		int horas = (segundosLlegada / 3600) % 24;
		
		System.out.println("Llega a las " + horas + "h, " + minutos + " minutos y " + segundos + " segundos. ");
	}
	
	//Aquí reaprovechamos la clase anterior
	public void mostrarHoraLlegada2() {
		// HH:mm:ss    tS
		int segundosLlegada = this.horaSalida * 3600 + this.minutoSalida * 60 + this.segundoSalida + this.tiempoTotalSegundos;

		TiempoCompleto t1 = new TiempoCompleto(segundosLlegada);
		t1.mostrarHorasMinutosSegundos();
	}

}
