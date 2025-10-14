package ejercicios.ej09;

public class NotaExamenes {
	
	private double nota1;
	private double mediaDeseada;
	
	public NotaExamenes(double nota1, double mediaDeseada) {
		this.nota1 = nota1;
		this.mediaDeseada = mediaDeseada;
	}
	
	public void getNota1() {
		System.out.println(this.nota1);
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void getMediaDeseada() {
		System.out.println(this.mediaDeseada);
	}
	
	public void setMediaDeseada(double mediaDeseada) {
		this.mediaDeseada = mediaDeseada;
	}
	
	public void calcularNotaNecesaria() {
		double nota2 = (mediaDeseada - (nota1 * 0.4)) / 0.6;
		System.out.printf("Nota necesaria en el 2º examen: %.2f \n", nota2);
	}
	
}
