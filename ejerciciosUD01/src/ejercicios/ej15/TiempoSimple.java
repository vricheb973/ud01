package ejercicios.ej15;

public class TiempoSimple {
	
	private int minutos;
	
	public TiempoSimple(int minutos) {
		this.minutos = minutos;
	}
	
	public void getMinutos() {
		System.out.println(this.minutos);
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public void mostrarHorasMinutos() {
		int horas = this.minutos / 60;
		int minutos = this.minutos % 60;
		
		System.out.println("Son " + horas + "h y " + minutos + " minutos. ");
	}

}
