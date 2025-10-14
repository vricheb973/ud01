package ejercicios.ej05;

public class EvaluacionTest {

	private int correctas;
	private int incorrectas;
	private int blanco;
	
	public EvaluacionTest(int correctas, int incorrectas, int blanco) {
		this.correctas = correctas;
		this.incorrectas = incorrectas;
		this.blanco = blanco;
	}
	
	public void getCorrectas() {
		System.out.println(this.correctas);
	}
	
	public void setCorrectas(int correctas) {
		this.correctas = correctas;
	}
	
	public void getIncorrectas() {
		System.out.println(this.incorrectas);
	}
	
	public void setIncorrectas(int incorrectas) {
		this.incorrectas = incorrectas;
	}
	
	public void getBlanco() {
		System.out.println(this.blanco);
	}
	
	public void setBlanco(int blanco) {
		this.blanco = blanco;
	}
	
	public void calcularNotaFinal() {
		int notaFinal = this.correctas*5 + this.incorrectas*-1 + this.blanco*0;
		int notaMaxima = (this.correctas+this.incorrectas+this.blanco)*5;
		System.out.println("La nota final es " + notaFinal + "/" + notaMaxima); 
	}
	
	
	
	
	
	
	
	
	
	
	

}
